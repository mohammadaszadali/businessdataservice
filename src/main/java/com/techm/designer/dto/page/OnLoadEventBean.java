package com.techm.designer.dto.page;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlRootElement;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.techm.pageBean.RestServices;
import com.techm.pageBean.WebServices;

@JsonInclude(Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown=true)
@XmlRootElement
public class OnLoadEventBean implements Serializable{

	private String methodType;
	private String actionListenerMethod;
	private String actionListenerClass;
	
	private Boolean parameter;
	
	private ActionParams actionParams;
	
	private WebServices webServices;

	private RestServices restServices;
	
	private Boolean isAffectedFields;

	private AffectedFieldsBean affectedFields;

	private RuleDetails ruleDetails;

	public String getMethodType() {
		return methodType;
	}
	public void setMethodType(String methodType) {
		this.methodType = methodType;
	}
	public String getActionListenerMethod() {
		return actionListenerMethod;
	}
	public void setActionListenerMethod(String actionListenerMethod) {
		this.actionListenerMethod = actionListenerMethod;
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
	 * @return the isAffectedFields
	 */
	public Boolean getIsAffectedFields() {
		return isAffectedFields;
	}
	/**
	 * @param isAffectedFields the isAffectedFields to set
	 */
	public void setIsAffectedFields(Boolean isAffectedFields) {
		this.isAffectedFields = isAffectedFields;
	}
	/**
	 * @return the actionListenerClass
	 */
	public String getActionListenerClass() {
		return actionListenerClass;
	}
	/**
	 * @param actionListenerClass the actionListenerClass to set
	 */
	public void setActionListenerClass(String actionListenerClass) {
		this.actionListenerClass = actionListenerClass;
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
	 * @return the webServices
	 */
	public WebServices getWebServices() {
		return webServices;
	}
	/**
	 * @param webServices the webServices to set
	 */
	public void setWebServices(WebServices webServices) {
		this.webServices = webServices;
	}
	/**
	 * @return the affectedFields
	 */
	public AffectedFieldsBean getAffectedFields() {
		return affectedFields;
	}
	/**
	 * @param affectedFields the affectedFields to set
	 */
	public void setAffectedFields(AffectedFieldsBean affectedFields) {
		this.affectedFields = affectedFields;
	}
	/**
	 * @return the ruleDetails
	 */
	public RuleDetails getRuleDetails() {
		return ruleDetails;
	}
	/**
	 * @param ruleDetails the ruleDetails to set
	 */
	public void setRuleDetails(RuleDetails ruleDetails) {
		this.ruleDetails = ruleDetails;
	}
	/**
	 * @return the restServices
	 */
	public RestServices getRestServices() {
		return restServices;
	}
	/**
	 * @param restServices the restServices to set
	 */
	public void setRestServices(RestServices restServices) {
		this.restServices = restServices;
	}
	
}
