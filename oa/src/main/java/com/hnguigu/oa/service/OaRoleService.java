package com.hnguigu.oa.service;

import com.hnguigu.oa.domain.OaRole;

import java.util.List;

/**
 * @program: oa
 * @description: ${description}
 * @author: 徐子楼
 * @create: 2018-08-27 15:37
 **/
public interface OaRoleService {
    /**
     * 批量查询角色
     *
     * @param ids
     * @return
     */
    List<OaRole> listRoleByIds(List<Integer> ids);
}
