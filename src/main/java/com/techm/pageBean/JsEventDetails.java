package com.techm.pageBean;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "jsEventDetails")
public class JsEventDetails implements Serializable{
	
	
	private String jsEvent;
	private Boolean removeFromBase;
	private Boolean addBackToBase;
	private String selectedRowTableId;
	private Boolean clearAll;
	private int attachmentLimit;
	
	@XmlElement(name = "baseBeanDetails")
	private BaseBeanDetails baseBeanDetails;
	
	@XmlElement(name = "targetBeanDetails")
	private TargetBeanDetails targetBeanDetails;
	
	
	public String getJsEvent() {
		return jsEvent;
	}
	public void setJsEvent(String jsEvent) {
		this.jsEvent = jsEvent;
	}
	public Boolean getRemoveFromBase() {
		return removeFromBase;
	}
	public void setRemoveFromBase(Boolean removeFromBase) {
		this.removeFromBase = removeFromBase;
	}
	public BaseBeanDetails getBaseBeanDetails() {
		return baseBeanDetails;
	}
	public void setBaseBeanDetails(BaseBeanDetails baseBeanDetails) {
		this.baseBeanDetails = baseBeanDetails;
	}
	public TargetBeanDetails getTargetBeanDetails() {
		return targetBeanDetails;
	}
	public void setTargetBeanDetails(TargetBeanDetails targetBeanDetails) {
		this.targetBeanDetails = targetBeanDetails;
	}
	public Boolean getAddBackToBase() {
		return addBackToBase;
	}
	public void setAddBackToBase(Boolean addBackToBase) {
		this.addBackToBase = addBackToBase;
	}
	public String getSelectedRowTableId() {
		return selectedRowTableId;
	}
	public void setSelectedRowTableId(String selectedRowTableId) {
		this.selectedRowTableId = selectedRowTableId;
	}
	public Boolean getClearAll() {
		return clearAll;
	}
	public void setClearAll(Boolean clearAll) {
		this.clearAll = clearAll;
	}
	public int getAttachmentLimit() {
		return attachmentLimit;
	}
	public void setAttachmentLimit(int attachmentLimit) {
		this.attachmentLimit = attachmentLimit;
	}
	
	
	
}
