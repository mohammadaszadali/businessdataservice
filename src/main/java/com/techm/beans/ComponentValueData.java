package com.techm.beans;

import java.util.Map;

import org.springframework.data.mongodb.core.mapping.Document;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

@Document(collection = "componentValueData")
@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY )
public class ComponentValueData {
	
	private String id;
	private String componentName;
	private Map<String,Object> ValueJson;
	
	public String getId() {
		return id;
	}

	public Map<String, Object> getValueJson() {
		return ValueJson;
	}

	public void setValueJson(Map<String, Object> valueJson) {
		ValueJson = valueJson;
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
/*	public String getValueJson() {
		return ValueJson;
	}
	public void setValueJson(String valueJson) {
		ValueJson = valueJson;
	}*/
	
	

}
