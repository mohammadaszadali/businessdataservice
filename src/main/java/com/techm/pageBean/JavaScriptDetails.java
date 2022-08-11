package com.techm.pageBean;

import java.io.Serializable;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "js")
public class JavaScriptDetails implements Serializable{

	@XmlElement(name="javascript")
	List<JavaScriptDetailBean> javaScriptDetailBeans ;
	
	public List<JavaScriptDetailBean> getJavaScriptDetailBeans() {
		return javaScriptDetailBeans;
	}
	
	public void setJavaScriptDetailBeans(
			List<JavaScriptDetailBean> javaScriptDetailBeans) {
		this.javaScriptDetailBeans = javaScriptDetailBeans;
	}
}
