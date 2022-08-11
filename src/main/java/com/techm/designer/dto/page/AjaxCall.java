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
public class AjaxCall {
	private Boolean parameter;
	private String ajaxEvent;
	private String ajaxListenerClass;
	private String ajaxListenerMethod;
	private String methodType;
	private String ajaxRender;
	private String renderSection;
	private Boolean isFullData;
	private String packageName;
	
	@XmlElement(name = "actionParams")
	private ActionParams actionParams;
	
	private String targetBeanId ;
	private String targetBeanClass ;
	private String targetPackage ;
	
	private String dataEndPointURL;
	private String componentEndPointURL;
	
	private Boolean secLoad;
	
	/**
	 * @return the targetBeanId
	 */
	public String getTargetBeanId() {
		return targetBeanId;
	}

	/**
	 * @param targetBeanId the targetBeanId to set
	 */
	public void setTargetBeanId(String targetBeanId) {
		this.targetBeanId = targetBeanId;
	}

	/**
	 * @return the targetBeanClasss
	 */
	public String getTargetBeanClass() {
		return targetBeanClass;
	}

	/**
	 * @param targetBeanClasss the targetBeanClasss to set
	 */
	public void setTargetBeanClass(String targetBeanClass) {
		this.targetBeanClass = targetBeanClass;
	}

	/**
	 * @return the targetPackage
	 */
	public String getTargetPackage() {
		return targetPackage;
	}

	/**
	 * @param targetPackage the targetPackage to set
	 */
	public void setTargetPackage(String targetPackage) {
		this.targetPackage = targetPackage;
	}

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

	
	public ActionParams getActionParams() {
		return actionParams;
	}

	public void setActionParams(ActionParams actionParams) {
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

	/**
	 * @return the dataEndPointURL
	 */
	public String getDataEndPointURL() {
		return dataEndPointURL;
	}

	/**
	 * @param dataEndPointURL the dataEndPointURL to set
	 */
	public void setDataEndPointURL(String dataEndPointURL) {
		this.dataEndPointURL = dataEndPointURL;
	}

	/**
	 * @return the componentEndPointURL
	 */
	public String getComponentEndPointURL() {
		return componentEndPointURL;
	}

	/**
	 * @param componentEndPointURL the componentEndPointURL to set
	 */
	public void setComponentEndPointURL(String componentEndPointURL) {
		this.componentEndPointURL = componentEndPointURL;
	}

	/**
	 * @return the secLoad
	 */
	public Boolean getSecLoad() {
		return secLoad;
	}

	/**
	 * @param secLoad the secLoad to set
	 */
	public void setSecLoad(Boolean secLoad) {
		this.secLoad = secLoad;
	}

	
	
	
	

}
