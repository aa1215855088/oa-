package com.hnguigu.oa.service;

import com.hnguigu.oa.domain.OaPrivilege;
import com.hnguigu.oa.domain.OaRole;

import java.util.List;

/**
 * @program: oa
 * @description: ${description}
 * @author: 徐子楼
 * @create: 2018-08-28 16:22
 **/
public interface OaPrivilegeService {
    /**
     * 查询角色的权限
     *
     * @param role
     * @return
     */
    List<OaPrivilege> findPricilegeByRole(OaRole role);
}
