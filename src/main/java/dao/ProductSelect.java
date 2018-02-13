package dao;

import entitys.Producet;

import java.util.List;

public interface ProductSelect {
    /**
     * 查询所有商品
     */
    public List<Producet> prodSelect();

    /**
     * 按类别查询
     * @param className
     */
    public List<Producet> prodSelect(String className);
}
