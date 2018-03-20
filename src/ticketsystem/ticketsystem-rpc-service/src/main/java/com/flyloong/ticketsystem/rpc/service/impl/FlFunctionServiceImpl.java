package com.flyloong.ticketsystem.rpc.service.impl;

import com.flyloong.common.annotation.BaseService;
import com.flyloong.common.base.BaseServiceImpl;
import com.flyloong.ticketsystem.dao.mapper.FlFunctionMapper;
import com.flyloong.ticketsystem.dao.model.FlFunction;
import com.flyloong.ticketsystem.dao.model.FlFunctionExample;
import com.flyloong.ticketsystem.rpc.api.FlFunctionService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
* FlFunctionService实现
* Created by flyloong on 2018/3/20.
*/
@Service
@Transactional
@BaseService
public class FlFunctionServiceImpl extends BaseServiceImpl<FlFunctionMapper, FlFunction, FlFunctionExample> implements FlFunctionService {

    private static final Logger LOGGER = LoggerFactory.getLogger(FlFunctionServiceImpl.class);

    @Autowired
    FlFunctionMapper flFunctionMapper;

}