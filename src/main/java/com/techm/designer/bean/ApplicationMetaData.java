package com.techm.designer.bean;

import java.io.Serializable;
import java.util.List;

import javax.validation.constraints.Size;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
@JsonInclude(Include.NON_EMPTY)
@SuppressWarnings("serial")
@Document(collection="applicationmetadata")
public class ApplicationMetaData implements Serializable{
	
	@Id
	private Integer id;
	private  String artifactType;
	@Size(min=2, message="Please select atleast 2 letters.")
	private String name;
	private List<Tag> tagList;
	private String version;
	
	private Long createdDate;
	private String createdBy;
	private Long lastUpdated;
	private String updatedBy;
	private Integer appId;
	private Boolean bookMark;
	
	private Boolean jRPageStatus;
	private String jRPageSaveMsg;
	
	private Boolean isLocked=false;
	private String lockedBy;
	
	private String title;
	private String description;
	
	private Long oakUpdatedTime;
	
	public String getLockedBy() {
		return lockedBy;
	}
	public void setLockedBy(String lockedBy) {
		this.lockedBy = lockedBy;
	}
	public Boolean getIsLocked() {
		return isLocked;
	}
	public void setIsLocked(Boolean isLocked) {
		this.isLocked = isLocked;
	}
	
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Boolean getBookMark() {
		return bookMark;
	}
	public void setBookMark(Boolean bookMark) {
		this.bookMark = bookMark;
	}
	public Long getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(Long createdDate) {
		this.createdDate = createdDate;
	}
	public String getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}
	public Long getLastUpdated() {
		return lastUpdated;
	}
	public void setLastUpdated(Long lastUpdated) {
		this.lastUpdated = lastUpdated;
	}
	public String getUpdatedBy() {
		return updatedBy;
	}
	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getArtifactType() {
		return artifactType;
	}
	public void setArtifactType(String artifactType) {
		this.artifactType = artifactType;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Tag> getTagList() {
		return tagList;
	}
	public void setTagList(List<Tag> tagMap) {
		this.tagList = tagMap;
	}
	public String getVersion() {
		return version;
	}
	public void setVersion(String version) {
		this.version = version;
	}
	
	public Integer getAppId() {
		return appId;
	}
	public void setAppId(Integer appId) {
		this.appId = appId;
	}
	/**
	 * @return the jRPageStatus
	 */
	public Boolean getjRPageStatus() {
		return jRPageStatus;
	}
	/**
	 * @param jRPageStatus the jRPageStatus to set
	 */
	public void setjRPageStatus(Boolean jRPageStatus) {
		this.jRPageStatus = jRPageStatus;
	}
	/**
	 * @return the jRPageSaveMsg
	 */
	public String getjRPageSaveMsg() {
		return jRPageSaveMsg;
	}
	/**
	 * @param jRPageSaveMsg the jRPageSaveMsg to set
	 */
	public void setjRPageSaveMsg(String jRPageSaveMsg) {
		this.jRPageSaveMsg = jRPageSaveMsg;
	}
	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}
	/**
	 * @param title the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}
	public Long getOakUpdatedTime() {
		return oakUpdatedTime;
	}
	public void setOakUpdatedTime(Long oakUpdatedTime) {
		this.oakUpdatedTime = oakUpdatedTime;
	}
	
	

}
