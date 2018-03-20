package com.flyloong.ticketsystem.rpc.service.impl;

import com.flyloong.common.annotation.BaseService;
import com.flyloong.common.base.BaseServiceImpl;
import com.flyloong.ticketsystem.dao.mapper.FlCityMapper;
import com.flyloong.ticketsystem.dao.model.FlCity;
import com.flyloong.ticketsystem.dao.model.FlCityExample;
import com.flyloong.ticketsystem.rpc.api.FlCityService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
* FlCityService实现
* Created by flyloong on 2018/3/20.
*/
@Service
@Transactional
@BaseService
public class FlCityServiceImpl extends BaseServiceImpl<FlCityMapper, FlCity, FlCityExample> implements FlCityService {

    private static final Logger LOGGER = LoggerFactory.getLogger(FlCityServiceImpl.class);

    @Autowired
    FlCityMapper flCityMapper;

}