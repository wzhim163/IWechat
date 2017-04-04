/**
 * Copyright &copy; 2016-2020 iwechat All rights reserved.
 */
package com.wechat.test.entity;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.List;
import com.google.common.collect.Lists;
import com.wechat.common.persistence.DataEntity;
import com.wechat.modules.sys.entity.Area;
import com.wechat.modules.sys.entity.Office;
import com.wechat.modules.sys.entity.User;

/**
 * 主子表生成Entity
 * @author iwechat
 * @version 2017-04-06
 */
public class TestDataMain extends DataEntity<TestDataMain> {
	
	private static final long serialVersionUID = 1L;
	private User user;		// 归属用户
	private Office office;		// 归属部门
	private Area area;		// 归属区域
	private String name;		// 名称
	private String sex;		// 性别
	private Date inDate;		// 加入日期
	private List<TestDataChild> testDataChildList = Lists.newArrayList();		// 子表列表
	
	public TestDataMain() {
		super();
	}

	public TestDataMain(String id){
		super(id);
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
	public Office getOffice() {
		return office;
	}

	public void setOffice(Office office) {
		this.office = office;
	}
	
	public Area getArea() {
		return area;
	}

	public void setArea(Area area) {
		this.area = area;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}
	
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	public Date getInDate() {
		return inDate;
	}

	public void setInDate(Date inDate) {
		this.inDate = inDate;
	}
	
	public List<TestDataChild> getTestDataChildList() {
		return testDataChildList;
	}

	public void setTestDataChildList(List<TestDataChild> testDataChildList) {
		this.testDataChildList = testDataChildList;
	}
}