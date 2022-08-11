package com.techm.designer.dto.page;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown=true)
public class JSDetails {
	
//	@XmlElement(name = "javascripDetailBeans")
	private List<JavascripDetailBeans> javascripDetailBeans;

	public List<JavascripDetailBeans> getJavascripDetailBeans() {
		return javascripDetailBeans;
	}

	public void setJavascripDetailBeans(List<JavascripDetailBeans> javascripDetailBeans) {
		this.javascripDetailBeans = javascripDetailBeans;
	}
}
