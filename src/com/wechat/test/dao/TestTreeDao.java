/**
 * Copyright &copy; 2016-2020 iwechat All rights reserved.
 */
package com.wechat.test.dao;

import com.wechat.common.persistence.TreeDao;
import com.wechat.common.persistence.annotation.MyBatisDao;
import com.wechat.test.entity.TestTree;

/**
 * 树结构生成DAO接口
 * @author iwechat
 * @version 2017-04-06
 */
@MyBatisDao
public interface TestTreeDao extends TreeDao<TestTree> {
	
}