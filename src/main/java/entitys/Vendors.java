package entitys;

public class Vendors {
    private Integer vendId;
    private Double vendPrice;
    private String VendAddress;
    private String vendPhone;

    /**
     * 生产厂ID
     */
    public Integer getVendId() {
        return vendId;
    }
    /**
     * 生产厂ID
     */
    public void setVendId(Integer vendId) {
        this.vendId = vendId;
    }
    /**
     * 生产厂价格
     * @return
     */
    public Double getVendPrice() {
        return vendPrice;
    }
    /**
     * 生产厂价格
     */
    public void setVendPrice(Double vendPrice) {
        this.vendPrice = vendPrice;
    }
    /**
     * 生产厂地址
     * @return
     */
    public String getVendAddress() {
        return VendAddress;
    }
    /**
     * 生产厂地址
     * @return
     */
    public void setVendAddress(String vendAddress) {
        VendAddress = vendAddress;
    }
    /**
     * 生产厂电话
     * @return
     */
    public String getVendPhone() {
        return vendPhone;
    }
    /**
     * 生产厂电话
     */
    public void setVendPhone(String vendPhone) {
        this.vendPhone = vendPhone;
    }
}
