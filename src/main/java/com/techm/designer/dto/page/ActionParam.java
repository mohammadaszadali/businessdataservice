package com.techm.designer.dto.page;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "actionParam")
@JsonIgnoreProperties(ignoreUnknown=true)
public class ActionParam {
	private String valueType;
	private String paramName;
	private String paramValue;
	private String packageName;
	private String beanClass;
	private String listVarId;
	
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
