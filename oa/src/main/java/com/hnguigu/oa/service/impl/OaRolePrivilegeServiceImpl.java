package com.hnguigu.oa.service.impl;

import com.hnguigu.oa.dao.OaRolePrivilegeMapper;
import com.hnguigu.oa.domain.OaRolePrivilege;
import com.hnguigu.oa.domain.OaUser;
import com.hnguigu.oa.service.OaRolePrivilegeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @program: oa
 * @description: ${description}
 * @author: 徐子楼
 * @create: 2018-08-27 15:43
 **/
@Service
@Transactional
public class OaRolePrivilegeServiceImpl implements OaRolePrivilegeService {
    @Autowired
    private OaRolePrivilegeMapper oaRolePrivilegeMapper;

    @Override
    public OaRolePrivilege findRoleAndPrivilegeByUser(OaUser user) {
        return oaRolePrivilegeMapper.findRoleAndPrivilegeByUser(user);
    }
}
