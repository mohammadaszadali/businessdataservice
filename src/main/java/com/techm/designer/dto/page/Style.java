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
@XmlRootElement(name = "style")
@JsonIgnoreProperties(ignoreUnknown=true)
public class Style {
	private String heading;
	private String inlineStyle;
	
	@XmlElement(name = "properties")
	private List<Properties> properties;

	/**
	 * @return the heading
	 */
	public String getHeading() {
		return heading;
	}

	/**
	 * @param heading the heading to set
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
	 * @param properties the properties to set
	 */
	public void setProperties(List<Properties> properties) {
		this.properties = properties;
	}

	/**
	 * @return the inlineStyle
	 */
	public String getInlineStyle() {
		return inlineStyle;
	}

	/**
	 * @param inlineStyle the inlineStyle to set
	 */
	public void setInlineStyle(String inlineStyle) {
		this.inlineStyle = inlineStyle;
	}

	
	
	/*private String styleClass;
	
	@JsonProperty("text-align")
	private String textAlign;
	
	private String width;
	private String height;
	
	@JsonProperty("padding-top")
	private String paddingTop;
	
	@JsonProperty("padding-right")
	private String paddingRight;
	
	@JsonProperty("padding-bottom")
	private String paddingBottom;
	
	@JsonProperty("padding-left")
	private String paddingLeft;
	
	@JsonProperty("margin-top")
	private String marginTop;
	
	@JsonProperty("margin-right")
	private String marginRight;
	
	@JsonProperty("margin-bottom")
	private String marginBottom;
	
	@JsonProperty("margin-left")
	private String marginLeft;
	
	@JsonProperty("font-size")
	private String fontSize;
	
	@JsonProperty("font-family")
	private String fontFamily;
	
	@JsonProperty("font-style")
	private String fontStyle;

	public String getStyleClass() {
		return styleClass;
	}

	public void setStyleClass(String styleClass) {
		this.styleClass = styleClass;
	}

	public String getTextAlign() {
		return textAlign;
	}

	public void setTextAlign(String textAlign) {
		this.textAlign = textAlign;
	}

	public String getWidth() {
		return width;
	}

	public void setWidth(String width) {
		this.width = width;
	}

	public String getHeight() {
		return height;
	}

	public void setHeight(String height) {
		this.height = height;
	}

	public String getPaddingTop() {
		return paddingTop;
	}

	public void setPaddingTop(String paddingTop) {
		this.paddingTop = paddingTop;
	}

	public String getPaddingRight() {
		return paddingRight;
	}

	public void setPaddingRight(String paddingRight) {
		this.paddingRight = paddingRight;
	}

	public String getPaddingBottom() {
		return paddingBottom;
	}

	public void setPaddingBottom(String paddingBottom) {
		this.paddingBottom = paddingBottom;
	}

	public String getPaddingLeft() {
		return paddingLeft;
	}

	public void setPaddingLeft(String paddingLeft) {
		this.paddingLeft = paddingLeft;
	}

	public String getMarginTop() {
		return marginTop;
	}

	public void setMarginTop(String marginTop) {
		this.marginTop = marginTop;
	}

	public String getMarginRight() {
		return marginRight;
	}

	public void setMarginRight(String marginRight) {
		this.marginRight = marginRight;
	}

	public String getMarginBottom() {
		return marginBottom;
	}

	public void setMarginBottom(String marginBottom) {
		this.marginBottom = marginBottom;
	}

	public String getMarginLeft() {
		return marginLeft;
	}

	public void setMarginLeft(String marginLeft) {
		this.marginLeft = marginLeft;
	}

	public String getFontSize() {
		return fontSize;
	}

	public void setFontSize(String fontSize) {
		this.fontSize = fontSize;
	}

	public String getFontFamily() {
		return fontFamily;
	}

	public void setFontFamily(String fontFamily) {
		this.fontFamily = fontFamily;
	}

	public String getFontStyle() {
		return fontStyle;
	}

	public void setFontStyle(String fontStyle) {
		this.fontStyle = fontStyle;
	}
	
	*/


}
