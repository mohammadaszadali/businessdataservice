package com.techm.pageBean;

import java.io.Serializable;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "navigation-rule")
public class NavigationRule implements Serializable {

	private static final long serialVersionUID = 1L;

	@XmlElement(name = "navigation-case")
	private List<NavigationCase> navigationCase;

	public List<NavigationCase> getNavigationCase() {
		return navigationCase;
	}

	public void setNavigationCase(List<NavigationCase> navigationCase) {
		this.navigationCase = navigationCase;
	}

}
