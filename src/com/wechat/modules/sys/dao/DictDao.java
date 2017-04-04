/**
 * Copyright &copy; 2016-2020 iwechat All rights reserved.
 */
package com.wechat.modules.sys.dao;

import java.util.List;

import com.wechat.common.persistence.CrudDao;
import com.wechat.common.persistence.annotation.MyBatisDao;
import com.wechat.modules.sys.entity.Dict;

/**
 * 字典DAO接口
 * @author iwechat
 * @version 2017-05-16
 */
@MyBatisDao
public interface DictDao extends CrudDao<Dict> {

	public List<String> findTypeList(Dict dict);
	
}
