/**
 * Copyright &copy; 2016-2020 iwechat All rights reserved.
 */
package com.wechat.modules.gen.dao;

import com.wechat.common.persistence.CrudDao;
import com.wechat.common.persistence.annotation.MyBatisDao;
import com.wechat.modules.gen.entity.GenScheme;

/**
 * 生成方案DAO接口
 * @author iwechat
 * @version 2017-10-15
 */
@MyBatisDao
public interface GenSchemeDao extends CrudDao<GenScheme> {
	
}
