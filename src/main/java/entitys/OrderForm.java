package entitys;

import org.springframework.stereotype.Repository;

@Repository
public class OrderForm {
    private Integer orderFormId;
    private UserData userData;
    private Producet Producet;
    private Double orderPrice;
    private UserInfor userInfor;

    /**
     * 用户详细信息
     * @return
     */
    public UserInfor getUserInfor() {
        return userInfor;
    }

    /**
     * 用户详细信息
     * @param userInfor
     */
    public void setUserInfor(UserInfor userInfor) {
        this.userInfor = userInfor;
    }

    /**
     * 用户信息
     * @return
     */
    public UserData getUserData() {
        return userData;
    }

    /**
     * 用户信息
     * @param userData
     */
    public void setUserData(UserData userData) {
        this.userData = userData;
    }

    /**
     * 商品
     * @return
     */
    public Producet getProducet() {
        return Producet;
    }

    /**
     * 商品
     * @param producet
     */
    public void setProducet(Producet producet) {
        Producet = producet;
    }

    /**
     * 订单ID
     * @return
     */
    public Integer getOrderFormId() {
        return orderFormId;
    }

    /**
     * 订单ID
     * @param orderFormId
     */
    public void setOrderFormId(Integer orderFormId) {
        this.orderFormId = orderFormId;
    }


    /**
     * 订单的成交价
     * @return
     */
    public Double getOrderPrice() {
        return orderPrice;
    }

    /**
     * 订单的成交价
     */
    public void setOrderPrice(Double orderPrice) {
        this.orderPrice = orderPrice;
    }
}
