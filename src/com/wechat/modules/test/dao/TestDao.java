/**
 * Copyright &copy; 2016-2020 iwechat All rights reserved.
 */
package com.wechat.modules.test.dao;

import com.wechat.common.persistence.CrudDao;
import com.wechat.common.persistence.annotation.MyBatisDao;
import com.wechat.modules.test.entity.Test;

/**
 * 测试DAO接口
 * @author iwechat
 * @version 2017-10-17
 */
@MyBatisDao
public interface TestDao extends CrudDao<Test> {
	
}
