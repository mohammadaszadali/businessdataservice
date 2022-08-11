package com.techm.designer.bean;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
@JsonInclude(Include.NON_EMPTY)
@Document(collection = "dataModel")
public class PackageClassMappingBean {
	@Id
	private String id;
	private Integer appId;
	private String pkg;
	private String className;
	private List<PropertyBean> PropertyBeans;
	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}
	/**
	 * @return the appId
	 */
	public Integer getAppId() {
		return appId;
	}
	/**
	 * @param appId the appId to set
	 */
	public void setAppId(Integer appId) {
		this.appId = appId;
	}
	/**
	 * @return the pkg
	 */
	public String getPkg() {
		return pkg;
	}
	/**
	 * @param pkg the pkg to set
	 */
	public void setPkg(String pkg) {
		this.pkg = pkg;
	}
	/**
	 * @return the className
	 */
	public String getClassName() {
		return className;
	}
	/**
	 * @param className the className to set
	 */
	public void setClassName(String className) {
		this.className = className;
	}
	/**
	 * @return the propertyBeans
	 */
	public List<PropertyBean> getPropertyBeans() {
		return PropertyBeans;
	}
	/**
	 * @param propertyBeans the propertyBeans to set
	 */
	public void setPropertyBeans(List<PropertyBean> propertyBeans) {
		PropertyBeans = propertyBeans;
	}
	
	
	
	
}
