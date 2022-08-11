package com.techm.pageBean;

import java.io.Serializable;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "WebServices")
public class WebServices implements Serializable{
	@XmlElement(name="webService")
	private List<WebServiceBean> webService;

	/**
	 * @return the webService
	 */
	public List<WebServiceBean> getWebService() {
		return webService;
	}

	/**
	 * @param webService the webService to set
	 */
	public void setWebService(List<WebServiceBean> webService) {
		this.webService = webService;
	}

}
