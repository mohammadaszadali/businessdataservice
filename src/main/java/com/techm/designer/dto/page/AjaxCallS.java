package com.techm.designer.dto.page;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "ajaxCall")
@JsonIgnoreProperties(ignoreUnknown=true)
public class AjaxCallS {
	private Boolean parameter;
	private String ajaxEvent;
	private String ajaxListenerClass;
	private String ajaxListenerMethod;
	private String methodType;
	private String ajaxRender;
	private String renderSection;
	private Boolean isFullData;
	private String packageName;
	
	/*@XmlElement(name = "actionParams")
	private List<ActionParamsS> actionParams;*/
	@XmlElement(name = "actionParams")
	private ActionParamsS actionParams;
	
	public Boolean getParameter() {
		return parameter;
	}

	public void setParameter(Boolean parameter) {
		this.parameter = parameter;
	}

	public String getAjaxEvent() {
		return ajaxEvent;
	}

	public void setAjaxEvent(String ajaxEvent) {
		this.ajaxEvent = ajaxEvent;
	}

	public String getAjaxListenerClass() {
		return ajaxListenerClass;
	}

	public void setAjaxListenerClass(String ajaxListenerClass) {
		this.ajaxListenerClass = ajaxListenerClass;
	}

	public String getAjaxListenerMethod() {
		return ajaxListenerMethod;
	}

	public void setAjaxListenerMethod(String ajaxListenerMethod) {
		this.ajaxListenerMethod = ajaxListenerMethod;
	}

	public String getMethodType() {
		return methodType;
	}

	public void setMethodType(String methodType) {
		this.methodType = methodType;
	}

	public String getAjaxRender() {
		return ajaxRender;
	}

	public void setAjaxRender(String ajaxRender) {
		this.ajaxRender = ajaxRender;
	}

	public Boolean getIsFullData() {
		return isFullData;
	}

	public void setIsFullData(Boolean isFullData) {
		this.isFullData = isFullData;
	}

	

	/**
	 * @return the actionParams
	 */
	public ActionParamsS getActionParams() {
		return actionParams;
	}

	/**
	 * @param actionParams the actionParams to set
	 */
	public void setActionParams(ActionParamsS actionParams) {
		this.actionParams = actionParams;
	}

	/**
	 * @return the renderSection
	 */
	public String getRenderSection() {
		return renderSection;
	}

	/**
	 * @param renderSection the renderSection to set
	 */
	public void setRenderSection(String renderSection) {
		this.renderSection = renderSection;
	}

	/**
	 * @return the packageName
	 */
	public String getPackageName() {
		return packageName;
	}

	/**
	 * @param packageName the packageName to set
	 */
	public void setPackageName(String packageName) {
		this.packageName = packageName;
	}

	
	
	
	

}
