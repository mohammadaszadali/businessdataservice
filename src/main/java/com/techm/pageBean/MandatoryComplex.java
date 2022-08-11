package com.techm.pageBean;

import java.io.Serializable;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "mandatoryComplex")
public class MandatoryComplex implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@XmlTransient
	private List<String> referenceIdList;
	
	private String referenceID;

	public String getReferenceID() {
		return referenceID;
	}

	public void setReferenceID(String referenceID) {
		this.referenceID = referenceID;
	}

	public List<String> getReferenceIdList() {
		return referenceIdList;
	}

	public void setReferenceIdList(List<String> referenceIdList) {
		this.referenceIdList = referenceIdList;
	}
}
