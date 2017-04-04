/**
 * Copyright &copy; 2016-2020 iwechat All rights reserved.
 */
package com.wechat.modules.sys.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.wechat.common.service.TreeService;
import com.wechat.modules.sys.dao.AreaDao;
import com.wechat.modules.sys.entity.Area;
import com.wechat.modules.sys.utils.UserUtils;

/**
 * 区域Service
 * @author iwechat
 * @version 2017-05-16
 */
@Service
@Transactional(readOnly = true)
public class AreaService extends TreeService<AreaDao, Area> {

	public List<Area> findAll(){
		return UserUtils.getAreaList();
	}

	@Transactional(readOnly = false)
	public void save(Area area) {
		super.save(area);
		UserUtils.removeCache(UserUtils.CACHE_AREA_LIST);
	}
	
	@Transactional(readOnly = false)
	public void delete(Area area) {
		super.delete(area);
		UserUtils.removeCache(UserUtils.CACHE_AREA_LIST);
	}
	
}
