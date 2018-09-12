package com.hnguigu.oa.service.impl;

import com.hnguigu.oa.dao.OaDepartmentMapper;
import com.hnguigu.oa.domain.OaDepartment;
import com.hnguigu.oa.service.OaDepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @program: oa
 * @description: ${description}
 * @author: 徐子楼
 * @create: 2018-08-28 15:45
 **/
@Service
@Transactional
public class OaDepartmentServiceImpl implements OaDepartmentService {

    @Autowired
    private OaDepartmentMapper oaDepartmentMapper;

    @Override
    public List<OaDepartment> findAll() {
        return this.oaDepartmentMapper.findAll();
    }
}
