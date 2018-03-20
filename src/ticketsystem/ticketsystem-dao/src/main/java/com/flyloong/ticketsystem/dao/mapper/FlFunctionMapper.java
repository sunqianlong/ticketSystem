package com.flyloong.ticketsystem.dao.mapper;

import com.flyloong.ticketsystem.dao.model.FlFunction;
import com.flyloong.ticketsystem.dao.model.FlFunctionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FlFunctionMapper {
    long countByExample(FlFunctionExample example);

    int deleteByExample(FlFunctionExample example);

    int deleteByPrimaryKey(Long id);

    int insert(FlFunction record);

    int insertSelective(FlFunction record);

    List<FlFunction> selectByExample(FlFunctionExample example);

    FlFunction selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") FlFunction record, @Param("example") FlFunctionExample example);

    int updateByExample(@Param("record") FlFunction record, @Param("example") FlFunctionExample example);

    int updateByPrimaryKeySelective(FlFunction record);

    int updateByPrimaryKey(FlFunction record);
}