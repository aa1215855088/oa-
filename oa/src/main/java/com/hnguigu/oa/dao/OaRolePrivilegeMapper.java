package com.hnguigu.oa.dao;

import com.hnguigu.oa.domain.OaRolePrivilege;
import com.hnguigu.oa.domain.OaRolePrivilegeExample;

import java.util.List;

import com.hnguigu.oa.domain.OaUser;
import org.apache.ibatis.annotations.Param;

public interface OaRolePrivilegeMapper {

    /**
     * 根据查出相对于的角色和权限
     *
     * @param user
     * @return
     */
    OaRolePrivilege findRoleAndPrivilegeByUser(OaUser user);
}