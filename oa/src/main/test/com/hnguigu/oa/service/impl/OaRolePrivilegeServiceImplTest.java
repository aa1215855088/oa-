package com.hnguigu.oa.service.impl;

import com.hnguigu.oa.domain.OaRolePrivilege;
import com.hnguigu.oa.domain.OaUser;
import com.hnguigu.oa.domain.OaUserRole;
import com.hnguigu.oa.service.OaRolePrivilegeService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.Assert.*;

/**
 * @program: oa
 * @description: ${description}
 * @author: 徐子楼
 * @create: 2018-08-27 16:03
 **/
public class OaRolePrivilegeServiceImplTest extends BaseTest {


    @Autowired
    private OaRolePrivilegeService oaRolePrivilegeService;

    @Test
    public void testfindRoleAndPrivilegeByUser() {
        OaUser oaUser = new OaUser();
        oaUser.setUserId(7);
        OaRolePrivilege roleAndPrivilegeByUser = oaRolePrivilegeService.findRoleAndPrivilegeByUser(oaUser);
        System.out.println(roleAndPrivilegeByUser);
    }
}