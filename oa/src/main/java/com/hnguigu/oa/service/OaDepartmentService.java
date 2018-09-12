package com.hnguigu.oa.service;

import com.hnguigu.oa.domain.OaDepartment;

import java.util.List;

/**
 * @program: oa
 * @description: ${description}
 * @author: 徐子楼
 * @create: 2018-08-28 15:44
 **/
public interface OaDepartmentService {
    /**
     * 查询所有部门
     * @return
     */
    List<OaDepartment> findAll();
}
