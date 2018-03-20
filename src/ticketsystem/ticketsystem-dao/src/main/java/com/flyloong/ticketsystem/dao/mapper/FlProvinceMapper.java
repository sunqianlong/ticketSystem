package com.flyloong.ticketsystem.dao.mapper;

import com.flyloong.ticketsystem.dao.model.FlProvince;
import com.flyloong.ticketsystem.dao.model.FlProvinceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FlProvinceMapper {
    long countByExample(FlProvinceExample example);

    int deleteByExample(FlProvinceExample example);

    int deleteByPrimaryKey(Long id);

    int insert(FlProvince record);

    int insertSelective(FlProvince record);

    List<FlProvince> selectByExample(FlProvinceExample example);

    FlProvince selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") FlProvince record, @Param("example") FlProvinceExample example);

    int updateByExample(@Param("record") FlProvince record, @Param("example") FlProvinceExample example);

    int updateByPrimaryKeySelective(FlProvince record);

    int updateByPrimaryKey(FlProvince record);
}