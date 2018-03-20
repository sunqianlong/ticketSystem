package com.flyloong.ticketsystem.rpc.api;

import com.flyloong.common.base.BaseServiceMock;
import com.flyloong.ticketsystem.dao.mapper.FlRoleMapper;
import com.flyloong.ticketsystem.dao.model.FlRole;
import com.flyloong.ticketsystem.dao.model.FlRoleExample;

/**
* 降级实现FlRoleService接口
* Created by flyloong on 2018/3/20.
*/
public class FlRoleServiceMock extends BaseServiceMock<FlRoleMapper, FlRole, FlRoleExample> implements FlRoleService {

}
