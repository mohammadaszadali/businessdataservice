package com.techm.designer.dto.page;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "href")
@JsonIgnoreProperties(ignoreUnknown=true)
public class Href implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private String protocol;
	private String port;
	private String contextPath;
	private Boolean parameters;

	@XmlElement(name = "actionParams")
	private ActionParams actionParams;

	public String getProtocol() {
		return protocol;
	}

	public void setProtocol(String protocol) {
		this.protocol = protocol;
	}

	public String getPort() {
		return port;
	}

	public void setPort(String port) {
		this.port = port;
	}

	public String getContextPath() {
		return contextPath;
	}

	public void setContextPath(String contextPath) {
		this.contextPath = contextPath;
	}

	

	public ActionParams getActionParams() {
		return actionParams;
	}

	public void setActionParams(ActionParams actionParams) {
		this.actionParams = actionParams;
	}

	public Boolean getParameters() {
		return parameters;
	}

	public void setParameters(Boolean parameters) {
		this.parameters = parameters;
	}

}
