package com.techm.designer.dto.page;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown=true)
public class ThenCondition {
	
	private String thenAction;
	private String thenSection;
	private String thenElement;
	private String thenElementId;
	/**
	 * @return the thenElementId
	 */
	public String getThenElementId() {
		return thenElementId;
	}
	/**
	 * @param thenElementId the thenElementId to set
	 */
	public void setThenElementId(String thenElementId) {
		this.thenElementId = thenElementId;
	}
	/**
	 * @return the thenAction
	 */
	public String getThenAction() {
		return thenAction;
	}
	/**
	 * @param thenAction the thenAction to set
	 */
	public void setThenAction(String thenAction) {
		this.thenAction = thenAction;
	}
	/**
	 * @return the thenSection
	 */
	public String getThenSection() {
		return thenSection;
	}
	/**
	 * @param thenSection the thenSection to set
	 */
	public void setThenSection(String thenSection) {
		this.thenSection = thenSection;
	}
	/**
	 * @return the thenElement
	 */
	public String getThenElement() {
		return thenElement;
	}
	/**
	 * @param thenElement the thenElement to set
	 */
	public void setThenElement(String thenElement) {
		this.thenElement = thenElement;
	}
	
	
	

}
