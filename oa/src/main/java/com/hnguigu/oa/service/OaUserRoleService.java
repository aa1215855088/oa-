package com.hnguigu.oa.service;

import com.hnguigu.oa.domain.OaRole;
import com.hnguigu.oa.domain.OaUser;

import java.util.List;

/**
 * @program: oa
 * @description: ${description}
 * @author: 徐子楼
 * @create: 2018-08-27 15:24
 **/
public interface OaUserRoleService {
    /**
     * 格局用户查询角色
     *
     * @param oaUser
     * @return
     */
    List<OaRole> findRoleByUser(OaUser oaUser);
}
