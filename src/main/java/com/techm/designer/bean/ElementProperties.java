package com.techm.designer.bean;

import java.util.List;
import java.util.Map;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
@JsonInclude(Include.NON_EMPTY)
@Document(collection = "elementsProperties")
public class ElementProperties {
	@Id
	private Integer id;
	private Map<String,String> headings;
	private Map<String,String> propertyIds;
	private List<KeyValuePair> typeValues;
	
	/**
	 * @return the id
	 */
	
	public Integer getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}
	/**
	 * @return the headings
	 */
	public Map<String, String> getHeadings() {
		return headings;
	}
	/**
	 * @param headings the headings to set
	 */
	public void setHeadings(Map<String, String> headings) {
		this.headings = headings;
	}
	/**
	 * @return the propertyIds
	 */
	public Map<String, String> getPropertyIds() {
		return propertyIds;
	}
	/**
	 * @param propertyIds the propertyIds to set
	 */
	public void setPropertyIds(Map<String, String> propertyIds) {
		this.propertyIds = propertyIds;
	}
	/**
	 * @return the typeValues
	 */
	public List<KeyValuePair> getTypeValues() {
		return typeValues;
	}
	/**
	 * @param typeValues the typeValues to set
	 */
	
	

	
	

}
