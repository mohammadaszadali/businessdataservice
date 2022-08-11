package com.techm.designer.bean;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "service")
public class RequestServiceTemplate {

	
	
	
	@XmlAttribute
	private String serviceName;
	
	@XmlAttribute
	private String bindingName;

	@XmlElement(name="operation")
	private List<RequestOpeationTemplate> operationList;

	public String getServiceName() {
		return serviceName;
	}

	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
	}

	public String getBindingName() {
		return bindingName;
	}

	public void setBindingName(String bindingName) {
		this.bindingName = bindingName;
	}

	public List<RequestOpeationTemplate> getOperationList() {
		return operationList;
	}

	public void setOperationList(List<RequestOpeationTemplate> operationList) {
		this.operationList = operationList;
	}
	
	

}
