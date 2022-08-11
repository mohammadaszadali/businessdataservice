package com.techm.designer.dto.page;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "businessWidget")
public class BusinessWidget {
	@Id
	private Integer id;
	private Integer appId;
	private Long createdDate;
	private String createdBy;
	private Long lastUpdated;
	private String updatedBy;
	private Boolean isLocked;
	private String lockedBy;
	private String description;
	private String title;
	private String type;
	
	//End Point URL's
	private String screenEndPointURL;
	private String dataEndPointURL;
	
	private DropZone dropZone;
	

	/**
	 * @return the dropZone
	 */
	public DropZone getDropZone() {
		return dropZone;
	}

	/**
	 * @param dropZone the dropZone to set
	 */
	public void setDropZone(DropZone dropZone) {
		this.dropZone = dropZone;
	}

	
   public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
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
	 * @return the appId
	 */
	public Integer getAppId() {
		return appId;
	}

	/**
	 * @param appId the appId to set
	 */
	public void setAppId(Integer appId) {
		this.appId = appId;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Boolean getIsLocked() {
		return isLocked;
	}

	public void setIsLocked(Boolean isLocked) {
		this.isLocked = isLocked;
	}

	public String getLockedBy() {
		return lockedBy;
	}

	public void setLockedBy(String lockedBy) {
		this.lockedBy = lockedBy;
	}

	public String getScreenEndPointURL() {
		return screenEndPointURL;
	}

	public void setScreenEndPointURL(String screenEndPointURL) {
		this.screenEndPointURL = screenEndPointURL;
	}

	public String getDataEndPointURL() {
		return dataEndPointURL;
	}

	public void setDataEndPointURL(String dataEndPointURL) {
		this.dataEndPointURL = dataEndPointURL;
	}
	
	
	
	
}
