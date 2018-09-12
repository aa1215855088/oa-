package com.hnguigu.oa.dao;

import com.hnguigu.oa.domain.OaDepartment;
import com.hnguigu.oa.domain.OaDepartmentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OaDepartmentMapper {
    long countByExample(OaDepartmentExample example);

    int deleteByExample(OaDepartmentExample example);

    int deleteByPrimaryKey(Integer departmentId);

    int insert(OaDepartment record);

    int insertSelective(OaDepartment record);

    List<OaDepartment> selectByExample(OaDepartmentExample example);

    OaDepartment selectByPrimaryKey(Integer departmentId);

    int updateByExampleSelective(@Param("record") OaDepartment record, @Param("example") OaDepartmentExample example);

    int updateByExample(@Param("record") OaDepartment record, @Param("example") OaDepartmentExample example);

    int updateByPrimaryKeySelective(OaDepartment record);

    int updateByPrimaryKey(OaDepartment record);

    List<OaDepartment> findAll();

}