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
@XmlRootElement(name = "fieldName")
@JsonIgnoreProperties(ignoreUnknown=true)
public class AffectedPageFieldIDAndLabels implements Serializable{

	private String id;
	
	private String name;
	
	private String label;

	@XmlElement(name="fieldAction")
	List<AffectedFieldActions> affectedFieldActions;

	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the label
	 */
	public String getLabel() {
		return label;
	}

	/**
	 * @param label the label to set
	 */
	public void setLabel(String label) {
		this.label = label;
	}

	/**
	 * @return the affectedFieldActions
	 */
	public List<AffectedFieldActions> getAffectedFieldActions() {
		return affectedFieldActions;
	}

	/**
	 * @param affectedFieldActions the affectedFieldActions to set
	 */
	public void setAffectedFieldActions(
			List<AffectedFieldActions> affectedFieldActions) {
		this.affectedFieldActions = affectedFieldActions;
	}
	
}
