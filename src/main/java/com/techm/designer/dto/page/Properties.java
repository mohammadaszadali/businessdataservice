package com.techm.designer.dto.page;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "properties")
@JsonIgnoreProperties(ignoreUnknown=true)
public class Properties {
	
	@JsonInclude(Include.NON_EMPTY)
	private String id;
	@JsonInclude(Include.NON_EMPTY)
	private String name;
	@JsonInclude(Include.NON_EMPTY)
	private String label;
	@JsonInclude(Include.NON_EMPTY)
	private String type;
	@JsonInclude(Include.NON_EMPTY)
	private String description;
	@JsonInclude(Include.NON_EMPTY)
	private String labelStyleClass;
	@JsonInclude(Include.NON_EMPTY)
	private String placeholder;
	@JsonInclude(Include.NON_EMPTY)
	private String title;
	@JsonInclude(Include.NON_EMPTY)
	private Integer tabIndex;
	private List<Values> values;
	@JsonInclude(Include.NON_EMPTY)
	private String autoFocus;
	@JsonInclude(Include.NON_EMPTY)
	private String readOnly;
	@JsonInclude(Include.NON_EMPTY)
	private String show;
	@JsonInclude(Include.NON_EMPTY)
	private String disabled;
	@JsonInclude(Include.NON_EMPTY)
	private String required;
	@JsonInclude(Include.NON_EMPTY)
	private String validatorClass;
	@JsonInclude(Include.NON_EMPTY)
	private String styleClass;
	@JsonInclude(Include.NON_EMPTY)
	private String field;
	
	private List<String> selected;
	@JsonInclude(Include.NON_EMPTY)
	private String heading;

	@JsonInclude(Include.NON_EMPTY)
	@XmlElement(name = "properties")
	private List<Properties> properties;

	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(String id) {
		this.id = id;
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
	 * @return the label
	 */
	public String getLabel() {
		return label;
	}

	/**
	 * @param label
	 *            the label to set
	 */
	public void setLabel(String label) {
		this.label = label;
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
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @param description
	 *            the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * @return the labelStyleClass
	 */
	public String getLabelStyleClass() {
		return labelStyleClass;
	}

	/**
	 * @param labelStyleClass
	 *            the labelStyleClass to set
	 */
	public void setLabelStyleClass(String labelStyleClass) {
		this.labelStyleClass = labelStyleClass;
	}

	/**
	 * @return the placeholder
	 */
	public String getPlaceholder() {
		return placeholder;
	}

	/**
	 * @param placeholder
	 *            the placeholder to set
	 */
	public void setPlaceholder(String placeholder) {
		this.placeholder = placeholder;
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
	 * @return the tabIndex
	 */
	public Integer getTabIndex() {
		return tabIndex;
	}

	/**
	 * @param tabIndex
	 *            the tabIndex to set
	 */
	public void setTabIndex(Integer tabIndex) {
		this.tabIndex = tabIndex;
	}

	/**
	 * @return the values
	 */
	public List<Values> getValues() {
		return values;
	}

	/**
	 * @param values
	 *            the values to set
	 */
	public void setValues(List<Values> values) {
		this.values = values;
	}

	/**
	 * @return the autoFocus
	 */
	public String getAutoFocus() {
		return autoFocus;
	}

	/**
	 * @param autoFocus
	 *            the autoFocus to set
	 */
	public void setAutoFocus(String autoFocus) {
		this.autoFocus = autoFocus;
	}

	/**
	 * @return the readOnly
	 */
	public String getReadOnly() {
		return readOnly;
	}

	/**
	 * @param readOnly
	 *            the readOnly to set
	 */
	public void setReadOnly(String readOnly) {
		this.readOnly = readOnly;
	}

	/**
	 * @return the show
	 */
	public String getShow() {
		return show;
	}

	/**
	 * @param show
	 *            the show to set
	 */
	public void setShow(String show) {
		this.show = show;
	}

	/**
	 * @return the disabled
	 */
	public String getDisabled() {
		return disabled;
	}

	/**
	 * @param disabled
	 *            the disabled to set
	 */
	public void setDisabled(String disabled) {
		this.disabled = disabled;
	}

	/**
	 * @return the required
	 */
	public String getRequired() {
		return required;
	}

	/**
	 * @param required
	 *            the required to set
	 */
	public void setRequired(String required) {
		this.required = required;
	}

	/**
	 * @return the validatorClass
	 */
	public String getValidatorClass() {
		return validatorClass;
	}

	/**
	 * @param validatorClass
	 *            the validatorClass to set
	 */
	public void setValidatorClass(String validatorClass) {
		this.validatorClass = validatorClass;
	}

	/**
	 * @return the styleClass
	 */
	public String getStyleClass() {
		return styleClass;
	}

	/**
	 * @param styleClass
	 *            the styleClass to set
	 */
	public void setStyleClass(String styleClass) {
		this.styleClass = styleClass;
	}

	/**
	 * @return the field
	 */
	public String getField() {
		return field;
	}

	/**
	 * @param field
	 *            the field to set
	 */
	public void setField(String field) {
		this.field = field;
	}

	

	/**
	 * @return the selected
	 */
	public List<String> getSelected() {
		return selected;
	}

	/**
	 * @param selected the selected to set
	 */
	public void setSelected(List<String> selected) {
		this.selected = selected;
	}

	/**
	 * @return the heading
	 */
	public String getHeading() {
		return heading;
	}

	/**
	 * @param heading
	 *            the heading to set
	 */
	public void setHeading(String heading) {
		this.heading = heading;
	}

	/**
	 * @return the properties
	 */
	public List<Properties> getProperties() {
		return properties;
	}

	/**
	 * @param properties
	 *            the properties to set
	 */
	public void setProperties(List<Properties> properties) {
		this.properties = properties;
	}

}
