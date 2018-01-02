package view;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletResponse;

@Controller
/**
 * 订单操作类
 *  @author 植杨爽
 */
@RequestMapping("/orderFormAction")
public class OrderFormAction {

    /**
     * 添加一个订单
     *
     */
    @RequestMapping("/addOrderFrom.action")
    public void addOrderFrom(HttpServletResponse request,HttpServletResponse response) {

    }

    /**
     * 删除一个订单
     */
    @RequestMapping("/deleteOrderFrom.action")
    public void deleteOrderFrom() {

    }
}
