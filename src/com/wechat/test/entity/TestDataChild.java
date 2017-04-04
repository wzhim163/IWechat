/**
 * Copyright &copy; 2016-2020 iwechat All rights reserved.
 */
package com.wechat.test.entity;

import com.wechat.common.persistence.DataEntity;

/**
 * 主子表生成Entity
 * @author iwechat
 * @version 2017-04-06
 */
public class TestDataChild extends DataEntity<TestDataChild> {
	
	private static final long serialVersionUID = 1L;
	private TestDataMain testDataMain;		// 业务主表 父类
	private String name;		// 名称
	
	public TestDataChild() {
		super();
	}

	public TestDataChild(String id){
		super(id);
	}

	public TestDataChild(TestDataMain testDataMain){
		this.testDataMain = testDataMain;
	}

	public TestDataMain getTestDataMain() {
		return testDataMain;
	}

	public void setTestDataMain(TestDataMain testDataMain) {
		this.testDataMain = testDataMain;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}