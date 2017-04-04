/**
 * Copyright &copy; 2016-2020 iwechat All rights reserved.
 */
package com.wechat.test.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.wechat.common.persistence.TreeEntity;

import javax.validation.constraints.NotNull;

/**
 * 树结构生成Entity
 * @author iwechat
 * @version 2017-04-06
 */
public class TestTree extends TreeEntity<TestTree> {
	
	private static final long serialVersionUID = 1L;
	private TestTree parent;		// 父级编号
	private String parentIds;		// 所有父级编号
	private String name;		// 名称
	private Integer sort;		// 排序
	
	public TestTree() {
		super();
	}

	public TestTree(String id){
		super(id);
	}

	@JsonBackReference
	@NotNull(message="父级编号不能为空")
	public TestTree getParent() {
		return parent;
	}

	public void setParent(TestTree parent) {
		this.parent = parent;
	}
	
	public String getParentIds() {
		return parentIds;
	}

	public void setParentIds(String parentIds) {
		this.parentIds = parentIds;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	@NotNull(message="排序不能为空")
	public Integer getSort() {
		return sort;
	}

	public void setSort(Integer sort) {
		this.sort = sort;
	}
	
	public String getParentId() {
		return parent != null && parent.getId() != null ? parent.getId() : "0";
	}
}