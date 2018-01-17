package dao;


import entitys.OrderForm;
import entitys.ShoopingCart;
import entitys.UserData;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.List;

/**
 * 订单操作类
 * @author 植杨爽
 */
//@Repository(value = "orderFormDao")
public interface OrderFormDao {
    //Param表示给它后面的参数取名方便在注解中使用此名字，如果不写的话应该是使用的参数默认名字(没有测试过)
    void addOrderFrom(OrderForm orderForm);

    void deleteOrderFrom(OrderForm orderForm);


    /**
     * 查看所有订单
     * @Param 用户数据类用于搜索用户对应订单
     * @return
     */
    List<OrderForm> selectOrderForm(UserData userData);



}
