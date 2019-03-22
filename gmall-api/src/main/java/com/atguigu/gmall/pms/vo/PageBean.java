package com.atguigu.gmall.pms.vo;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class PageBean<T> implements Serializable {

    private static final long serialVersionUID = 1L;
    private Long pageSize;//每页显示的记录数
    private Long totalPage;//总页数
    private Long total;//总记录数
    private Long pageNum;//当前页数
    private List<T> list;//每页显示数据的集合

}
