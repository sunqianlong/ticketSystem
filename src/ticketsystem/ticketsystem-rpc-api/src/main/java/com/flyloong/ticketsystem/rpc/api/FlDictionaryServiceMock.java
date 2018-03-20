package com.flyloong.ticketsystem.rpc.api;

import com.flyloong.common.base.BaseServiceMock;
import com.flyloong.ticketsystem.dao.mapper.FlDictionaryMapper;
import com.flyloong.ticketsystem.dao.model.FlDictionary;
import com.flyloong.ticketsystem.dao.model.FlDictionaryExample;

/**
* 降级实现FlDictionaryService接口
* Created by flyloong on 2018/3/20.
*/
public class FlDictionaryServiceMock extends BaseServiceMock<FlDictionaryMapper, FlDictionary, FlDictionaryExample> implements FlDictionaryService {

}
