package com.techm.designer.dto.page;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown=true)
public class WhenCondition {
	
	private String whenSection;
	private String whenElementName;
	private String whenOperator;
	private String whenValue;
	private String whenCase;
	
	private String whenElementId;
	private String whenElementBeanClass;
	/**
	 * @return the whenSection
	 */
	public String getWhenSection() {
		return whenSection;
	}
	/**
	 * @return the whenElementBeanClass
	 */
	public String getWhenElementBeanClass() {
		return whenElementBeanClass;
	}
	/**
	 * @param whenElementBeanClass the whenElementBeanClass to set
	 */
	public void setWhenElementBeanClass(String whenElementBeanClass) {
		this.whenElementBeanClass = whenElementBeanClass;
	}
	/**
	 * @return the whenElementId
	 */
	public String getWhenElementId() {
		return whenElementId;
	}
	/**
	 * @param whenElementId the whenElementId to set
	 */
	public void setWhenElementId(String whenElementId) {
		this.whenElementId = whenElementId;
	}
	/**
	 * @param whenSection the whenSection to set
	 */
	public void setWhenSection(String whenSection) {
		this.whenSection = whenSection;
	}
	/**
	 * @return the whenElement
	 *//*
	public String getWhenElement() {
		return whenElementName;
	}
	*//**
	 * @param whenElement the whenElement to set
	 *//*
	public void setWhenElement(String whenElementName) {
		this.whenElementName = whenElementName;
	}*/
	public String getWhenElementName() {
		return whenElementName;
	}
	public void setWhenElementName(String whenElementName) {
		this.whenElementName = whenElementName;
	}
	
	/**
	 * @return the whenOperator
	 */
	public String getWhenOperator() {
		return whenOperator;
	}
	
	/**
	 * @param whenOperator the whenOperator to set
	 */
	public void setWhenOperator(String whenOperator) {
		this.whenOperator = whenOperator;
	}
	/**
	 * @return the whenValue
	 */
	public String getWhenValue() {
		return whenValue;
	}
	/**
	 * @param whenValue the whenValue to set
	 */
	public void setWhenValue(String whenValue) {
		this.whenValue = whenValue;
	}
	/**
	 * @return the whenCase
	 */
	public String getWhenCase() {
		return whenCase;
	}
	/**
	 * @param whenCase the whenCase to set
	 */
	public void setWhenCase(String whenCase) {
		this.whenCase = whenCase;
	}
	
	
	
}
