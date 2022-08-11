package com.techm.designer.bean;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class HierarchyBean implements Serializable{

	private String artifact;
	private List<GraphTree> series;
	private List<GraphTree> drilldownChartData ;
	public List<GraphTree> getSeries() {
		return series;
	}
	public void setSeries(List<GraphTree> series) {
		this.series = series;
	}
	public List<GraphTree> getDrilldownChartData() {
		return drilldownChartData;
	}
	public void setDrilldownChartData(List<GraphTree> drilldownChartData) {
		this.drilldownChartData = drilldownChartData;
	}
	public String getArtifact() {
		return artifact;
	}
	public void setArtifact(String artifact) {
		this.artifact = artifact;
	}
}
