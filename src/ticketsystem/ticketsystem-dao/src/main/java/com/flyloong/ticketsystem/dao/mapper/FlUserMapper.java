package com.flyloong.ticketsystem.dao.mapper;

import com.flyloong.ticketsystem.dao.model.FlUser;
import com.flyloong.ticketsystem.dao.model.FlUserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FlUserMapper {
    long countByExample(FlUserExample example);

    int deleteByExample(FlUserExample example);

    int deleteByPrimaryKey(Long id);

    int insert(FlUser record);

    int insertSelective(FlUser record);

    List<FlUser> selectByExample(FlUserExample example);

    FlUser selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") FlUser record, @Param("example") FlUserExample example);

    int updateByExample(@Param("record") FlUser record, @Param("example") FlUserExample example);

    int updateByPrimaryKeySelective(FlUser record);

    int updateByPrimaryKey(FlUser record);
}