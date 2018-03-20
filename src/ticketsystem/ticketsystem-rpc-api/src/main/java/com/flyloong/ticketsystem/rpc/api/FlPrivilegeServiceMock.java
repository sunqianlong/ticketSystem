package com.flyloong.ticketsystem.rpc.api;

import com.flyloong.common.base.BaseServiceMock;
import com.flyloong.ticketsystem.dao.mapper.FlPrivilegeMapper;
import com.flyloong.ticketsystem.dao.model.FlPrivilege;
import com.flyloong.ticketsystem.dao.model.FlPrivilegeExample;

/**
* 降级实现FlPrivilegeService接口
* Created by flyloong on 2018/3/20.
*/
public class FlPrivilegeServiceMock extends BaseServiceMock<FlPrivilegeMapper, FlPrivilege, FlPrivilegeExample> implements FlPrivilegeService {

}
