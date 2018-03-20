package com.flyloong.ticketsystem.rpc.api;

import com.flyloong.common.base.BaseServiceMock;
import com.flyloong.ticketsystem.dao.mapper.FlCompanyMapper;
import com.flyloong.ticketsystem.dao.model.FlCompany;
import com.flyloong.ticketsystem.dao.model.FlCompanyExample;

/**
* 降级实现FlCompanyService接口
* Created by flyloong on 2018/3/20.
*/
public class FlCompanyServiceMock extends BaseServiceMock<FlCompanyMapper, FlCompany, FlCompanyExample> implements FlCompanyService {

}
