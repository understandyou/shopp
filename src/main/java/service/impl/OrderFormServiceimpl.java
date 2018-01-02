package service.impl;

import entitys.OrderForm;
import org.springframework.stereotype.Repository;
import service.OrderFormService;

/**
 * @author Administrator zys
 * Repository:次注解为对数据访问层bean如果加上(value="*")则表示让spring创建一个名为*的对应此类实例
 * Repository中默认参数表示创建一个类名为userService的对象
 */
@Repository("orderFormService")
public class OrderFormServiceimpl implements OrderFormService {

    /**
     * 添加一个订单
     *
     * @param orderForm
     */
    public void addOrderFrom(OrderForm orderForm) {

    }

    /**
     * 删除一个订单
     *
     * @param orderForm
     */
    public void deleteOrderFrom(OrderForm orderForm) {

    }
}
