package com.techm.designer.dto.page;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "dataBinding")
@JsonIgnoreProperties(ignoreUnknown=true)
public class DataBinding {
	
	private String packageName;
	private String beanClass;
	private String beanId;
	private String listVarId;
	private Boolean isListVarId;
	private String rdKey;
	private String rdVal;
	/**
	 * @return the packageName
	 */
	public String getPackageName() {
		return packageName;
	}
	/**
	 * @param packageName the packageName to set
	 */
	public void setPackageName(String packageName) {
		this.packageName = packageName;
	}
	/**
	 * @return the beanClass
	 */
	public String getBeanClass() {
		return beanClass;
	}
	/**
	 * @param beanClass the beanClass to set
	 */
	public void setBeanClass(String beanClass) {
		this.beanClass = beanClass;
	}
	
	
	public String getBeanId() {
		return beanId;
	}
	public void setBeanId(String beanId) {
		this.beanId = beanId;
	}
	/**
	 * @return the rdKey
	 */
	public String getRdKey() {
		return rdKey;
	}
	/**
	 * @param rdKey the rdKey to set
	 */
	public void setRdKey(String rdKey) {
		this.rdKey = rdKey;
	}
	/**
	 * @return the rdVal
	 */
	public String getRdVal() {
		return rdVal;
	}
	/**
	 * @param rdVal the rdVal to set
	 */
	public void setRdVal(String rdVal) {
		this.rdVal = rdVal;
	}
	/**
	 * @return the listVarId
	 */
	public String getListVarId() {
		return listVarId;
	}
	/**
	 * @param listVarId the listVarId to set
	 */
	public void setListVarId(String listVarId) {
		this.listVarId = listVarId;
	}
	/**
	 * @return the isListVarId
	 */
	public Boolean getIsListVarId() {
		return isListVarId;
	}
	/**
	 * @param isListVarId the isListVarId to set
	 */
	public void setIsListVarId(Boolean isListVarId) {
		this.isListVarId = isListVarId;
	}
	
	
	
	

}
