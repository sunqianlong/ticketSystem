package com.flyloong.ticketsystem.dao.mapper;

import com.flyloong.ticketsystem.dao.model.FlCompany;
import com.flyloong.ticketsystem.dao.model.FlCompanyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FlCompanyMapper {
    long countByExample(FlCompanyExample example);

    int deleteByExample(FlCompanyExample example);

    int deleteByPrimaryKey(Long id);

    int insert(FlCompany record);

    int insertSelective(FlCompany record);

    List<FlCompany> selectByExample(FlCompanyExample example);

    FlCompany selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") FlCompany record, @Param("example") FlCompanyExample example);

    int updateByExample(@Param("record") FlCompany record, @Param("example") FlCompanyExample example);

    int updateByPrimaryKeySelective(FlCompany record);

    int updateByPrimaryKey(FlCompany record);
}