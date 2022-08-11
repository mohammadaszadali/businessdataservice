package com.techm.pageBean;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.techm.designer.dto.page.ActionParams;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "ajaxCall")
@JsonInclude(Include.NON_NULL)
public class AjaxCall implements Serializable {

	private String ajaxDisabled;
	private String ajaxEvent;
	private String ajaxExecute;
	private String ajaxImmediate;
	private String ajaxListenerClass;
	private String ajaxListenerMethod;
	private String ajaxOnEvent;
	private String ajaxOnError;
	private String ajaxRender;
	private Boolean parameter;
	private Boolean isFullData;	

	private String methodType;
	private Boolean isRenderSection;
	private String renderSection ;
	private String targetBeanId ;
	private String targetBeanClass ;
	private String targetPackage ;
	
	private String componentEndPointURL;
	private String dataEndPointURL;
	
	private Boolean secLoad;

	/**
	 * @return the isFullData
	 */
	public Boolean getIsFullData() {
		return isFullData;
	}

	/**
	 * @param isFullData the isFullData to set
	 */
	public void setIsFullData(Boolean isFullData) {
		this.isFullData = isFullData;
	}

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

	@XmlTransient
	private Boolean isBeanAttribute;
	private Boolean isElementIdParam;
	
	@XmlElement(name = "actionParams")
	private ActionParams actionParams;
	
	@XmlElement(name = "mandatoryComplex")
	private MandatoryComplex mandatoryComplex;
	
	@XmlElement(name = "targetSections")
	private TargetSections targetSections;

	public MandatoryComplex getMandatoryComplex() {
		return mandatoryComplex;
	}

	public void setMandatoryComplex(MandatoryComplex mandatoryComplex) {
		this.mandatoryComplex = mandatoryComplex;
	}

	
	public Boolean getIsRenderSection() {
		return isRenderSection;
	}

	public void setIsRenderSection(Boolean isRenderSection) {
		this.isRenderSection = isRenderSection;
	}

	public TargetSections getTargetSections() {
		return targetSections;
	}

	public void setTargetSections(TargetSections targetSections) {
		this.targetSections = targetSections;
	}

	public String getAjaxDisabled() {
		return ajaxDisabled;
	}

	public void setAjaxDisabled(String ajaxDisabled) {
		this.ajaxDisabled = ajaxDisabled;
	}

	public String getAjaxEvent() {
		return ajaxEvent;
	}

	public void setAjaxEvent(String ajaxEvent) {
		this.ajaxEvent = ajaxEvent;
	}

	public String getAjaxExecute() {
		return ajaxExecute;
	}

	public void setAjaxExecute(String ajaxExecute) {
		this.ajaxExecute = ajaxExecute;
	}

	public String getAjaxImmediate() {
		return ajaxImmediate;
	}

	public void setAjaxImmediate(String ajaxImmediate) {
		this.ajaxImmediate = ajaxImmediate;
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

	public String getAjaxOnEvent() {
		return ajaxOnEvent;
	}

	public void setAjaxOnEvent(String ajaxOnEvent) {
		this.ajaxOnEvent = ajaxOnEvent;
	}

	public String getAjaxRender() {
		return ajaxRender;
	}

	public void setAjaxRender(String ajaxRender) {
		this.ajaxRender = ajaxRender;
	}

	public String getAjaxOnError() {
		return ajaxOnError;
	}

	public void setAjaxOnError(String ajaxOnError) {
		this.ajaxOnError = ajaxOnError;
	}

	/**
	 * @return the parameter
	 */
	public Boolean getParameter() {
		return parameter;
	}

	/**
	 * @param parameter the parameter to set
	 */
	public void setParameter(Boolean parameter) {
		this.parameter = parameter;
	}

	/**
	 * @return the actionParams
	 */
	public ActionParams getActionParams() {
		return actionParams;
	}

	/**
	 * @param actionParams the actionParams to set
	 */
	public void setActionParams(ActionParams actionParams) {
		this.actionParams = actionParams;
	}

	/**
	 * @return the isElementIdParam
	 */
	public Boolean getIsElementIdParam() {
		return isElementIdParam;
	}

	/**
	 * @param isElementIdParam the isElementIdParam to set
	 */
	public void setIsElementIdParam(Boolean isElementIdParam) {
		this.isElementIdParam = isElementIdParam;
	}

	/**
	 * @return the isBeanAttribute
	 */
	public Boolean getIsBeanAttribute() {
		return isBeanAttribute;
	}

	/**
	 * @param isBeanAttribute the isBeanAttribute to set
	 */
	public void setIsBeanAttribute(Boolean isBeanAttribute) {
		this.isBeanAttribute = isBeanAttribute;
	}
	
	public String getMethodType() {
		return methodType;
	}

	public void setMethodType(String methodType) {
		this.methodType = methodType;
	}

	public String getRenderSection() {
		return renderSection;
	}
	
	public void setRenderSection(String renderSection) {
		this.renderSection = renderSection;
	}

/*	public Boolean getFullData() {
		return isFullData;
	}

	public void setFullData(Boolean fullData) {
		this.isFullData = fullData;
	}*/

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
