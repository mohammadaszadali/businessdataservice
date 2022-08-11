package com.techm.beans;

import java.util.Map;

import org.json.JSONObject;



public class RaapResponseBean {

	private String status;
	private Map<String, Object> responseMap;
	
	/**
	 * @return the status
	 */
	public String getStatus() {
		return status;
	}
	/**
	 * @param status the status to set
	 */
	public void setStatus(String status) {
		this.status = status;
	}
	/**
	 * @return the responseMap
	 */
	public Map<String, Object> getResponseMap() {
		return responseMap;
	}
	/**
	 * @param responseMap the responseMap to set
	 */
	public void setResponseMap(Map<String, Object> responseMap) {
		this.responseMap = responseMap;
	}
	
	
	
}
