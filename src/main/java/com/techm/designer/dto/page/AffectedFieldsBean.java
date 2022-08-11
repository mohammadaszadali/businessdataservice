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
@XmlRootElement(name = "affectedFields")
@JsonIgnoreProperties(ignoreUnknown=true)
public class AffectedFieldsBean implements Serializable{

	@XmlElement(name="affectedField")
	private List<AffectedfieldDetails> affectedfieldDetails;

	/**
	 * @return the affectedfieldDetails
	 */
	public List<AffectedfieldDetails> getAffectedfieldDetails() {
		return affectedfieldDetails;
	}

	/**
	 * @param affectedfieldDetails the affectedfieldDetails to set
	 */
	public void setAffectedfieldDetails(
			List<AffectedfieldDetails> affectedfieldDetails) {
		this.affectedfieldDetails = affectedfieldDetails;
	}
	
}
