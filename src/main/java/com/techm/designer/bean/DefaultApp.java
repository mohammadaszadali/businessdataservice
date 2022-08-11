package com.techm.designer.bean;

public class DefaultApp {

	
Integer id;
String name;
String value;
public Integer getId() {
	return id;
}
public void setId(Integer id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getValue() {
	return value;
}

public void setValue(String value) {
	this.value = value;
}
@Override
public String toString() {
	return "DefaultApp [id=" + id + ", name=" + name + ", value=" + value + "]";
}

}
