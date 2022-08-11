package com.techm.designer.bean;


import java.io.Serializable;
import java.util.Map;

public class RaapResponseBean implements Serializable{
	
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
