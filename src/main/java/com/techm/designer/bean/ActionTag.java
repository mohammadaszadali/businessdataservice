package com.techm.designer.bean;

import java.util.List;

public class ActionTag {
	
	private List<Tag> tags;
	private List<Action> actions;
	
	private Boolean readOnly;
	
	
	/**
	 * @return the readOnly
	 */
	public Boolean getReadOnly() {
		return readOnly;
	}
	/**
	 * @param readOnly the readOnly to set
	 */
	public void setReadOnly(Boolean readOnly) {
		this.readOnly = readOnly;
	}
	/**
	 * @return the tags
	 */
	public List<Tag> getTags() {
		return tags;
	}
	/**
	 * @param tags the tags to set
	 */
	public void setTags(List<Tag> tags) {
		this.tags = tags;
	}
	/**
	 * @return the actions
	 */
	public List<Action> getActions() {
		return actions;
	}
	/**
	 * @param actions the actions to set
	 */
	public void setActions(List<Action> actions) {
		this.actions = actions;
	}
	
	


}
