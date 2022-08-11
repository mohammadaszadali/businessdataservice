
package com.techm.designer.bean;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "name",
    "value",
    "id",
    "_parents"
})
public class Parent_ {

    @JsonProperty("name")
    private String name;
    
    @JsonProperty("value")
    private String value;

    @JsonProperty("value")
	public String getValue() {
		return value;
	}
    @JsonProperty("value")
	public void setValue(String value) {
		this.value = value;
	}
    
    @JsonProperty("id")
    private Integer id;
    @JsonProperty("_parents")
    private List<Parent_> parents = new ArrayList<Parent_>();

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }


    @JsonProperty("id")
    public Integer getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(Integer id) {
        this.id = id;
    }


    @JsonProperty("_parents")
    public List<Parent_> getParents() {
        return parents;
    }

    @JsonProperty("_parents")
    public void setParents(List<Parent_> parents) {
        this.parents = parents;
    }

}
