package com.techm.repository;

import java.io.Serializable;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.techm.beans.ComponentScreenData;


public interface ComponentScreenDataRepository extends MongoRepository<ComponentScreenData,Serializable>{
	
	ComponentScreenData findByComponentName(String componentName);

}
