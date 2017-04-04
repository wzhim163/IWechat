/**
 * Copyright &copy; 2016-2020 iwechat All rights reserved.
 */
package com.wechat.modules.sys.dao;

import com.wechat.common.persistence.TreeDao;
import com.wechat.common.persistence.annotation.MyBatisDao;
import com.wechat.modules.sys.entity.Area;

/**
 * 区域DAO接口
 * @author iwechat
 * @version 2017-05-16
 */
@MyBatisDao
public interface AreaDao extends TreeDao<Area> {
	
}
