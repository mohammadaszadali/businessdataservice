package com.techm.designer.bean;

import java.io.Serializable;
import java.util.List;

public class GraphTree  implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer id;
	private String cat;
	private int val=1;
	private String color;
	private List<GraphTree> children;
//	private String value;
	
	
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCat() {
		return cat;
	}

	public void setCat(String cat) {
		this.cat = cat;
	}


	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public List<GraphTree> getChildren() {
		return children;
	}

	public void setChildren(List<GraphTree> children) {
		this.children = children;
	}

	public int getVal() {
		return val;
	}

	public void setVal(int val) {
		this.val = val;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	
	
}
