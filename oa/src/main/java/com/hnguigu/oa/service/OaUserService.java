package com.hnguigu.oa.service;

import com.hnguigu.oa.domain.OaUser;

import java.util.List;

/**
 * @program: oa
 * @description: ${description}
 * @author: 徐子楼
 * @create: 2018-08-26 20:42
 **/
public interface OaUserService {
    /**
     * 跟据用户名查询用户
     *
     * @param username
     * @return
     */
    OaUser getByUsername(String username);

    /**
     * 查询所有的用户
     * @return
     */
    List<OaUser> listAll();

}
