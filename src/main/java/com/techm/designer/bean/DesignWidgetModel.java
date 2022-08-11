package com.techm.designer.bean;

import java.util.List;


public class DesignWidgetModel {
	
	private List<DesignModel> designModel;
	
	private List<WidgetModel> widgetModel;

	private List<ElementProperties> elementProperties; 
	 
	public List<DesignModel> getDesignModel() {
		return designModel;
	}

	public void setDesignModel(List<DesignModel> designModel) {
		this.designModel = designModel;
	}

	public List<WidgetModel> getWidgetModel() {
		return widgetModel;
	}

	public void setWidgetModel(List<WidgetModel> widgetModel) {
		this.widgetModel = widgetModel;
	}

	/**
	 * @return the elementProperties
	 */
	public List<ElementProperties> getElementProperties() {
		return elementProperties;
	}

	/**
	 * @param elementProperties the elementProperties to set
	 */
	public void setElementProperties(List<ElementProperties> elementProperties) {
		this.elementProperties = elementProperties;
	}
	
	
	

}
