package entitys;

import org.springframework.stereotype.Repository;

@Repository
public class Vendors {
    private Integer vendId;
    private Double vendName;
    private String VendAddress;
    private String vendPhone;

    /**
     * 生产厂名字
     * @return
     */
    public Double getVendName() {
        return vendName;
    }

    /**
     * 生产厂名字
     * @param vendName
     */
    public void setVendName(Double vendName) {
        this.vendName = vendName;
    }

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
