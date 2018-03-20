package com.flyloong.ticketsystem.rpc.api;

import com.flyloong.common.base.BaseServiceMock;
import com.flyloong.ticketsystem.dao.mapper.FlLogMapper;
import com.flyloong.ticketsystem.dao.model.FlLog;
import com.flyloong.ticketsystem.dao.model.FlLogExample;

/**
* 降级实现FlLogService接口
* Created by flyloong on 2018/3/20.
*/
public class FlLogServiceMock extends BaseServiceMock<FlLogMapper, FlLog, FlLogExample> implements FlLogService {

}
