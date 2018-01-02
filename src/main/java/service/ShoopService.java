package service;

import entitys.ShoopingCart;

import java.util.List;

/**
 * 购物车操作
 */
public interface ShoopService {
    /**
     * 添加到购物车
     * @param shoopingCart
     */
    void addShoop(ShoopingCart shoopingCart);

    /**
     * 删除购物车商品
     * @param shoopingCart
     */
    void deleteShoop(ShoopingCart shoopingCart);

    /**
     * 查看购物车
     * @return
     */
    List<ShoopingCart> selectShoop();

    /**
     * 更新购物车中的数量
     * @param shoopingCart
     */
    void updateShoop(ShoopingCart shoopingCart);
}
