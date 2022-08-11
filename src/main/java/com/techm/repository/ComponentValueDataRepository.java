package com.techm.repository;

import java.io.Serializable;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.techm.beans.ComponentValueData;

public interface ComponentValueDataRepository extends MongoRepository<ComponentValueData, Serializable>{
	
	ComponentValueData findByComponentName(String componentName);

}
