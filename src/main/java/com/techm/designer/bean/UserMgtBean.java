package com.techm.designer.bean;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
@JsonInclude(Include.NON_EMPTY)
@Document(collection="userdetails")
public class UserMgtBean {
	@Id
	@JsonIgnore
	private String id;
	private UserBean user;
	private List<UserRole> roles;
	private List<Tag> tag;
	private Tag defaultTag;
	private String defaultAppId;
	private List<ActionTag> actionTags;
	

	/**
	 * @return the id
	 */

	public String getId() {
		return id;
	}
	public String getDefaultAppId() {
		return defaultAppId;
	}
	public void setDefaultAppId(String defaultAppId) {
		this.defaultAppId = defaultAppId;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}
	/**
	 * @return the user
	 */
	public UserBean getUser() {
		return user;
	}
	/**
	 * @param user the user to set
	 */
	public void setUser(UserBean user) {
		this.user = user;
	}
	/**
	 * @return the roles
	 */
	public List<UserRole> getRoles() {
		return roles;
	}
	/**
	 * @param roles the roles to set
	 */
	public void setRoles(List<UserRole> roles) {
		this.roles = roles;
	}
	/**
	 * @return the tag
	 */
	public List<Tag> getTag() {
		return tag;
	}
	/**
	 * @param tag the tag to set
	 */
	public void setTag(List<Tag> tag) {
		this.tag = tag;
	}
	/**
	 * @return the defaultTag
	 */
	public Tag getDefaultTag() {
		return defaultTag;
	}
	/**
	 * @param defaultTag the defaultTag to set
	 */
	public void setDefaultTag(Tag defaultTag) {
		this.defaultTag = defaultTag;
	}
	/**
	 * @return the actionTags
	 */
	public List<ActionTag> getActionTags() {
		return actionTags;
	}
	/**
	 * @param actionTags the actionTags to set
	 */
	public void setActionTags(List<ActionTag> actionTags) {
		this.actionTags = actionTags;
	}
	
	@Override
	public String toString() {
		return "UserMgtBean [id=" + id + ", user=" + user + ", roles=" + roles + ", tag=" + tag + ", defaultTag="
				+ defaultTag + ", actionTags=" + actionTags +  "]";
	}


}
