package entitys;

public class OrderForm {
    private Integer orderFormId;
    private Integer userId;
    private Integer prodId;
    private Double orderPrice;

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
     * 订单对应的用户ID
     * @return
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * 订单对应的用户ID
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * 订单对应的商品ID
     * @return
     */
    public Integer getProdId() {
        return prodId;
    }

    /**
     * 订单对应的商品ID
     */
    public void setProdId(Integer prodId) {
        this.prodId = prodId;
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
