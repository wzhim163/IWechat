/**
 * Copyright &copy; 2016-2020 iwechat All rights reserved.
 */
package com.wechat.common.utils.excel.fieldtype;

import com.wechat.common.utils.StringUtils;
import com.wechat.modules.sys.entity.Area;
import com.wechat.modules.sys.utils.UserUtils;

/**
 * 字段类型转换
 * @author iwechat
 * @version 2017-03-10
 */
public class AreaType {

	/**
	 * 获取对象值（导入）
	 */
	public static Object getValue(String val) {
		for (Area e : UserUtils.getAreaList()){
			if (StringUtils.trimToEmpty(val).equals(e.getName())){
				return e;
			}
		}
		return null;
	}

	/**
	 * 获取对象值（导出）
	 */
	public static String setValue(Object val) {
		if (val != null && ((Area)val).getName() != null){
			return ((Area)val).getName();
		}
		return "";
	}
}
