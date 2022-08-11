package com.techm.beans;

import java.util.HashMap;
import java.util.Map;

import org.json.JSONObject;
import org.springframework.stereotype.Component;
@Component
public class CommonActionBean {
	private ResponseParam responseParam;
	private String dataEndPointURL;
	private Map<String,Object> inputParam = new HashMap<>();
	
	private JSONObject jsonObj;

	public ResponseParam getResponseParam() {
		return responseParam;
	}

	public void setResponseParam(ResponseParam responseParam) {
		this.responseParam = responseParam;
	}

	public Map<String, Object> getInputParam() {
		return inputParam;
	}

	public void setInputParam(Map<String, Object> inputParam) {
		this.inputParam = inputParam;
	}

	public JSONObject getJsonObj() {
		return jsonObj;
	}

	public void setJsonObj(JSONObject jsonObj) {
		this.jsonObj = jsonObj;
	}

	public String getDataEndPointURL() {
		return dataEndPointURL;
	}

	public void setDataEndPointURL(String dataEndPointURL) {
		this.dataEndPointURL = dataEndPointURL;
	}
	
	

}
