package com.techm.designer.bean;

import org.springframework.data.annotation.Id;

public class Environment {
	@Id
	private String environment;
	private String database;
	private String host;
	private String port;
	private String userName;
	private String password;
	private String admin;
	private String replicaSetName;
	public String getEnvironment() {
		return environment;
	}
	public void setEnvironment(String environment) {
		this.environment = environment;
	}
	public String getDatabase() {
		return database;
	}
	public void setDatabase(String database) {
		this.database = database;
	}
	public String getHost() {
		return host;
	}
	public void setHost(String host) {
		this.host = host;
	}
	public String getPort() {
		return port;
	}
	public void setPort(String port) {
		this.port = port;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getAdmin() {
		return admin;
	}
	public void setAdmin(String admin) {
		this.admin = admin;
	}
	public String getReplicaSetName() {
		return replicaSetName;
	}
	public void setReplicaSetName(String replicaSetName) {
		this.replicaSetName = replicaSetName;
	}
	
	
}
