package com.techm.designer.bean;

public enum Color {

	Red(1,"Red"), 
	Green(2,"Green"),
	Blue(3,"Blue"), 
	Yellow(4,"Yellow"), 
	Orange(5,"Orange"), 
	Pink(6,"Pink"), 
	White(7,"White"), 
	Black(8,"Black"), 
	Brown(9,"Brown"), 
	Purple(0,"Purple");
	
	private final int code;
	  private final String color;

	  private Color(int code, String color) {
	    this.code = code;
	    this.color = color;
	  }

	  public String getColor() {
	     return color;
	  }

	  public int getCode() {
	     return code;
	  }

}
