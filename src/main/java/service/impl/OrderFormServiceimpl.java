package service.impl;

import dao.OrderFormDao;
import entitys.OrderForm;
import entitys.UserData;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import service.OrderFormService;

import javax.annotation.Resource;
import java.util.List;



/**
 * 服务类
 * @author Administrator zys
 * Repository:次注解为对数据访问层bean如果加上(value="*")则表示让spring创建一个名为*的对应此类实例
 * Repository中默认参数表示创建一个类名为userService的对象
 *
 * Transactional注解：PROPAGATION_为枚举类型.nested一下的写法为--->如果当前存在事务，则创建一个事务作为当前事务的
 * 嵌套事务来运行；如果当前没有事务，则该取值等价于TransactionDefinition.PROPAGATION_REQUIRED
 *
 *  timeout = 设置事务超时时间默认为none没有时间规定，参数为Int单位是秒
 * isolation = 是可选的事务隔离级别枚举型
 * rollbackfor = 导致事务回滚的异常 可以指定那些异常触发回滚操作，
 *
 */
@Transactional(propagation = Propagation.NESTED, timeout = 1000, isolation = Isolation.READ_COMMITTED, rollbackFor = Exception.class)
@Service("orderFormService")
public class OrderFormServiceimpl implements OrderFormService {
    //注入一个订单操作类
    //@Resource(name = "orderFormDao")
    private OrderFormDao orderFormDao;


    /**
     * 添加一个订单
     *
     * @param orderForm
     */
    public void addOrderFrom(OrderForm orderForm) {
        //保存订单
        orderFormDao.addOrderFrom(orderForm);
    }

    /**
     * 删除一个订单
     *
     * @param orderForm
     */
    public void deleteOrderFrom(OrderForm orderForm) {

    }

    /**
     * 查询所有订单
     *
     * @return
     */
    @Override
    public List<OrderForm> selectOrderForm(UserData ud) {
        return orderFormDao.selectOrderForm(ud);
    }
}
