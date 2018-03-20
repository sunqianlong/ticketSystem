package com.flyloong.ticketsystem.rpc.api;

import com.flyloong.common.base.BaseServiceMock;
import com.flyloong.ticketsystem.dao.mapper.FlFunctionMapper;
import com.flyloong.ticketsystem.dao.model.FlFunction;
import com.flyloong.ticketsystem.dao.model.FlFunctionExample;

/**
* 降级实现FlFunctionService接口
* Created by flyloong on 2018/3/20.
*/
public class FlFunctionServiceMock extends BaseServiceMock<FlFunctionMapper, FlFunction, FlFunctionExample> implements FlFunctionService {

}
