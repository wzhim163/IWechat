/**
 * Copyright &copy; 2016-2020 iwechat All rights reserved.
 */
package com.wechat.common.utils.excel.fieldtype;

import com.wechat.common.utils.StringUtils;
import com.wechat.modules.sys.entity.Office;
import com.wechat.modules.sys.utils.UserUtils;

/**
 * 字段类型转换
 * @author iwechat
 * @version 2017-03-10
 */
public class OfficeType {

	/**
	 * 获取对象值（导入）
	 */
	public static Object getValue(String val) {
		for (Office e : UserUtils.getOfficeList()){
			if (StringUtils.trimToEmpty(val).equals(e.getName())){
				return e;
			}
		}
		return null;
	}

	/**
	 * 设置对象值（导出）
	 */
	public static String setValue(Object val) {
		if (val != null && ((Office)val).getName() != null){
			return ((Office)val).getName();
		}
		return "";
	}
}
