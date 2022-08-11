
package com.techm.designer.bean;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "name",
    "value",
    "_parents"
})
public class Input {

    @JsonProperty("name")
    private String name;
    
    @JsonProperty("value")
    private String value;
    
    @JsonProperty("id")
    private String id;
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

    public Input withName(String name) {
        this.name = name;
        return this;
    }

    @JsonProperty("id")
    public String getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    public Input withId(String id) {
        this.id = id;
        return this;
    }


    public List<Parent_> getParents() {
		return parents;
	}

	public void setParents(List<Parent_> parents) {
		this.parents = parents;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}
	
	
}
