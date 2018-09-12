package com.hnguigu.oa.dao;

import com.hnguigu.oa.domain.OaUser;
import com.hnguigu.oa.domain.OaUserExample;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface OaUserMapper {
    long countByExample(OaUserExample example);

    int deleteByExample(OaUserExample example);

    int deleteByPrimaryKey(Integer userId);

    int insert(OaUser record);

    int insertSelective(OaUser record);

    List<OaUser> selectByExample(OaUserExample example);

    OaUser selectByPrimaryKey(Integer userId);

    int updateByExampleSelective(@Param("record") OaUser record, @Param("example") OaUserExample example);

    int updateByExample(@Param("record") OaUser record, @Param("example") OaUserExample example);

    int updateByPrimaryKeySelective(OaUser record);

    int updateByPrimaryKey(OaUser record);

    OaUser getUserByName(String username);

    List<OaUser> listAll();

}