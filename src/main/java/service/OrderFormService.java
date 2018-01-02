package service;

import entitys.OrderForm;

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

}
