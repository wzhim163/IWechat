/**
 * Copyright &copy; 2016-2020 iwechat All rights reserved.
 */
package com.wechat.modules.interfaces.test.entity;

import com.wechat.common.persistence.DataEntity;

public class InterfaceTest extends DataEntity<InterfaceTest> {

	private static final long serialVersionUID = 1L;
	
	private String name;
	private String sax;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSax() {
		return sax;
	}
	public void setSax(String sax) {
		this.sax = sax;
	}
}