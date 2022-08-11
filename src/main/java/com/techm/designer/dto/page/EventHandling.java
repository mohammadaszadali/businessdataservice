package com.techm.designer.dto.page;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.techm.designer.bean.ConnectorBean;
import com.techm.pageBean.JsEventDetails;
import com.techm.pageBean.TargetBeanCountDetails;

@JsonInclude(Include.NON_NULL)
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "eventHandling")
@JsonIgnoreProperties(ignoreUnknown=true)
public class EventHandling {

	private String heading;

	@XmlElement(name = "properties")
	private List<Properties> properties;

	private Boolean isAjaxCall;
	//private AjaxCallS ajaxCallS;
	private ActionParams actionParams;
	
	@XmlElement(name = "ajaxCall")
	private AjaxCall ajaxCall;


	private Boolean parameter;
	private String actionListenerClass;
	private String actionListenerMethod;
	private String methodType;
	private String actionMethod;
	private Boolean isHref;
	private Href href;

	private ConnectorBean serviceConnector;
	
	private String activeconnService;
	
	private List<ConnectorService> connectorService;
	
	private Boolean isJsEvent;	

	private JsEventDetails jsEventDetails;

	private TargetBeanCountDetails targetBeanCountDetails;
	
	private String renderSection;
	
	public String getRenderSection() {
		return renderSection;
	}

	public void setRenderSection(String renderSection) {
		this.renderSection = renderSection;
	}

	public String getActiveconnService() {
		return activeconnService;
	}

	public void setActiveconnService(String activeconnService) {
		this.activeconnService = activeconnService;
	}

	public List<ConnectorService> getConnectorService() {
		return connectorService;
	}

	public void setConnectorService(List<ConnectorService> connectorService) {
		this.connectorService = connectorService;
	}

	public String getActionMethod() {
		return actionMethod;
	}

	public void setActionMethod(String actionMethod) {
		this.actionMethod = actionMethod;
	}

	private Boolean isFullData;
	private String event;
	
	@XmlElement(name = "jsDetails")
	private JSDetails jsDetails;

	public JSDetails getJsDetails() {
		return jsDetails;
	}

	public void setJsDetails(JSDetails jsDetails) {
		this.jsDetails = jsDetails;
	}

	private List<ConditionalLogic> conditionalLogic;

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
	 * @return the isAjaxCall
	 */
	public Boolean getIsAjaxCall() {
		return isAjaxCall;
	}

	/**
	 * @param isAjaxCall the isAjaxCall to set
	 */
	public void setIsAjaxCall(Boolean isAjaxCall) {
		this.isAjaxCall = isAjaxCall;
	}

	

	/**
	 * @return the ajaxCall
	 */
	public AjaxCall getAjaxCall() {
		return ajaxCall;
	}

	/**
	 * @param ajaxCall the ajaxCall to set
	 */
	public void setAjaxCall(AjaxCall ajaxCall) {
		this.ajaxCall = ajaxCall;
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
	 * @return the actionListenerMethod
	 */
	public String getActionListenerMethod() {
		return actionListenerMethod;
	}

	/**
	 * @param actionListenerMethod the actionListenerMethod to set
	 */
	public void setActionListenerMethod(String actionListenerMethod) {
		this.actionListenerMethod = actionListenerMethod;
	}

	/**
	 * @return the methodType
	 */
	public String getMethodType() {
		return methodType;
	}

	/**
	 * @param methodType the methodType to set
	 */
	public void setMethodType(String methodType) {
		this.methodType = methodType;
	}

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
	 * @return the event
	 */
	public String getEvent() {
		return event;
	}

	/**
	 * @param event the event to set
	 */
	public void setEvent(String event) {
		this.event = event;
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

	/**
	 * @return the ajaxCallS
	 */

	

	public ConnectorBean getServiceConnector() {
		return serviceConnector;
	}

	
	

	public void setServiceConnector(ConnectorBean serviceConnector) {
		this.serviceConnector = serviceConnector;
	}

	public Boolean getIsHref() {
		return isHref;
	}

	public void setIsHref(Boolean isHref) {
		this.isHref = isHref;
	}

	public Href getHref() {
		return href;
	}

	public void setHref(Href href) {
		this.href = href;
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

	public Boolean getIsJsEvent() {
		return isJsEvent;
	}

	public void setIsJsEvent(Boolean isJsEvent) {
		this.isJsEvent = isJsEvent;
	}

	public JsEventDetails getJsEventDetails() {
		return jsEventDetails;
	}

	public void setJsEventDetails(JsEventDetails jsEventDetails) {
		this.jsEventDetails = jsEventDetails;
	}

	public TargetBeanCountDetails getTargetBeanCountDetails() {
		return targetBeanCountDetails;
	}

	public void setTargetBeanCountDetails(TargetBeanCountDetails targetBeanCountDetails) {
		this.targetBeanCountDetails = targetBeanCountDetails;
	}
	

}
