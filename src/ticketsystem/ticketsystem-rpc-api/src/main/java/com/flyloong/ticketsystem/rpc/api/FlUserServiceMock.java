package com.flyloong.ticketsystem.rpc.api;

import com.flyloong.common.base.BaseServiceMock;
import com.flyloong.ticketsystem.dao.mapper.FlUserMapper;
import com.flyloong.ticketsystem.dao.model.FlUser;
import com.flyloong.ticketsystem.dao.model.FlUserExample;

/**
* 降级实现FlUserService接口
* Created by flyloong on 2018/3/20.
*/
public class FlUserServiceMock extends BaseServiceMock<FlUserMapper, FlUser, FlUserExample> implements FlUserService {

}
