package dao;

import entitys.OrderForm;
import entitys.ShoopingCart;
import entitys.UserData;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.mapping.FetchType;

import java.util.List;

/**
 * 购物车操作
 * @author 植杨爽
 */
public interface ShoopDao {
    /**
     * 添加到购物车
     * @param shoopingCart
     */
    @Insert("insert into shooping_cart(u_id,produce_id,num),values(" +
            "#{shoop.userData.userId}," +
            "#{shoop.produce.prodId})," +
            "#{shoop.num}")
    void addShoop(@Param("shoop") ShoopingCart shoopingCart);

    /**
     * 删除购物车商品
     * @param shoopingCart
     */
    @Delete("delete from shooping_cart where u_id=#{shoop.userData.userId} and shooping_cart_id=#{shoop.shoopingCart}")
    void deleteShoop(@Param("shoop") ShoopingCart shoopingCart);


//    @Results(id = "userData", value = {
//            @Result(javaType = UserData.class,property = "userId",column = "u_id")
//    })
    /**
     * 查看购物车
     * @Param 用户数据类用于搜索用户对应购物车
     * @return
     * mybatis注解多对多：http://blog.csdn.net/linhaiyun_ytdx/article/details/68947739
     */
    @Select(value = "select * from shooping_cart where u_id=#{userDate.userId}")
    @Results(id = "shoopingCart",value = {
            @Result(javaType = ShoopingCart.class,
                    property = "shoopingCartId",column = "shooping_cart_id"),
            @Result(javaType = ShoopingCart.class,//one反回一个对象类型
                    property = "userData",column = "u_id",one = @One(select = "dao.UserDao.selectProduce")),
            @Result(javaType = ShoopingCart.class,//many反回复杂类型约等于一个集合类型
                    property = "produce",column = "produce_id",many = @Many(select = "dao.UserDao.selectUserData",fetchType = FetchType.EAGER)),
            @Result(javaType = ShoopingCart.class,
                    property = "num",column = "num")

            })
    List<ShoopingCart> selectShoop(@Param("userData") UserData userData);

    /**
     * 更新购物车中的数量
     * @param shoopingCart
     */
    @Update("update shooping_cart set shooping_cart=#{shopingCart.num} where u_id=#{shoopingCart.userData.userId}")
    void updateShoop(ShoopingCart shoopingCart);
}
