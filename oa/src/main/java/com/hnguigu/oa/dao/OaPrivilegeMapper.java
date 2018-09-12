package com.hnguigu.oa.dao;

import com.hnguigu.oa.domain.OaPrivilege;
import com.hnguigu.oa.domain.OaPrivilegeExample;
import java.util.List;

import com.hnguigu.oa.domain.OaRole;
import org.apache.ibatis.annotations.Param;

public interface OaPrivilegeMapper {
    long countByExample(OaPrivilegeExample example);

    int deleteByExample(OaPrivilegeExample example);

    int deleteByPrimaryKey(Integer privilegeId);

    int insert(OaPrivilege record);

    int insertSelective(OaPrivilege record);

    List<OaPrivilege> selectByExample(OaPrivilegeExample example);

    OaPrivilege selectByPrimaryKey(Integer privilegeId);

    int updateByExampleSelective(@Param("record") OaPrivilege record, @Param("example") OaPrivilegeExample example);

    int updateByExample(@Param("record") OaPrivilege record, @Param("example") OaPrivilegeExample example);

    int updateByPrimaryKeySelective(OaPrivilege record);

    int updateByPrimaryKey(OaPrivilege record);

    List<OaPrivilege> findPricilegeByRole(OaRole role);
}