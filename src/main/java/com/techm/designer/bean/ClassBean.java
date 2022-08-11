package com.techm.designer.bean;

import java.util.List;

import org.bson.types.Binary;
import org.springframework.data.annotation.Id;

public class ClassBean {
	@Id
	private String id;
	private String className;
	private List<PropertyBean> propertyBeans;	
	private List<PropertyBean> propertyBeanList;	
	private Binary classfile;
	
	
	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	public List<PropertyBean> getPropertyBeanList() {
		return propertyBeanList;
	}

	public void setPropertyBeanList(List<PropertyBean> propertyBeanList) {
		this.propertyBeanList = propertyBeanList;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}

	public String getClassName() {
		return className;
	}

	public void setClassName(String className) {
		this.className = className;
	}

	public List<PropertyBean> getPropertyBeans() {
		return propertyBeans;
	}

	public void setPropertyBeans(List<PropertyBean> propertyBeans) {
		this.propertyBeans = propertyBeans;
	}

	public Binary getClassfile() {
		return classfile;
	}

	public void setClassfile(Binary classfile) {
		this.classfile = classfile;
	}

	
	
	

}
