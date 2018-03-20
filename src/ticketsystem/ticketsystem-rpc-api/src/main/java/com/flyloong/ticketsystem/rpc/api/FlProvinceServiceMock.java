package com.flyloong.ticketsystem.rpc.api;

import com.flyloong.common.base.BaseServiceMock;
import com.flyloong.ticketsystem.dao.mapper.FlProvinceMapper;
import com.flyloong.ticketsystem.dao.model.FlProvince;
import com.flyloong.ticketsystem.dao.model.FlProvinceExample;

/**
* 降级实现FlProvinceService接口
* Created by flyloong on 2018/3/20.
*/
public class FlProvinceServiceMock extends BaseServiceMock<FlProvinceMapper, FlProvince, FlProvinceExample> implements FlProvinceService {

}
