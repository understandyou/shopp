package service;

import entitys.OrderForm;
import entitys.UserData;

import java.util.List;

/**
 * 订单操作类
 */
public interface OrderFormService {
    /**
     * 添加一个订单
     * @param orderForm
     */
    void addOrderFrom(OrderForm orderForm);

    /**
     * 删除一个订单
     * @param orderForm
     */
    void deleteOrderFrom(OrderForm orderForm);

    /**
     * 查询所有订单
     * @return
     */
    List<OrderForm> selectOrderForm(UserData ud);

}
