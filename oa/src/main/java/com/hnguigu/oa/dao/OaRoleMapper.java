package com.hnguigu.oa.dao;

import com.hnguigu.oa.domain.OaRole;
import com.hnguigu.oa.domain.OaRoleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OaRoleMapper {
    long countByExample(OaRoleExample example);

    int deleteByExample(OaRoleExample example);

    int deleteByPrimaryKey(Integer roleId);

    int insert(OaRole record);

    int insertSelective(OaRole record);

    List<OaRole> selectByExample(OaRoleExample example);

    OaRole selectByPrimaryKey(Integer roleId);

    int updateByExampleSelective(@Param("record") OaRole record, @Param("example") OaRoleExample example);

    int updateByExample(@Param("record") OaRole record, @Param("example") OaRoleExample example);

    int updateByPrimaryKeySelective(OaRole record);

    int updateByPrimaryKey(OaRole record);

    List<OaRole> selectByIds(List<Integer> ids);
}