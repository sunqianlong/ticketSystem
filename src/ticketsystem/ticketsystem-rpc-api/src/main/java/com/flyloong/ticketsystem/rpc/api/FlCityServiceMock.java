package com.flyloong.ticketsystem.rpc.api;

import com.flyloong.common.base.BaseServiceMock;
import com.flyloong.ticketsystem.dao.mapper.FlCityMapper;
import com.flyloong.ticketsystem.dao.model.FlCity;
import com.flyloong.ticketsystem.dao.model.FlCityExample;

/**
* 降级实现FlCityService接口
* Created by flyloong on 2018/3/20.
*/
public class FlCityServiceMock extends BaseServiceMock<FlCityMapper, FlCity, FlCityExample> implements FlCityService {

}
