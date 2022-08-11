package com.techm.pageBean;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "javascript")
public class JavaScriptDetailBean implements Serializable {

	private String event;
	private String method;
	private String referenceID;
	
	@XmlElement(name="targetActions")
	private TargetActions targetActions;
	
	@XmlTransient
	private String eventType;

	public String getEvent() {
		return event;
	}

	public void setEvent(String event) {
		this.event = event;
	}

	public String getMethod() {
		return method;
	}

	public void setMethod(String method) {
		this.method = method;
	}	

	public String getReferenceID() {
		return referenceID;
	}

	public void setReferenceID(String referenceID) {
		this.referenceID = referenceID;
	}

	public TargetActions getTargetActions() {
		return targetActions;
	}

	public void setTargetActions(TargetActions targetActions) {
		this.targetActions = targetActions;
	}

	public String getEventType() {
		return eventType;
	}

	public void setEventType(String eventType) {
		this.eventType = eventType;
	}

}
