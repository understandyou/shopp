package view;

import entitys.Producet;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;
import service.ProductSelectService;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * 用于初始化首页
 * @author 植杨爽
 */
//此方法用于将模型数据放到session中，对应下面sessionAttributes方法
// 第一个参数value：将map中对应的key放到session中
// 第二个参数types：将map中所对应的类型放到session中，例如一下为将所有String型放到session中
//@SessionAttributes(value = {"map的key","..."},types = {String.class})
    @SessionAttributes({"session"})
@Controller
@RequestMapping("/HomeInit")
public class HomeInit {

    @Resource(name = "productSelectService")
    ProductSelectService productSelectService;
    /**
     * 初始化首页
     */
    @RequestMapping("/init.action")
    public ModelAndView init(Map<String,List<?>> productMap){//ModelAndView包含模型数据和目标页面
        ModelAndView modelAndView = new ModelAndView("Home");
        //调用service层返回数据
        List<Producet> producets = productSelectService.prodSelect();
        //加入模型数据
        modelAndView.addObject("producets", producets);
        System.out.println("测试汉字："+producets.get(0).getProdName());
        //将模型数据一并加入到session中
        productMap.put("session",producets);
        return modelAndView;
    }

    /*处理模型数据*/
    /*//直接在参数中加入map对象，spring会主动把map传到目标页面的请求域中
    @RequestMapping("/init.action")
    public String init(Map<String,Object> map){
        map.put("key",new Object());
        return "目标页面";
    }*/
   /* @RequestMapping("/init.action")
    public String SessionAttributes(Map<String,Object> map){
        map.put("key",new Object());
        return "目标页面";
    }*/
}
