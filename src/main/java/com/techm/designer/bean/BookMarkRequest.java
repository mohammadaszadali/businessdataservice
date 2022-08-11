package com.techm.designer.bean;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
@JsonInclude(Include.NON_EMPTY)
public class BookMarkRequest {
	private List<Integer> tagIds;
	private Integer appId;
	private Integer id;
	private Boolean isBookMark;


	public List<Integer> getTagIds() {
		return tagIds;
	}

	public void setTagIds(List<Integer> tagIds) {
		this.tagIds = tagIds;
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
	 * @return the isBookMark
	 */
	public Boolean getIsBookMark() {
		return isBookMark;
	}

	/**
	 * @param isBookMark the isBookMark to set
	 */
	public void setIsBookMark(Boolean isBookMark) {
		this.isBookMark = isBookMark;
	}
	

}
