package com.techm.designer.dto.page;

import org.springframework.data.mongodb.core.mapping.Document;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
@JsonInclude(Include.NON_NULL)
@SuppressWarnings("serial")
@Document(collection="pageDetails")
@JsonIgnoreProperties(ignoreUnknown=true)
public class PageDetails {
	
	private Integer id;
//	private JSONObject pageObj;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	private PageData Pagedata;
	/**
	 * @return the pagedata
	 */
	public PageData getPagedata() {
		return Pagedata;
	}
	/**
	 * @param pagedata the pagedata to set
	 */
	public void setPagedata(PageData pagedata) {
		Pagedata = pagedata;
	}
	
	/*public JSONObject getPageObj() {
		return pageObj;
	}
	public void setPageObj(JSONObject pageObj) {
		this.pageObj = pageObj;
	}*/
	
	

}
