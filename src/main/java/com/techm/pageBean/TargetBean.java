package com.techm.pageBean;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "targetBean")
@JsonInclude(Include.NON_NULL)
public class TargetBean {

	private static final long serialVersionUID = 1L;
	
	private String targetBeanClass;
	private String targetBeanId;
	private String targetValue;
	
	public String getTargetBeanClass() {
		return targetBeanClass;
	}
	public void setTargetBeanClass(String targetBeanClass) {
		this.targetBeanClass = targetBeanClass;
	}
	public String getTargetBeanId() {
		return targetBeanId;
	}
	public void setTargetBeanId(String targetBeanId) {
		this.targetBeanId = targetBeanId;
	}
	public String getTargetValue() {
		return targetValue;
	}
	public void setTargetValue(String targetValue) {
		this.targetValue = targetValue;
	}
	
	
}
