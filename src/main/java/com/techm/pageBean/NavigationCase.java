package com.techm.pageBean;

import java.io.Serializable;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "navigationCase")
public class NavigationCase implements Serializable {

	private static final long serialVersionUID = 1L;

	private String fromOutcome;
	private String toViewId;
	private String applicationName;
	private String productName;
	private String serviceName;
	@XmlElement(name = "key")
	private List<Key> key;	
	
	/**
	 * @return the applicationName
	 */
	public String getApplicationName() {
		return applicationName;
	}

	/**
	 * @param applicationName the applicationName to set
	 */
	public void setApplicationName(String applicationName) {
		this.applicationName = applicationName;
	}

	/**
	 * @return the productName
	 */
	public String getProductName() {
		return productName;
	}

	/**
	 * @param productName the productName to set
	 */
	public void setProductName(String productName) {
		this.productName = productName;
	}

	/**
	 * @return the serviceName
	 */
	public String getServiceName() {
		return serviceName;
	}

	/**
	 * @param serviceName the serviceName to set
	 */
	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
	}

	public List<Key> getKey() {
		return key;
	}

	public void setKey(List<Key> key) {
		this.key = key;
	}

	public String getFromOutcome() {
		return fromOutcome;
	}

	public void setFromOutcome(String fromOutcome) {
		this.fromOutcome = fromOutcome;
	}

	public String getToViewId() {
		return toViewId;
	}

	public void setToViewId(String toViewId) {
		this.toViewId = toViewId;
	}

	

}
