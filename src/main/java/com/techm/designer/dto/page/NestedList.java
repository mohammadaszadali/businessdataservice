package com.techm.designer.dto.page;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;
@JsonInclude(Include.NON_NULL)
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "nestedList")
@JsonIgnoreProperties(ignoreUnknown=true)
public class NestedList {

	@JsonProperty("dropzones")
	private transient List<List<DropZone>> dropzones;

	private List<DropZone> dropZones;
	
	public List<List<DropZone>> getDropzones() {
		return dropzones;
	}

	public void setDropzones(List<List<DropZone>> dropzones) {
		this.dropzones = dropzones;
	}

	/**
	 * @return the dropZones
	 */
	public List<DropZone> getDropZones() {
		return dropZones;
	}

	/**
	 * @param dropZones the dropZones to set
	 */
	public void setDropZones(List<DropZone> dropZones) {
		this.dropZones = dropZones;
	}

	
	
}
