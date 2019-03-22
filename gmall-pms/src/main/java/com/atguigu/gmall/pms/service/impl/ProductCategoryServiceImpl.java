package com.atguigu.gmall.pms.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.atguigu.gmall.pms.entity.Product;
import com.atguigu.gmall.pms.entity.ProductCategory;
import com.atguigu.gmall.pms.mapper.ProductCategoryMapper;
import com.atguigu.gmall.pms.service.ProductCategoryService;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * 产品分类 服务实现类
 * </p>
 *
 * @author Lfy
 * @since 2019-03-19
 */
@Service
@Component
public class ProductCategoryServiceImpl extends ServiceImpl<ProductCategoryMapper, ProductCategory> implements ProductCategoryService {

   /* @Autowired
    Product product;
*/
    @Override
    public Product getProductById(Long id) {
        ProductCategoryMapper productCategoryMapper = getBaseMapper();

        return null;
    }

   /* @Override
    public boolean removeProductById(Long id) {
        ProductCategory productCategory = baseMapper.selectById(id);
        Long parentId = productCategory.getParentId();
        if (StringUtils.isEmpty(parentId)){
           product.getDeleteStatus();
        }
        Integer count = baseMapper.deleteById(id);
        return null != count && count > 0;
    }*/

    @Override
    public Map<String, Object> pageProductCategory(Integer pageSize, Integer pageNum) {
        ProductCategoryMapper productCategoryMapper = getBaseMapper();
        Page<ProductCategory> productCategoryPage = new Page<>(pageNum,pageSize);
        //去数据库分页查询
        IPage<ProductCategory> selectPage = baseMapper.selectPage(productCategoryPage, null);

        //封装数据
        Map<String,Object> map = new HashMap<>();
        map.put("pageSize",pageSize);
        map.put("totalPage",selectPage.getPages());
        map.put("total",selectPage.getTotal());
        map.put("pageNum",selectPage.getCurrent());
        map.put("list",selectPage.getRecords());

        return map;

    }
}
