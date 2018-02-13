package entitys;

import org.springframework.stereotype.Repository;

/**
 * 购物车bean
 */
@Repository
public class ShoopingCart {
    private Integer  shoopingCartId;
    private UserData userData;
    private Producet producet;
    private Integer num;

    /**
     * 加入的数量
     * @return
     */
    public Integer getNum() {
        return num;
    }

    /**
     * 加入的数量
     * @param num
     */
    public void setNum(Integer num) {
        this.num = num;
    }

    /**
     * 购物车ID
     * @return
     */
    public Integer getShoopingCart() {
        return shoopingCartId;
    }

    /**
     * 购物车ID
     * @param shoopingCart
     */
    public void setShoopingCart(Integer shoopingCart) {
        this.shoopingCartId = shoopingCart;
    }

    /**
     * 购物车中的用户数据
     * @return
     */
    public UserData getUserData() {
        return userData;
    }

    /**
     * 购物车中的用户数据
     */
    public void setUserData(UserData userData) {
        this.userData = userData;
    }

    /**
     * 购物车中的商品信息
     * @return
     */
    public Producet getProducet() {
        return producet;
    }

    /**
     * 购物车中的商品信息
     */
    public void setProducet(Producet producet) {
        this.producet = producet;
    }
}
