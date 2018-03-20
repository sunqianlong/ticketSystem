package com.flyloong.ticketsystem.rpc.service.impl;

import com.flyloong.common.annotation.BaseService;
import com.flyloong.common.base.BaseServiceImpl;
import com.flyloong.ticketsystem.dao.mapper.FlCompanyMapper;
import com.flyloong.ticketsystem.dao.model.FlCompany;
import com.flyloong.ticketsystem.dao.model.FlCompanyExample;
import com.flyloong.ticketsystem.rpc.api.FlCompanyService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
* FlCompanyService实现
* Created by flyloong on 2018/3/20.
*/
@Service
@Transactional
@BaseService
public class FlCompanyServiceImpl extends BaseServiceImpl<FlCompanyMapper, FlCompany, FlCompanyExample> implements FlCompanyService {

    private static final Logger LOGGER = LoggerFactory.getLogger(FlCompanyServiceImpl.class);

    @Autowired
    FlCompanyMapper flCompanyMapper;

}