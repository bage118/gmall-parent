package com.atguigu.gmall.to;


import com.atguigu.gmall.pms.entity.ProductCategory;
import lombok.Data;

import java.util.List;

/**
 */
@Data
public class PmsProductCategoryWithChildrenItem extends ProductCategory {


    //每个分类里面都有自己的子分类
    private List<PmsProductCategoryWithChildrenItem> children;

}
