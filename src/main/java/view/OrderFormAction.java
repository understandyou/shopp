package view;

import dao.OrderFormDao;
import entitys.OrderForm;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import service.OrderFormService;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;

@Controller
/**
 * 订单操作类
 *  @author 植杨爽
 */
@RequestMapping("/orderFormAction")
public class OrderFormAction {
   // @Resource()
    //private OrderForm orderForm;

    //使用spring注入需要的数据访问层
    @Resource(name = "orderFormService")
    private OrderFormService orderFormService;
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

    /**
     * 查询所有订单
     */
    @RequestMapping("/selectOrderFrom.action")
    public void selectOrderFrom() {

    }
}
