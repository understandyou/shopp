package dao;


import entitys.OrderForm;
import entitys.ShoopingCart;
import entitys.UserData;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 订单操作类
 * @author 植杨爽
 */
/*@Repository*/
public interface OrderFormDao {
    //Param表示给它后面的参数取名方便在注解中使用此名字，如果不写的话应该是使用的参数默认名字(没有测试过)
    @Insert("insert into order_form(u_id,prod_id,order_price) values(#{orderForm.userId},#{orderForm.prodId},#{orderFrom.orderPrice})")
    void addOrderFrom(@Param("orderFrom") OrderForm orderForm);
    @Delete("delete from order_form where order_form_id=#{orderForm.userId}")
    void deleteOrderFrom(@Param("orderForm") OrderForm orderForm);


    /**
     * 查看所有订单
     * @Param 用户数据类用于搜索用户对应购物车
     * @return
     */
    @Select(value = "select * from order_form where u_id=#{userDate.userId}")
    @Results(id = "OrderForm",value = {
            @Result(javaType = OrderForm.class,
                    property = "orderFormId",column = "order_form_id"),
            @Result(javaType = OrderForm.class,
                    property = "userId",column = "u_id"),
            @Result(javaType = OrderForm.class,
                    property = "prodId",column = "prod_id"),
            @Result(javaType = OrderForm.class,
                    property = "orderPrice",column = "order_price")
    })
    List<OrderForm> selectOrderForm(@Param("userData") UserData userData);



}
