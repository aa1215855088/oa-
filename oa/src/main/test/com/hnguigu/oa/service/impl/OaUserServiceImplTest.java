package com.hnguigu.oa.service.impl;

import com.hnguigu.oa.domain.OaUser;
import com.hnguigu.oa.service.OaUserService;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.Assert.*;

/**
 * @program: oa
 * @description: ${description}
 * @author: 徐子楼
 * @create: 2018-08-27 19:52
 **/
public class OaUserServiceImplTest extends BaseTest {

    @Autowired
    private OaUserService oaUserService;

    @Test
    public void getByUsername() {
        OaUser byUsername = this.oaUserService.getByUsername("123");
        System.out.println(byUsername);
    }
}
