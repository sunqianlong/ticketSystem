package com.flyloong.ticketsystem.rpc.service.impl;

import com.flyloong.common.annotation.BaseService;
import com.flyloong.common.base.BaseServiceImpl;
import com.flyloong.ticketsystem.dao.mapper.FlDictionaryMapper;
import com.flyloong.ticketsystem.dao.model.FlDictionary;
import com.flyloong.ticketsystem.dao.model.FlDictionaryExample;
import com.flyloong.ticketsystem.rpc.api.FlDictionaryService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
* FlDictionaryService实现
* Created by flyloong on 2018/3/20.
*/
@Service
@Transactional
@BaseService
public class FlDictionaryServiceImpl extends BaseServiceImpl<FlDictionaryMapper, FlDictionary, FlDictionaryExample> implements FlDictionaryService {

    private static final Logger LOGGER = LoggerFactory.getLogger(FlDictionaryServiceImpl.class);

    @Autowired
    FlDictionaryMapper flDictionaryMapper;

}