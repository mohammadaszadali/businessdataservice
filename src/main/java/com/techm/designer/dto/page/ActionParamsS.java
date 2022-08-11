package com.techm.designer.dto.page;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "actionParams")
@JsonIgnoreProperties(ignoreUnknown=true)
public class ActionParamsS {
/*	@XmlElement(name="actionParam")
	private List<ActionParamS> actionParam;

	public List<ActionParamS> getActionParam() {
		return actionParam;
	}

	public void setActionParam(List<ActionParamS> actionParam) {
		this.actionParam = actionParam;
	}*/
	
	private String beanClass;
	private String valueType;
	private String paramName;
	private String packageName;

	
	
}
