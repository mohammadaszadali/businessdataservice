package com.techm.pageBean;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name="targetActions")
public class TargetActions {
	
	@XmlElement(name = "targetAction")
	private List<TargetAction>  targetAction;

	public List<TargetAction> getTargetAction() {
		return targetAction;
	}

	public void setTargetAction(List<TargetAction> targetAction) {
		this.targetAction = targetAction;
	}
	
	
}
