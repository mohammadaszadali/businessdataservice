package com.techm.designer.bean;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonPropertyOrder({
    "_elementid",
    "name",
    "icon",
    "title",
    "type",
    "xmlType",
    "_id",
    "desc",
    "columns",
    "properties",
    "styles",
    "eventHandling",
    "dataBinding",
    "conditionalLogic"
})
@Document(collection = "widgetDesignlibrary")
public class WidgetModel {

	@JsonProperty("_elementid")
	private Integer _elementid;
	private String name;
	private String icon;
	private String title;
	private String type;
	private String xmlType;
	
	@Id
	@JsonProperty("_id")
	private String id;
	private String desc = "";

	private Map<String,String> properties = new HashMap<>();
	//private List<Tab> styles ;
	private List<Tab> eventHandling; 
	private List<Tab> dataBinding ;
	private List<Tab> conditionalLogic;
	private List<Object> columns = new ArrayList<Object>();
	
	@JsonProperty("_elementid")
	public Integer get_elementid() {
		return _elementid;
	}
	@JsonProperty("_elementid")
	public void set_elementid(Integer id) {
		this._elementid = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getIcon() {
		return icon;
	}
	public void setIcon(String icon) {
		this.icon = icon;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	
	public Map<String, String> getProperties() {
		return properties;
	}
	public void setProperties(Map<String, String> properties) {
		this.properties = properties;
	}
	/*public List<Tab> getStyles() {
		return styles;
	}
	public void setStyles(List<Tab> styles) {
		this.styles = styles;
	}*/
	public List<Tab> getEventHandling() {
		return eventHandling;
	}
	public void setEventHandling(List<Tab> eventHandling) {
		this.eventHandling = eventHandling;
	}
	public List<Tab> getDataBinding() {
		return dataBinding;
	}
	public void setDataBinding(List<Tab> dataBinding) {
		this.dataBinding = dataBinding;
	}
	public List<Tab> getConditionalLogic() {
		return conditionalLogic;
	}
	public void setConditionalLogic(List<Tab> conditionalLogic) {
		this.conditionalLogic = conditionalLogic;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	@JsonProperty("_id")
	public String getId() {
		return id;
	}
	
	@JsonProperty("_id")
	public void setStrId(String strId) {
		this.id = strId;
	}
	public void setId(String id) {
		this.id = id;
	}
	public List<Object> getColumns() {
		return columns;
	}
	public void setColumns(List<Object> columns) {
		this.columns = columns;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public String getXmlType() {
		return xmlType;
	}
	public void setXmlType(String xmlType) {
		this.xmlType = xmlType;
	}
	
	
}
