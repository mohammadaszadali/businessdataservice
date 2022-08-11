package com.techm.beans;

import java.util.Map;


import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "componentScreenData")
public class ComponentScreenData {
	
	private String id;
	private String componentName;
	private Map<String,Object> ScreenJson ;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getComponentName() {
		return componentName;
	}
	public void setComponentName(String componentName) {
		this.componentName = componentName;
	}
	public Map<String, Object> getScreenJson() {
		return ScreenJson;
	}
	public void setScreenJson(Map<String, Object> screenJson) {
		ScreenJson = screenJson;
	}
	
	
	
}
