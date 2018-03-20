package com.flyloong.ticketsystem.dao.mapper;

import com.flyloong.ticketsystem.dao.model.FlCity;
import com.flyloong.ticketsystem.dao.model.FlCityExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FlCityMapper {
    long countByExample(FlCityExample example);

    int deleteByExample(FlCityExample example);

    int deleteByPrimaryKey(Long id);

    int insert(FlCity record);

    int insertSelective(FlCity record);

    List<FlCity> selectByExample(FlCityExample example);

    FlCity selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") FlCity record, @Param("example") FlCityExample example);

    int updateByExample(@Param("record") FlCity record, @Param("example") FlCityExample example);

    int updateByPrimaryKeySelective(FlCity record);

    int updateByPrimaryKey(FlCity record);
}