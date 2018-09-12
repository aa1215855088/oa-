package com.hnguigu.oa.service.impl;

import com.hnguigu.oa.dao.OaRoleMapper;
import com.hnguigu.oa.domain.OaRole;
import com.hnguigu.oa.service.OaRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @program: oa
 * @description: ${description}
 * @author: 徐子楼
 * @create: 2018-08-27 15:37
 **/
@Service
@Transactional
public class OaRoleServiceImpl implements OaRoleService {
    @Autowired
    private OaRoleMapper oaRoleMapper;

    @Override
    public List<OaRole> listRoleByIds(List<Integer> ids) {
        return this.oaRoleMapper.selectByIds(ids);
    }
}
