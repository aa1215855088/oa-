package com.hnguigu.oa.dao;

import com.hnguigu.oa.domain.OaRole;
import com.hnguigu.oa.domain.OaUser;
import com.hnguigu.oa.domain.OaUserRole;
import com.hnguigu.oa.domain.OaUserRoleExample;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface OaUserRoleMapper {
    long countByExample(OaUserRoleExample example);

    int deleteByExample(OaUserRoleExample example);

    int deleteByPrimaryKey(Integer userRoleId);

    int insert(OaUserRole record);

    int insertSelective(OaUserRole record);

    List<OaUserRole> selectByExample(OaUserRoleExample example);

    OaUserRole selectByPrimaryKey(Integer userRoleId);

    int updateByExampleSelective(@Param("record") OaUserRole record, @Param("example") OaUserRoleExample example);

    int updateByExample(@Param("record") OaUserRole record, @Param("example") OaUserRoleExample example);

    int updateByPrimaryKeySelective(OaUserRole record);

    int updateByPrimaryKey(OaUserRole record);


    List<OaRole> findRoleByUser(OaUser oaUser);
}