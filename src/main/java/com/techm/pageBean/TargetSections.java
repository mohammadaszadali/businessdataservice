package com.techm.pageBean;

import java.io.Serializable;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "targetSections")
public class TargetSections implements Serializable {
	
	private static final long serialVersionUID = 1L;
	@XmlElement(name="targetSection")
	private List<TargetSection> targetSection;
	
	public List<TargetSection> getTargetSection() {
		return targetSection;
	}
	public void setTargetSection(List<TargetSection> targetSection) {
		this.targetSection = targetSection;
	}

}
