package com.flyloong.ticketsystem.rpc.service.impl;

import com.flyloong.common.annotation.BaseService;
import com.flyloong.common.base.BaseServiceImpl;
import com.flyloong.ticketsystem.dao.mapper.FlPrivilegeMapper;
import com.flyloong.ticketsystem.dao.model.FlPrivilege;
import com.flyloong.ticketsystem.dao.model.FlPrivilegeExample;
import com.flyloong.ticketsystem.rpc.api.FlPrivilegeService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
* FlPrivilegeService实现
* Created by flyloong on 2018/3/20.
*/
@Service
@Transactional
@BaseService
public class FlPrivilegeServiceImpl extends BaseServiceImpl<FlPrivilegeMapper, FlPrivilege, FlPrivilegeExample> implements FlPrivilegeService {

    private static final Logger LOGGER = LoggerFactory.getLogger(FlPrivilegeServiceImpl.class);

    @Autowired
    FlPrivilegeMapper flPrivilegeMapper;

}