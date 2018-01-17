package dao;

import entitys.OrderForm;
import entitys.ShoopingCart;
import entitys.UserData;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.mapping.FetchType;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 购物车操作
 * @author 植杨爽
 */
//@Repository("shoopDao")
public interface ShoopDao {
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
     * @Param 用户数据类用于搜索用户对应购物车
     * @return
     * mybatis注解多对多：http://blog.csdn.net/linhaiyun_ytdx/article/details/68947739
     */
    List<ShoopingCart> selectShoop(UserData userData);

    /**
     * 更新购物车中的数量
     * @param shoopingCart
     */
    void updateShoop(ShoopingCart shoopingCart);
}
