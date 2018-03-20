package com.flyloong.ticketsystem.dao.mapper;

import com.flyloong.ticketsystem.dao.model.FlPrivilege;
import com.flyloong.ticketsystem.dao.model.FlPrivilegeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FlPrivilegeMapper {
    long countByExample(FlPrivilegeExample example);

    int deleteByExample(FlPrivilegeExample example);

    int deleteByPrimaryKey(Long id);

    int insert(FlPrivilege record);

    int insertSelective(FlPrivilege record);

    List<FlPrivilege> selectByExample(FlPrivilegeExample example);

    FlPrivilege selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") FlPrivilege record, @Param("example") FlPrivilegeExample example);

    int updateByExample(@Param("record") FlPrivilege record, @Param("example") FlPrivilegeExample example);

    int updateByPrimaryKeySelective(FlPrivilege record);

    int updateByPrimaryKey(FlPrivilege record);
}