package com.techm.designer.dto.page;

import java.io.Serializable;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "beanBinding")
@JsonIgnoreProperties(ignoreUnknown=true)
public class BeanBinding implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@XmlElement(name="beanMapping")
	private List<BeanMapping> beanMapping;

	public List<BeanMapping> getBeanMapping() {
		return beanMapping;
	}

	public void setBeanMapping(List<BeanMapping> beanMapping) {
		this.beanMapping = beanMapping;
	}

}
