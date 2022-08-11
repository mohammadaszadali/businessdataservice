package com.techm.designer.dto.page;

import javax.xml.bind.annotation.XmlRootElement;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
@XmlRootElement(name = "rule")
@JsonIgnoreProperties(ignoreUnknown=true)
public class Rule {
	private String ruleName;
	private String beanId;
	private String isBeanClass;
	private String packageName;
	private String beanDataType;
	private String beanClass;
	
	public String getRuleName() {
		return ruleName;
	}
	public void setRuleName(String ruleName) {
		this.ruleName = ruleName;
	}
	public String getBeanId() {
		return beanId;
	}
	public void setBeanId(String beanId) {
		this.beanId = beanId;
	}
	public String getIsBeanClass() {
		return isBeanClass;
	}
	public void setIsBeanClass(String isBeanClass) {
		this.isBeanClass = isBeanClass;
	}
	public String getPackageName() {
		return packageName;
	}
	public void setPackageName(String packageName) {
		this.packageName = packageName;
	}
	public String getBeanDataType() {
		return beanDataType;
	}
	public void setBeanDataType(String beanDataType) {
		this.beanDataType = beanDataType;
	}
	public String getBeanClass() {
		return beanClass;
	}
	public void setBeanClass(String beanClass) {
		this.beanClass = beanClass;
	}
	
	
}
