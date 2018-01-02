package entitys;

public class Produce {
    private Integer prodId;
    private Double prodCurrent;
    private Double prodPrice;
    private String prodDescribe;
    private Vendors vendors;

    /**
     * 商品ID
     */
    public Integer getProdId() {
        return prodId;
    }
    /**
     * 商品ID
     */
    public void setProdId(Integer prodId) {
        this.prodId = prodId;
    }
    /**
     * 商品现价
     */
    public Double getProdCurrent() {
        return prodCurrent;
    }
    /**
     * 商品现价
     */
    public void setProdCurrent(Double prodCurrent) {
        this.prodCurrent = prodCurrent;
    }
    /**
     * 商品出厂价
     */
    public Double getProdPrice() {
        return prodPrice;
    }
    /**
     * 商品出厂价
     */
    public void setProdPrice(Double prodPrice) {
        this.prodPrice = prodPrice;
    }
    /**
     * 商品描述
     */
    public String getProdDescribe() {
        return prodDescribe;
    }
    /**
     * 商品描述
     */
    public void setProdDescribe(String prodDescribe) {
        this.prodDescribe = prodDescribe;
    }
    /**
     * 商品厂商详情
     * @return
     */
    public Vendors getVendors() {
        return vendors;
    }
    /**
     * 商品厂商详情
     */
    public void setVendors(Vendors vendors) {
        this.vendors = vendors;
    }
}
