package service.impl;

import entitys.ShoopingCart;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import service.ShoopService;

import java.util.List;

/**
 * @author Administrator zys
 * Repository:次注解为对数据访问层bean如果加上(value="*")则表示让spring创建一个名为*的对应此类实例
 * Repository中默认参数表示创建一个类名为userService的对象
* Transactional注解：PROPAGATION_为枚举类型.nested一下的写法为--->如果当前存在事务，则创建一个事务作为当前事务的
        * 嵌套事务来运行；如果当前没有事务，则该取值等价于TransactionDefinition.PROPAGATION_REQUIRED
        *
        *  timeout = 设置事务超时时间默认为none没有时间规定，参数为Int单位是秒
        * isolation = 是可选的事务隔离级别枚举型
        * rollbackfor = 导致事务回滚的异常 可以指定那些异常触发回滚操作，
        *
        */
@Transactional(propagation = Propagation.NESTED, timeout = 1000, isolation = Isolation.READ_COMMITTED, rollbackFor = Exception.class)
@Repository("shoopService")
public class ShoopServiceimpl implements ShoopService{
    /**
     * 添加到购物车
     *
     * @param shoopingCart
     */
    public void addShoop(ShoopingCart shoopingCart) {

    }

    /**
     * 删除购物车商品
     *
     * @param shoopingCart
     */
    public void deleteShoop(ShoopingCart shoopingCart) {

    }

    /**
     * 查看购物车
     *
     * @return
     */
    public List<ShoopingCart> selectShoop() {
        return null;
    }

    /**
     * 更新购物车中的数量
     *
     * @param shoopingCart
     */
    public void updateShoop(ShoopingCart shoopingCart) {

    }
}
