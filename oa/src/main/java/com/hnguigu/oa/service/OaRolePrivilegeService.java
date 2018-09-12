package com.hnguigu.oa.service;

import com.hnguigu.oa.domain.OaRolePrivilege;
import com.hnguigu.oa.domain.OaUser;

import java.util.List;

/**
 * @program: oa
 * @description: ${description}
 * @author: 徐子楼
 * @create: 2018-08-27 15:43
 **/
public interface OaRolePrivilegeService {
    /**
     * 查询用户的角色和权限
     *
     * @param user
     * @return
     */
    OaRolePrivilege findRoleAndPrivilegeByUser(OaUser user);
}
