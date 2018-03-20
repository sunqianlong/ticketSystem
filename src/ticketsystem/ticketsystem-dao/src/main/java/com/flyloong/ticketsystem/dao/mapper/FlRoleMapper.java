package com.flyloong.ticketsystem.dao.mapper;

import com.flyloong.ticketsystem.dao.model.FlRole;
import com.flyloong.ticketsystem.dao.model.FlRoleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FlRoleMapper {
    long countByExample(FlRoleExample example);

    int deleteByExample(FlRoleExample example);

    int deleteByPrimaryKey(Long id);

    int insert(FlRole record);

    int insertSelective(FlRole record);

    List<FlRole> selectByExample(FlRoleExample example);

    FlRole selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") FlRole record, @Param("example") FlRoleExample example);

    int updateByExample(@Param("record") FlRole record, @Param("example") FlRoleExample example);

    int updateByPrimaryKeySelective(FlRole record);

    int updateByPrimaryKey(FlRole record);
}