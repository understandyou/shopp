package view;

import entitys.ShoopingCart;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * 购物车view
 * @author 植杨爽
 */
@Controller
@RequestMapping("/shoopAction")
public class ShoopAction{

    /**
     * 添加到购物车
     *
     */
    @RequestMapping("/addShoop.action")
    public void addShoop() {

    }

    /**
     * 删除购物车商品
     *
     */
    @RequestMapping("/deleteShoop.action")
    public void deleteShoop() {

    }

    /**
     * 查看购物车
     *
     */
    @RequestMapping("/selectShoop.action")
    public List<ShoopingCart> selectShoop() {
        return null;
    }

    /**
     * 更新购物车中的数量
     *
     */
    @RequestMapping("/updateShoop.action")
    public void updateShoop() {

    }
}
