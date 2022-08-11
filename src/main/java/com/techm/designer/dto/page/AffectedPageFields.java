package com.techm.designer.dto.page;

import java.io.Serializable;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "pageNFields")
@JsonIgnoreProperties(ignoreUnknown=true)
public class AffectedPageFields implements Serializable{

	private String pageName;
	
	@XmlElement(name="fieldName")
	private List<AffectedPageFieldIDAndLabels> fieldNameList;
	
	@XmlTransient
	private boolean enableAF = false;
	
	public boolean isEnableAF() {
		return enableAF;
	}

	public void setEnableAF(boolean enableAF) {
		this.enableAF = enableAF;
	}
	
	public String getPageName() {
		return pageName;
	}

	public void setPageName(final String pageName) {
		this.pageName = pageName;
	}

	public List<AffectedPageFieldIDAndLabels> getFieldNameList() {
		return fieldNameList;
	}

	public void setFieldNameList(final List<AffectedPageFieldIDAndLabels> fieldNameList) {
		this.fieldNameList = fieldNameList;
	}

}
