package com.atguigu.gmall.pms.service;

import com.atguigu.gmall.pms.entity.Brand;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.Map;

/**
 * <p>
 * 品牌表 服务类
 * </p>
 *
 * @author Lfy
 * @since 2019-03-19
 */
public interface BrandService extends IService<Brand> {

    //根据品牌名称分页获取品牌列表
    Map<String,Object> pageBrand(String keyword, Integer pageNum, Integer pageSize);

    //获取所有商品品牌
    Brand listAll();

}
