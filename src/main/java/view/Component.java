package view;

import entitys.Producet;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;
import java.util.List;
import java.util.Map;

/**
 * 用于处理其他各种请求
 */
@Controller
@RequestMapping("/component")
public class Component {
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
}
