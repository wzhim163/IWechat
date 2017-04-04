/**
 * Copyright &copy; 2016-2020 iwechat All rights reserved.
 */
package com.wechat.modules.test.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.wechat.common.service.CrudService;
import com.wechat.modules.test.dao.TestDao;
import com.wechat.modules.test.entity.Test;

/**
 * 测试Service
 * @author iwechat
 * @version 2017-10-17
 */
@Service
@Transactional(readOnly = true)
public class TestService extends CrudService<TestDao, Test> {

}
