package com.atguigu.gmall.pms.service;

import com.atguigu.gmall.pms.entity.Product;
import com.atguigu.gmall.pms.entity.ProductCategory;
import com.atguigu.gmall.to.PmsProductCategoryWithChildrenItem;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;
import java.util.Map;

/**
 * <p>
 * 产品分类 服务类
 * </p>
 *
 * @author Lfy
 * @since 2019-03-19
 */
public interface ProductCategoryService extends IService<ProductCategory> {

    Product getProductById(Long id);

    //boolean removeProductById(Long id);

    Map<String,Object> pageProductCategory(Integer pageSize, Integer pageNum);

    //查询所有一级分类及子分类
    List<PmsProductCategoryWithChildrenItem> listWithChildren();
}
