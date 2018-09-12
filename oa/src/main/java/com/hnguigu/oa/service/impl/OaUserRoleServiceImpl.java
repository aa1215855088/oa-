package com.hnguigu.oa.service.impl;

import com.hnguigu.oa.dao.OaUserRoleMapper;
import com.hnguigu.oa.domain.OaRole;
import com.hnguigu.oa.domain.OaUser;
import com.hnguigu.oa.domain.OaUserRole;
import com.hnguigu.oa.service.OaUserRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @program: oa
 * @description: ${description}
 * @author: 徐子楼
 * @create: 2018-08-27 15:25
 **/
@Service
@Transactional
public class OaUserRoleServiceImpl implements OaUserRoleService {
    @Autowired
    private OaUserRoleMapper oaUserRoleMapper;

    @Override
    public List<OaRole> findRoleByUser(OaUser oaUser) {
        return this.oaUserRoleMapper.findRoleByUser(oaUser);
    }
}
