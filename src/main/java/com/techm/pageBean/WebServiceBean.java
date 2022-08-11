package com.techm.pageBean;

import java.io.Serializable;
import java.util.HashMap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "webService")
public class WebServiceBean implements Serializable {
	
		@XmlAttribute
		private String name;
		@XmlAttribute
		private String operation;
		@XmlAttribute
		private String mapping;
		@XmlAttribute
		private int callPriority;
		
		private transient HashMap<String,Object> extValMap;

		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getOperation() {
			return operation;
		}
		public void setOperation(String operation) {
			this.operation = operation;
		}
		public HashMap<String, Object> getExtValMap() {
			return extValMap;
		}
		public void setExtValMap(HashMap<String, Object> extValMap) {
			this.extValMap = extValMap;
		}
		/**
		 * @return the callPriority
		 */
		public int getCallPriority() {
			return callPriority;
		}
		/**
		 * @param callPriority the callPriority to set
		 */
		public void setCallPriority(int callPriority) {
			this.callPriority = callPriority;
		}
		/**
		 * @return the mapping
		 */
		public String getMapping() {
			return mapping;
		}
		/**
		 * @param mapping the mapping to set
		 */
		public void setMapping(String mapping) {
			this.mapping = mapping;
		}


		
	}


