package service;

import entitys.Producet;

import java.util.List;

public interface ProductSelectService {
    /**
     * 查询所有商品
     * @return
     */
    public List<Producet> prodSelect();

    /**
     * 查询指定类型商品
     * @param className 商品类型
     * @return
     */
    public List<Producet> prodSelect(String className);
}
