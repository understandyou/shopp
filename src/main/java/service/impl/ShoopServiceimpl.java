package service.impl;

import entitys.ShoopingCart;
import org.springframework.stereotype.Repository;
import service.ShoopService;

import java.util.List;

/**
 * @author Administrator zys
 * Repository:次注解为对数据访问层bean如果加上(value="*")则表示让spring创建一个名为*的对应此类实例
 * Repository中默认参数表示创建一个类名为userService的对象
 */
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
