/**
 * Copyright &copy; 2016-2020 iwechat All rights reserved.
 */
package com.wechat.modules.sys.dao;

import java.util.List;

import com.wechat.common.persistence.CrudDao;
import com.wechat.common.persistence.annotation.MyBatisDao;
import com.wechat.modules.sys.entity.Menu;

/**
 * 菜单DAO接口
 * @author iwechat
 * @version 2017-05-16
 */
@MyBatisDao
public interface MenuDao extends CrudDao<Menu> {

	public List<Menu> findByParentIdsLike(Menu menu);

	public List<Menu> findByUserId(Menu menu);
	
	public int updateParentIds(Menu menu);
	
	public int updateSort(Menu menu);
	
}
