package com.techm.pageBean;

import java.io.Serializable;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "targetSection")
@JsonInclude(Include.NON_NULL)
public class TargetSection implements Serializable {

	private static final long serialVersionUID = 1L;
	private String sectionId;
	private String add;
	private String action;
	private String remove;
	private String referenceValue;
	public Boolean isDrawerElement;
	
	@XmlElement(name="targetBean")
	private List<TargetBean> targetBean;
	
	public String getSectionId() {
		return sectionId;
	}
	public void setSectionId(String sectionId) {
		this.sectionId = sectionId;
	}
	public String getAdd() {
		return add;
	}
	public void setAdd(String add) {
		this.add = add;
	}
	public String getRemove() {
		return remove;
	}
	public void setRemove(String remove) {
		this.remove = remove;
	}
	public String getReferenceValue() {
		return referenceValue;
	}
	public void setReferenceValue(String referenceValue) {
		this.referenceValue = referenceValue;
	}
	public String getAction() {
		return action;
	}
	public void setAction(String action) {
		this.action = action;
	}
	public List<TargetBean> getTargetBean() {
		return targetBean;
	}
	public void setTargetBean(List<TargetBean> targetBean) {
		this.targetBean = targetBean;
	}
	public Boolean isDrawerElement() {
		return isDrawerElement;
	}
	public void setDrawerElement(Boolean isDrawerElement) {
		this.isDrawerElement = isDrawerElement;
	}
	
	
	
	
}
