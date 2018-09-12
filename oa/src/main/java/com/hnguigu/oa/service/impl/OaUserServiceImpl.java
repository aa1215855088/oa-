package com.hnguigu.oa.service.impl;

import com.hnguigu.oa.dao.OaUserMapper;
import com.hnguigu.oa.domain.OaUser;
import com.hnguigu.oa.service.OaUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @program: oa
 * @description: ${description}
 * @author: 徐子楼
 * @create: 2018-08-26 20:42
 **/
@Service
@Transactional
public class OaUserServiceImpl implements OaUserService {
    @Autowired
    private OaUserMapper oaUserMapper;


    @Override
    public OaUser getByUsername(String username) {
        return this.oaUserMapper.getUserByName(username);
    }

    @Override
    public List<OaUser> listAll() {
        return this.oaUserMapper.listAll();
    }
}
