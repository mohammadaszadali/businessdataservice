package com.techm.designer.bean;

public class PageLockBean {
	private Boolean isLock;
	private String lockBy;
	//private String userId;
	private Integer pageId;
	private String status;
	private String message;
	
	
	
	public String getStatus() {
		return status;
	}
	public PageLockBean setStatus(String status) {
		this.status = status;
		return this;
	}
	public String getMessage() {
		return message;
	}
	public PageLockBean setMessage(String message) {
		this.message = message;
		return this;
	}
	public Boolean getIsLock() {
		return isLock;
	}
	public PageLockBean setIsLock(Boolean isLock) {
		this.isLock = isLock;
		return this;
	}
	public String getLockBy() {
		return lockBy;
	}
	public PageLockBean setLockBy(String lockBy) {
		this.lockBy = lockBy;
		return this;
	}
	/*public String getUserId() {
		return userId;
	}
	public PageLockBean setUserId(String userId) {
		this.userId = userId;
		return this;
	}*/
	public Integer getPageId() {
		return pageId;
	}
	public PageLockBean setPageId(Integer pageId) {
		this.pageId = pageId;
		return this;
	}
	
	
}
