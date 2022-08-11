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
@XmlRootElement(name = "columns")
@JsonIgnoreProperties(ignoreUnknown=true)
public class Column {
	
	@JsonProperty("_elementid")
	private Integer _elementid;
	
	private String name;
	private String icon;
	private String title;
	private String type;
	
	@JsonInclude(Include.NON_EMPTY)
	private String xmlType;
	@JsonProperty("_id")
	private String _id;
	
	private String fullBeanName;
	
	public Boolean getIsAffectedFields() {
		return isAffectedFields;
	}


	public void setIsAffectedFields(Boolean isAffectedFields) {
		this.isAffectedFields = isAffectedFields;
	}


	public AffectedFieldsBean getAffectedFields() {
		return affectedFields;
	}


	public void setAffectedFields(AffectedFieldsBean affectedFields) {
		this.affectedFields = affectedFields;
	}


	private String desc;
	
	@XmlElement(name = "columns")
	private List<?> columns;
	
	//private List<List<Column>> columns_ ;


	/*@XmlElement(name = "properties")
	private List<Properties> properties;*/
	
	private Map<String,Object> properties = new HashMap<>();
	
	/*@XmlElement(name = "styles")
	private List<Style> styles;*/
	

	@XmlElement(name = "eventHandling")
	private EventHandling eventHandling;
	
	@JsonInclude(Include.NON_EMPTY)
	private ConditionalLogic conditionalLogic;
	private DataBinding dataBinding;
	
	private BeanBinding beanBinding;
	
	@JsonInclude(Include.NON_EMPTY)
	private FlowRuleBinding flowRuleBinding;
	
	private Boolean isAffectedFields;
	
	@XmlElement(name = "affectedFields")
	private AffectedFieldsBean affectedFields;

	public ConditionalLogic getConditionalLogic() {
		return conditionalLogic;
	}


	public void setConditionalLogic(ConditionalLogic conditionalLogic) {
		this.conditionalLogic = conditionalLogic;
	}

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


	public Integer get_elementid() {
		return _elementid;
	}


	public void set_elementid(Integer _elementid) {
		this._elementid = _elementid;
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


	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
	}


	public String get_id() {
		return _id;
	}


	public void set_id(String _id) {
		this._id = _id;
	}


	public String getDesc() {
		return desc;
	}


	public void setDesc(String desc) {
		this.desc = desc;
	}


	public List<?> getColumns() {
		return columns;
	}


	public void setColumns(List<?> columns) {
		this.columns = columns;
	}

	public Map<String, Object> getProperties() {
		return properties;
	}


	public void setProperties(Map<String, Object> properties) {
		this.properties = properties;
	}


	/*public List<Style> getStyles() {
		return styles;
	}


	public void setStyles(List<Style> styles) {
		this.styles = styles;
	}*/


	public EventHandling getEventHandling() {
		return eventHandling;
	}


	public void setEventHandling(EventHandling eventHandling) {
		this.eventHandling = eventHandling;
	}


	public String getXmlType() {
		return xmlType;
	}


	public void setXmlType(String xmlType) {
		this.xmlType = xmlType;
	}


	public FlowRuleBinding getFlowRuleBinding() {
		return flowRuleBinding;
	}


	public void setFlowRuleBinding(FlowRuleBinding flowRuleBinding) {
		this.flowRuleBinding = flowRuleBinding;
	}


	
	/*public List<List<Column>> getColumns_() {
		return columns_;
	}


	public void setColumns_(List<List<Column>> columns_) {
		this.columns_ = columns_;
	}*/


	/**
	 * @return the fullBeanName
	 */
	public String getFullBeanName() {
		return fullBeanName;
	}


	/**
	 * @param fullBeanName the fullBeanName to set
	 */
	public void setFullBeanName(String fullBeanName) {
		this.fullBeanName = fullBeanName;
	}


	public BeanBinding getBeanBinding() {
		return beanBinding;
	}


	public void setBeanBinding(BeanBinding beanBinding) {
		this.beanBinding = beanBinding;
	}
		
	
}
