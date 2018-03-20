package com.flyloong.ticketsystem.rpc.service.impl;

import com.flyloong.common.annotation.BaseService;
import com.flyloong.common.base.BaseServiceImpl;
import com.flyloong.ticketsystem.dao.mapper.FlRoleMapper;
import com.flyloong.ticketsystem.dao.model.FlRole;
import com.flyloong.ticketsystem.dao.model.FlRoleExample;
import com.flyloong.ticketsystem.rpc.api.FlRoleService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
* FlRoleService实现
* Created by flyloong on 2018/3/20.
*/
@Service
@Transactional
@BaseService
public class FlRoleServiceImpl extends BaseServiceImpl<FlRoleMapper, FlRole, FlRoleExample> implements FlRoleService {

    private static final Logger LOGGER = LoggerFactory.getLogger(FlRoleServiceImpl.class);

    @Autowired
    FlRoleMapper flRoleMapper;

}