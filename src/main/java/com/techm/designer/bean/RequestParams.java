package com.techm.designer.bean;

import java.io.Serializable;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "requestParams")
public class RequestParams implements Serializable{
	
	@XmlElement(name="requestParam")
	private List<ActionParam> requestParameters;

	/**
	 * @return the requestParameters
	 */
	public List<ActionParam> getRequestParameters() {
		return requestParameters;
	}

	/**
	 * @param requestParameters the requestParameters to set
	 */
	public void setRequestParameters(List<ActionParam> requestParameters) {
		this.requestParameters = requestParameters;
	}

	
	
}