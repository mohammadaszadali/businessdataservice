package com.techm.designer.bean;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "actionParam")
public class ActionParam {
	private String valueType;
	private String paramName;
	private String paramValue;
	private String packageName;
	private String beanClass;
	private String listVarId;
	private String description;
	
	public String getValueType() {
		return valueType;
	}
	public void setValueType(String valueType) {
		this.valueType = valueType;
	}
	public String getParamName() {
		return paramName;
	}
	public String getListVarId() {
		return listVarId;
	}
	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}
	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}
	public void setListVarId(String listVarId) {
		this.listVarId = listVarId;
	}
	public void setParamName(String paramName) {
		this.paramName = paramName;
	}
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
	public String getParamValue() {
		return paramValue;
	}
	public void setParamValue(String paramValue) {
		this.paramValue = paramValue;
	}	
	
	/*private void syso() {
		// TODO Auto-generated method stub

	}*/
}
