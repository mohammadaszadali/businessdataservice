package com.techm.pageBean;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "targetBeanDetails")
public class TargetBeanDetails implements Serializable{

	private String packageName;
	private String beanClass;
	private String beanId;
	private String ajaxRender;
	public String getPackageName() {
		return packageName;
	}
	public void setPackageName(String packageName) {
		this.packageName = packageName;
	}
	public String getBeanClass() {
		return beanClass;
	}
	public void setBeanClass(String beanClass) {
		this.beanClass = beanClass;
	}
	public String getBeanId() {
		return beanId;
	}
	public void setBeanId(String beanId) {
		this.beanId = beanId;
	}
	public String getAjaxRender() {
		return ajaxRender;
	}
	public void setAjaxRender(String ajaxRender) {
		this.ajaxRender = ajaxRender;
	}
	
	
}
