package view;

import dao.UserDao;
import entitys.Producet;
import entitys.UserData;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;
import service.UserService;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/**
 * 用于处理其他各种请求
 */
@Controller
@SessionAttributes(types = {String.class})
@RequestMapping("/component")
public class Component {
    @Resource(name = "userService")
    private UserService userService;
    /**
     * 商品详细页面
     */
    @RequestMapping(value = "/xiangxi.action")
    public ModelAndView xiangXi(HttpSession session, @RequestParam(value = "prodId") Integer prodId){
        System.out.println("---------进入-------------");
        System.out.println("id值为："+prodId);
        ModelAndView modelAndView = null;
        //获得商品数据
        List<Producet> products = (List<Producet>) session.getAttribute("session");
        for(Producet producet:products){

            if(producet.getProdId()==prodId)
            {
                modelAndView = new ModelAndView("/commodity/commoditys");
                //将对应的模型数据添加到请求域中
                modelAndView.addObject(producet);
                break;
            }
        }
        return modelAndView;
    }

    /**
     * 用户登录
     */
    @RequestMapping("/login.action")
    public ModelAndView login(Map<String,Object> map,UserData userData, HttpServletRequest request) throws IOException {
        ModelAndView modelAndView = null;
        Integer userId = userService.loginUserData(userData);
        if (userId!=null)
        {
            System.out.println("正确地址："+request.getParameter("redirect"));
//            modelAndView = new ModelAndView(request.getParameter("redirect"));
            modelAndView = new ModelAndView("forward:/Home.jsp");
            map.put("userName", userData.getUserName());
            //加入模型数据
            modelAndView.addObject(map);
        }else {
            //String url = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort();
//            modelAndView = new ModelAndView("/userView/login?redirect="+request.getParameter("redirect"));
            modelAndView = new ModelAndView("redirect:/userView/login");
        }
        return  modelAndView;
    }
}
