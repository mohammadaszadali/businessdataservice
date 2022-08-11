package com.techm.designer.bean;

public class CSPAuthenticate {
	private String status;
	private String attuid;
	private String fName;
	private String lName;
	
	private UserMgtBean userMgtBean;		
	private String requestURL;
	/**
	 * @return the status
	 */
	public String getStatus() {
		return status;
	}
	/**
	 * @param status the status to set
	 */
	public void setStatus(String status) {
		this.status = status;
	}
	
	/**
	 * @return the userMgtBean
	 */
	public UserMgtBean getUserMgtBean() {
		return userMgtBean;
	}
	/**
	 * @param userMgtBean the userMgtBean to set
	 */
	public void setUserMgtBean(UserMgtBean userMgtBean) {
		this.userMgtBean = userMgtBean;
	}
	/**
	 * @return the requestURL
	 */
	public String getRequestURL() {
		return requestURL;
	}
	/**
	 * @param requestURL the requestURL to set
	 */
	public void setRequestURL(String requestURL) {
		this.requestURL = requestURL;
	}
	/**
	 * @return the attuid
	 */
	public String getAttuid() {
		return attuid;
	}
	/**
	 * @param attuid the attuid to set
	 */
	public void setAttuid(String attuid) {
		this.attuid = attuid;
	}
	/**
	 * @return the fName
	 */
	public String getfName() {
		return fName;
	}
	/**
	 * @param fName the fName to set
	 */
	public void setfName(String fName) {
		this.fName = fName;
	}
	/**
	 * @return the lName
	 */
	public String getlName() {
		return lName;
	}
	/**
	 * @param lName the lName to set
	 */
	public void setlName(String lName) {
		this.lName = lName;
	}
	
}
