package com.techm.designer.bean;

import java.util.List;

public class Property {

	private String label;
	private String field;
	private String type;
	private String selected;
	private List<KeyValuePair> values;
	private String description;
	
	
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getLabel() {
		return label;
	}
	public void setLabel(String label) {
		this.label = label;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public List<KeyValuePair> getValues() {
		return values;
	}
	public void setValues(List<KeyValuePair> values) {
		this.values = values;
	}
	public String getSelected() {
		return selected;
	}
	public void setSelected(String selected) {
		this.selected = selected;
	}
	public String getField() {
		return field;
	}
	public void setField(String field) {
		this.field = field;
	}
	
	
	
}
