package com.techm.designer.dto.page;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import org.springframework.data.annotation.Transient;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "page")
@JsonIgnoreProperties(ignoreUnknown=true)
public class PageData {
	
	@XmlAttribute
	private Integer id;

	@XmlAttribute
	private String pageName;

	private List<Integer> tagIdList;

	private Long createdDate;
	private String createdBy;
	private Long lastUpdated;
	private String updatedBy;

	private String title;
	private String description;
	private Boolean markglobal;
	@XmlElement(name = "nestedList")
	private NestedList nestedList;	

	private String pageJson;
	private String pageCategoryType;
	private String pageCategoryTreeStructure;
	private String name;
	private String displayName;
	private String displayNameStyleClass;
	private String pageStyleClass;
	private String layoutName;
	private String version;
	private String noOfElements;
	private Boolean isAffectedFields;
	private Boolean isDashboard;
	private Boolean isOnLoadEvent;
	private String pageAction;
	private String comments;
    private String tagNames ;
    private OnLoadEventBean onLoadEvent;
    private Map<String, String> map = new HashMap<String, String>();	

	private Boolean isLocked=false;
	private String lockedBy;
	
	private Boolean pageVersion;
	
	private Boolean markAsLanding;
	
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
	 * @return the pageName
	 */
	public String getPageName() {
		return pageName;
	}

	/**
	 * @param pageName the pageName to set
	 */
	public void setPageName(String pageName) {
		this.pageName = pageName;
	}

	/**
	 * @return the tagIdList
	 */
	public List<Integer> getTagIdList() {
		return tagIdList;
	}

	/**
	 * @param tagIdList the tagIdList to set
	 */
	public void setTagIdList(List<Integer> tagIdList) {
		this.tagIdList = tagIdList;
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
	 * @return the markglobal
	 */
	public Boolean getMarkglobal() {
		return markglobal;
	}

	/**
	 * @param markglobal the markglobal to set
	 */
	public void setMarkglobal(Boolean markglobal) {
		this.markglobal = markglobal;
	}

	/**
	 * @return the nestedList
	 */
	public NestedList getNestedList() {
		return nestedList;
	}

	/**
	 * @param nestedList the nestedList to set
	 */
	public void setNestedList(NestedList nestedList) {
		this.nestedList = nestedList;
	}

	/**
	 * @return the pageJson
	 */
	public String getPageJson() {
		return pageJson;
	}

	/**
	 * @param pageJson the pageJson to set
	 */
	public void setPageJson(String pageJson) {
		this.pageJson = pageJson;
	}

	public String getPageCategoryType() {
		return pageCategoryType;
	}

	public void setPageCategoryType(String pageCategoryType) {
		this.pageCategoryType = pageCategoryType;
	}

	public String getPageCategoryTreeStructure() {
		return pageCategoryTreeStructure;
	}

	public void setPageCategoryTreeStructure(String pageCategoryTreeStructure) {
		this.pageCategoryTreeStructure = pageCategoryTreeStructure;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDisplayName() {
		return displayName;
	}

	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}

	public String getDisplayNameStyleClass() {
		return displayNameStyleClass;
	}

	public void setDisplayNameStyleClass(String displayNameStyleClass) {
		this.displayNameStyleClass = displayNameStyleClass;
	}

	public String getPageStyleClass() {
		return pageStyleClass;
	}

	public void setPageStyleClass(String pageStyleClass) {
		this.pageStyleClass = pageStyleClass;
	}

	public String getLayoutName() {
		return layoutName;
	}

	public void setLayoutName(String layoutName) {
		this.layoutName = layoutName;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public String getNoOfElements() {
		return noOfElements;
	}

	public void setNoOfElements(String noOfElements) {
		this.noOfElements = noOfElements;
	}

	public Boolean getIsAffectedFields() {
		return isAffectedFields;
	}

	public void setIsAffectedFields(Boolean isAffectedFields) {
		this.isAffectedFields = isAffectedFields;
	}

	public Boolean getIsDashboard() {
		return isDashboard;
	}

	public void setIsDashboard(Boolean isDashboard) {
		this.isDashboard = isDashboard;
	}

	public Boolean getIsOnLoadEvent() {
		return isOnLoadEvent;
	}

	public void setIsOnLoadEvent(Boolean isOnLoadEvent) {
		this.isOnLoadEvent = isOnLoadEvent;
	}

	public String getPageAction() {
		return pageAction;
	}

	public void setPageAction(String pageAction) {
		this.pageAction = pageAction;
	}

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	public String getTagNames() {
		return tagNames;
	}

	public void setTagNames(String tagNames) {
		this.tagNames = tagNames;
	}
	
	public Map<String, String> getMap() {
		return map;
	}

	public void setMap(Map<String, String> map) {
		this.map = map;
	}

	public OnLoadEventBean getOnLoadEvent() {
		return onLoadEvent;
	}

	public void setOnLoadEvent(OnLoadEventBean onLoadEvent) {
		this.onLoadEvent = onLoadEvent;
	}

	/**
	 * @return the isLocked
	 */
	public Boolean getIsLocked() {
		return isLocked;
	}

	/**
	 * @param isLocked the isLocked to set
	 */
	public void setIsLocked(Boolean isLocked) {
		this.isLocked = isLocked;
	}

	/**
	 * @return the lockedBy
	 */
	public String getLockedBy() {
		return lockedBy;
	}

	/**
	 * @param lockedBy the lockedBy to set
	 */
	public void setLockedBy(String lockedBy) {
		this.lockedBy = lockedBy;
	}

	/**
	 * @return the pageVersion
	 */
	public Boolean getPageVersion() {
		return pageVersion;
	}

	/**
	 * @param pageVersion the pageVersion to set
	 */
	public void setPageVersion(Boolean pageVersion) {
		this.pageVersion = pageVersion;
	}

	/**
	 * @return the markAsLanding
	 */
	public Boolean getMarkAsLanding() {
		return markAsLanding;
	}

	/**
	 * @param markAsLanding the markAsLanding to set
	 */
	public void setMarkAsLanding(Boolean markAsLanding) {
		this.markAsLanding = markAsLanding;
	}



}
