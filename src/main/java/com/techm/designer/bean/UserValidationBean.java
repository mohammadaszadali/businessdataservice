package com.techm.designer.bean;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
@JsonInclude(Include.NON_EMPTY)
public class UserValidationBean {

	private String username;
	private String password; 
	private String userId;
	private String userPwd;
	private CookieData cookieData;
	private String redURL;
	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserPwd() {
		return userPwd;
	}

	public void setUserPwd(String userPwd) {
		this.userPwd = userPwd;
	}

	/**
	 * @return the username
	 */
	public String getUsername() {
		return username;
	}

	/**
	 * @param username the username to set
	 */
	public void setUsername(String username) {
		this.username = username;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * @return the cookieData
	 */
	public CookieData getCookieData() {
		return cookieData;
	}

	/**
	 * @param cookieData the cookieData to set
	 */
	public void setCookieData(CookieData cookieData) {
		this.cookieData = cookieData;
	}

	/**
	 * @return the redURL
	 */
	public String getRedURL() {
		return redURL;
	}

	/**
	 * @param redURL the redURL to set
	 */
	public void setRedURL(String redURL) {
		this.redURL = redURL;
	}

}
