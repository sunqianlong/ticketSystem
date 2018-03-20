package com.flyloong.ticketsystem.dao.mapper;

import com.flyloong.ticketsystem.dao.model.FlLog;
import com.flyloong.ticketsystem.dao.model.FlLogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FlLogMapper {
    long countByExample(FlLogExample example);

    int deleteByExample(FlLogExample example);

    int deleteByPrimaryKey(Long id);

    int insert(FlLog record);

    int insertSelective(FlLog record);

    List<FlLog> selectByExample(FlLogExample example);

    FlLog selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") FlLog record, @Param("example") FlLogExample example);

    int updateByExample(@Param("record") FlLog record, @Param("example") FlLogExample example);

    int updateByPrimaryKeySelective(FlLog record);

    int updateByPrimaryKey(FlLog record);
}