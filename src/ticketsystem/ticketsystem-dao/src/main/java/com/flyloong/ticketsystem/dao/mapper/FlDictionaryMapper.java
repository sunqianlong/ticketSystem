package com.flyloong.ticketsystem.dao.mapper;

import com.flyloong.ticketsystem.dao.model.FlDictionary;
import com.flyloong.ticketsystem.dao.model.FlDictionaryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FlDictionaryMapper {
    long countByExample(FlDictionaryExample example);

    int deleteByExample(FlDictionaryExample example);

    int deleteByPrimaryKey(Long id);

    int insert(FlDictionary record);

    int insertSelective(FlDictionary record);

    List<FlDictionary> selectByExample(FlDictionaryExample example);

    FlDictionary selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") FlDictionary record, @Param("example") FlDictionaryExample example);

    int updateByExample(@Param("record") FlDictionary record, @Param("example") FlDictionaryExample example);

    int updateByPrimaryKeySelective(FlDictionary record);

    int updateByPrimaryKey(FlDictionary record);
}