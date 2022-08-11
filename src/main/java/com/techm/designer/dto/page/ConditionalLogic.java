package com.techm.designer.dto.page;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "conditionalLogic")
@JsonIgnoreProperties(ignoreUnknown=true)
public class ConditionalLogic {

	private List<WhenCondition> when;
	private List<ThenCondition> then;
	/**
	 * @return the when
	 */
	public List<WhenCondition> getWhen() {
		return when;
	}
	/**
	 * @param when the when to set
	 */
	public void setWhen(List<WhenCondition> when) {
		this.when = when;
	}
	/**
	 * @return the then
	 */
	public List<ThenCondition> getThen() {
		return then;
	}
	/**
	 * @param then the then to set
	 */
	public void setThen(List<ThenCondition> then) {
		this.then = then;
	}
	

	
	

}
