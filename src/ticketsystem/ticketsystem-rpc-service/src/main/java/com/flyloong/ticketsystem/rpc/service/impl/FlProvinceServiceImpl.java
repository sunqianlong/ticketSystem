package com.flyloong.ticketsystem.rpc.service.impl;

import com.flyloong.common.annotation.BaseService;
import com.flyloong.common.base.BaseServiceImpl;
import com.flyloong.ticketsystem.dao.mapper.FlProvinceMapper;
import com.flyloong.ticketsystem.dao.model.FlProvince;
import com.flyloong.ticketsystem.dao.model.FlProvinceExample;
import com.flyloong.ticketsystem.rpc.api.FlProvinceService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
* FlProvinceService实现
* Created by flyloong on 2018/3/20.
*/
@Service
@Transactional
@BaseService
public class FlProvinceServiceImpl extends BaseServiceImpl<FlProvinceMapper, FlProvince, FlProvinceExample> implements FlProvinceService {

    private static final Logger LOGGER = LoggerFactory.getLogger(FlProvinceServiceImpl.class);

    @Autowired
    FlProvinceMapper flProvinceMapper;

}