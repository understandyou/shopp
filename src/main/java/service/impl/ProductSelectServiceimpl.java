package service.impl;

import dao.ProductSelect;
import entitys.Producet;
import org.springframework.stereotype.Repository;
import service.ProductSelectService;

import javax.annotation.Resource;
import java.util.List;
@Repository("productSelectService")
public class ProductSelectServiceimpl implements ProductSelectService {

    //注入一个商品查询类
    @Resource(name = "productSelect")
    private ProductSelect productSelect;
    /**
     * 查询所有商品
     *
     * @return
     */
    @Override
    public List<Producet> prodSelect() {
        //调用dao层进行查询
        return productSelect.prodSelect();
    }

    /**
     * 查询指定类型商品
     *
     * @param className 商品类型
     * @return
     */
    @Override
    public List<Producet> prodSelect(String className) {
        return null;
    }
}
