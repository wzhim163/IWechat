/**
 * Copyright &copy; 2016-2020 iwechat All rights reserved.
 */
package com.wechat.modules.sys.dao;

import com.wechat.common.persistence.CrudDao;
import com.wechat.common.persistence.annotation.MyBatisDao;
import com.wechat.modules.sys.entity.Log;

/**
 * 日志DAO接口
 * @author iwechat
 * @version 2017-05-16
 */
@MyBatisDao
public interface LogDao extends CrudDao<Log> {

}
