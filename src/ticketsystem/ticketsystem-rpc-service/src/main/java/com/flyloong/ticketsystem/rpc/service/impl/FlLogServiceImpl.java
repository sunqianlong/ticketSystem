package com.flyloong.ticketsystem.rpc.service.impl;

import com.flyloong.common.annotation.BaseService;
import com.flyloong.common.base.BaseServiceImpl;
import com.flyloong.ticketsystem.dao.mapper.FlLogMapper;
import com.flyloong.ticketsystem.dao.model.FlLog;
import com.flyloong.ticketsystem.dao.model.FlLogExample;
import com.flyloong.ticketsystem.rpc.api.FlLogService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
* FlLogService实现
* Created by flyloong on 2018/3/20.
*/
@Service
@Transactional
@BaseService
public class FlLogServiceImpl extends BaseServiceImpl<FlLogMapper, FlLog, FlLogExample> implements FlLogService {

    private static final Logger LOGGER = LoggerFactory.getLogger(FlLogServiceImpl.class);

    @Autowired
    FlLogMapper flLogMapper;

}