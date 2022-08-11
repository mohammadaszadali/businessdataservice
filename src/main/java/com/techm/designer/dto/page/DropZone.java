package com.techm.designer.dto.page;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(Include.NON_NULL)
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "dropzone")
@JsonIgnoreProperties(ignoreUnknown=true)
public class DropZone {
	@JsonProperty("_elementid")
	private Integer _elementid;

	private String name;
	private String icon;
	private String title;
	private String type;
	private String xmlType;

	@JsonProperty("_id")
	private String _id;

	private String desc;

	@XmlElement(name = "columns")
	private List<Column> columns;
	
	/*@XmlElement(name = "properties")
	private List<Properties> properties;*/
	private Map<String,Object> properties=new HashMap<>();
	
	/*@JsonIgnore
	@XmlElement(name = "styles")
	private List<Style> styles;*/

	@XmlElement(name = "eventHandling")
	private EventHandling eventHandling;

	/*@XmlElement(name = "dropzones")
	private List<DropZone> dropzones;*/
	
	private List<ConditionalLogic> conditionalLogic;
	
	private DataBinding dataBinding;
	private FlowRuleBinding flowRuleBinding;
	
	public FlowRuleBinding getFlowRuleBinding() {
		return flowRuleBinding;
	}

	public void setFlowRuleBinding(FlowRuleBinding flowRuleBinding) {
		this.flowRuleBinding = flowRuleBinding;
	}

	/**
	 * @return the _elementid
	 */
	public Integer get_elementid() {
		return _elementid;
	}

	/**
	 * @param _elementid
	 *            the _elementid to set
	 */
	public void set_elementid(Integer _elementid) {
		this._elementid = _elementid;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the icon
	 */
	public String getIcon() {
		return icon;
	}

	/**
	 * @param icon
	 *            the icon to set
	 */
	public void setIcon(String icon) {
		this.icon = icon;
	}

	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * @param title
	 *            the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	/**
	 * @return the type
	 */
	public String getType() {
		return type;
	}

	/**
	 * @param type
	 *            the type to set
	 */
	public void setType(String type) {
		this.type = type;
	}

	/**
	 * @return the _id
	 */
	public String get_id() {
		return _id;
	}

	/**
	 * @param _id
	 *            the _id to set
	 */
	public void set_id(String _id) {
		this._id = _id;
	}

	/**
	 * @return the desc
	 */
	public String getDesc() {
		return desc;
	}

	/**
	 * @param desc
	 *            the desc to set
	 */
	public void setDesc(String desc) {
		this.desc = desc;
	}

	/**
	 * @return the columns
	 */
	public List<Column> getColumns() {
		return columns;
	}

	/**
	 * @param columns
	 *            the columns to set
	 */
	public void setColumns(List<Column> columns) {
		this.columns = columns;
	}

	/**
	 * @return the properties
	 */
	public Map<String, Object> getProperties() {
		return properties;
	}

	/**
	 * @param properties
	 *            the properties to set
	 */
	public void setProperties(Map<String, Object> properties) {
		this.properties = properties;
	}

	/**
	 * @return the style
	 *//*
	public List<Style> getStyle() {
		return styles;
	}

	*//**
	 * @param style
	 *            the style to set
	 *//*
	public void setStyle(List<Style> styles) {
		this.styles= styles;
	}*/

	

	/**
	 * @return the eventHandling
	 */
	public EventHandling getEventHandling() {
		return eventHandling;
	}

	/**
	 * @param eventHandling the eventHandling to set
	 */
	public void setEventHandling(EventHandling eventHandling) {
		this.eventHandling = eventHandling;
	}
/*	*//**
	 * @return the styles
	 *//*
	public List<Style> getStyles() {
		return styles;
	}

	*//**
	 * @param styles the styles to set
	 *//*
	public void setStyles(List<Style> styles) {
		this.styles = styles;
	}*/

	/**
	 * @return the dataBinding
	 */
	public DataBinding getDataBinding() {
		return dataBinding;
	}

	/**
	 * @param dataBinding the dataBinding to set
	 */
	public void setDataBinding(DataBinding dataBinding) {
		this.dataBinding = dataBinding;
	}

	public String getXmlType() {
		return xmlType;
	}

	public void setXmlType(String xmlType) {
		this.xmlType = xmlType;
	}

	/**
	 * @return the conditionalLogic
	 */
	public List<ConditionalLogic> getConditionalLogic() {
		return conditionalLogic;
	}

	/**
	 * @param conditionalLogic the conditionalLogic to set
	 */
	public void setConditionalLogic(List<ConditionalLogic> conditionalLogic) {
		this.conditionalLogic = conditionalLogic;
	}

	

}
