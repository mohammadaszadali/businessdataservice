package com.techm.designer.bean;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_EMPTY)
@Document(collection = "tagMapping")

public class Tag {
	@Id
	private Integer id;
	private Integer type;
	private String name;
	private String value;
	private String description;
	private List<Parent> parent;
	private Integer parentId;
	private boolean defaultApp;
	private Long createdDate;
	private String createdBy;
	private Long lastUpdated;
	private String updatedBy;
	private Integer tagRefId;
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
	 * @return the type
	 */
	public Integer getType() {
		return type;
	}
	/**
	 * @param type the type to set
	 */
	public void setType(Integer type) {
		this.type = type;
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
	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}
	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}
	/**
	 * @return the parent
	 */
	public List<Parent> getParent() {
		return parent;
	}
	/**
	 * @param parent the parent to set
	 */
	public void setParent(List<Parent> parent) {
		this.parent = parent;
	}
	/**
	 * @return the parentId
	 */
	public Integer getParentId() {
		return parentId;
	}
	/**
	 * @param parentId the parentId to set
	 */
	public void setParentId(Integer parentId) {
		this.parentId = parentId;
	}
	/**
	 * @return the defaultApp
	 */
	public boolean isDefaultApp() {
		return defaultApp;
	}
	/**
	 * @param defaultApp the defaultApp to set
	 */
	public void setDefaultApp(boolean defaultApp) {
		this.defaultApp = defaultApp;
	}
	/**
	 * @return the createdDate
	 */
	public Long getCreatedDate() {
		return createdDate;
	}
	/**
	 * @param createdDate the createdDate to set
	 */
	public void setCreatedDate(Long createdDate) {
		this.createdDate = createdDate;
	}
	/**
	 * @return the createdBy
	 */
	public String getCreatedBy() {
		return createdBy;
	}
	/**
	 * @param createdBy the createdBy to set
	 */
	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}
	/**
	 * @return the lastUpdated
	 */
	public Long getLastUpdated() {
		return lastUpdated;
	}
	/**
	 * @param lastUpdated the lastUpdated to set
	 */
	public void setLastUpdated(Long lastUpdated) {
		this.lastUpdated = lastUpdated;
	}
	/**
	 * @return the updatedBy
	 */
	public String getUpdatedBy() {
		return updatedBy;
	}
	/**
	 * @param updatedBy the updatedBy to set
	 */
	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}
	/**
	 * @return the tagRefId
	 */
	public Integer getTagRefId() {
		return tagRefId;
	}
	/**
	 * @param tagRefId the tagRefId to set
	 */
	public void setTagRefId(Integer tagRefId) {
		this.tagRefId = tagRefId;
	}
	
	

}
