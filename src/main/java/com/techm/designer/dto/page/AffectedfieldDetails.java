package com.techm.designer.dto.page;

import java.io.Serializable;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "affectedField")
@JsonIgnoreProperties(ignoreUnknown=true)
public class AffectedfieldDetails implements Serializable{
	
	boolean isList;
	String value;
	@XmlElement(name="pageNFields")
	private List<AffectedPageFields> affectedPageFieldsList;
	
	/**
	 * @return the isList
	 */
	public boolean isList() {
		return isList;
	}

	/**
	 * @param isList the isList to set
	 */
	public void setList(boolean isList) {
		this.isList = isList;
	}

	/**
	 * @return the value
	 */
	public String getValue() {
		return value;
	}

	/**
	 * @param value the value to set
	 */
	public void setValue(String value) {
		this.value = value;
	}

	public List<AffectedPageFields> getAffectedPageFieldsList() {
		return affectedPageFieldsList;
	}

	public void setAffectedPageFieldsList(final List<AffectedPageFields> objAffPFList) {
		this.affectedPageFieldsList = objAffPFList;
	}
	
}
