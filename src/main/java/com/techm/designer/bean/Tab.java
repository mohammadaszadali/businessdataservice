package com.techm.designer.bean;


import java.util.List;


public class Tab {

	private String heading;
	private List<Property> properties;
	
	
	public String getHeading() {
		return heading;
	}
	public void setHeading(String heading) {
		this.heading = heading;
	}
	public List<Property> getProperties() {
		return properties;
	}
	public void setProperties(List<Property> properties) {
		this.properties = properties;
	}
}
