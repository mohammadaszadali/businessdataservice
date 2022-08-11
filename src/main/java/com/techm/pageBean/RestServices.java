package com.techm.pageBean;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "restServices")
public class RestServices {

	@XmlElement(name="restService")
	private List<RestService> restService;

	public List<RestService> getRestService() {
		return restService;
	}

	public void setRestService(List<RestService> restService) {
		this.restService = restService;
	}
	
	
}
