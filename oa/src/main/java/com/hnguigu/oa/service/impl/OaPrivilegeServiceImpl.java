package com.hnguigu.oa.service.impl;

import com.hnguigu.oa.dao.OaPrivilegeMapper;
import com.hnguigu.oa.domain.OaPrivilege;
import com.hnguigu.oa.domain.OaRole;
import com.hnguigu.oa.service.OaPrivilegeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @program: oa
 * @description: ${description}
 * @author: 徐子楼
 * @create: 2018-08-28 16:22
 **/
@Service
@Transactional
public class OaPrivilegeServiceImpl implements OaPrivilegeService {
    @Autowired
    private OaPrivilegeMapper oaPrivilegeMapper;

    @Override
    public List<OaPrivilege> findPricilegeByRole(OaRole role) {
        return this.oaPrivilegeMapper.findPricilegeByRole(role);
    }
}
