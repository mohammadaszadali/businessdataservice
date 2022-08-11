package com.techm.designer.dto.page;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown=true)
public class FlowRuleBinding {

	private Integer navigationTypeId;
	private Integer ruleId;
	private Boolean flowRule;
	private String ruleName;
	private String flowName;
	private String flowType;
	private Integer flowId;
	private Integer flowTypeId;
	private Boolean navigationRule;
	private List<Condition> conditions;
	private List<NavigationCase> navigationCase;
	private String text;
	/**
	 * @return the navigationTypeId
	 */
	public Integer getNavigationTypeId() {
		return navigationTypeId;
	}

	/**
	 * @param navigationTypeId the navigationTypeId to set
	 */
	public void setNavigationTypeId(Integer navigationTypeId) {
		this.navigationTypeId = navigationTypeId;
	}

	/**
	 * @return the flowRule
	 */
	public Boolean getFlowRule() {
		return flowRule;
	}

	/**
	 * @param flowRule the flowRule to set
	 */
	public void setFlowRule(Boolean flowRule) {
		this.flowRule = flowRule;
	}

	/**
	 * @return the ruleName
	 */
	public String getRuleName() {
		return ruleName;
	}

	/**
	 * @param ruleName the ruleName to set
	 */
	public void setRuleName(String ruleName) {
		this.ruleName = ruleName;
	}

	/**
	 * @return the flowName
	 */
	public String getFlowName() {
		return flowName;
	}

	/**
	 * @param flowName the flowName to set
	 */
	public void setFlowName(String flowName) {
		this.flowName = flowName;
	}

	/**
	 * @return the flowType
	 */
	public String getFlowType() {
		return flowType;
	}

	/**
	 * @param flowType the flowType to set
	 */
	public void setFlowType(String flowType) {
		this.flowType = flowType;
	}

	/**
	 * @return the flowId
	 */
	public Integer getFlowId() {
		return flowId;
	}

	/**
	 * @param flowId the flowId to set
	 */
	public void setFlowId(Integer flowId) {
		this.flowId = flowId;
	}

	/**
	 * @return the flowTypeId
	 */
	public Integer getFlowTypeId() {
		return flowTypeId;
	}

	/**
	 * @param flowTypeId the flowTypeId to set
	 */
	public void setFlowTypeId(Integer flowTypeId) {
		this.flowTypeId = flowTypeId;
	}

	/**
	 * @return the conditions
	 */
	public List<Condition> getConditions() {
		return conditions;
	}

	/**
	 * @param conditions the conditions to set
	 */
	public void setConditions(List<Condition> conditions) {
		this.conditions = conditions;
	}

	/**
	 * @return the navigationRule
	 */
	public Boolean getNavigationRule() {
		return navigationRule;
	}

	/**
	 * @param navigationRule the navigationRule to set
	 */
	public void setNavigationRule(Boolean navigationRule) {
		this.navigationRule = navigationRule;
	}

	/**
	 * @return the navigationCase
	 */
	public List<NavigationCase> getNavigationCase() {
		return navigationCase;
	}

	/**
	 * @param navigationCase the navigationCase to set
	 */
	public void setNavigationCase(List<NavigationCase> navigationCase) {
		this.navigationCase = navigationCase;
	}

	/**
	 * @return the text
	 */
	public String getText() {
		return text;
	}

	/**
	 * @param text the text to set
	 */
	public void setText(String text) {
		this.text = text;
	}

	/**
	 * @return the ruleId
	 */
	public Integer getRuleId() {
		return ruleId;
	}

	/**
	 * @param ruleId the ruleId to set
	 */
	public void setRuleId(Integer ruleId) {
		this.ruleId = ruleId;
	}
	
	
}
