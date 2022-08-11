package com.techm.repository;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.techm.designer.dto.page.BusinessWidget;

public interface BusinessWidgetMgtRepository extends MongoRepository<BusinessWidget, Serializable>{
	
	List<BusinessWidget> findByAppId(Integer appId);
	List<BusinessWidget> findByAppIdAndId(Integer appId,Integer Id);
	
}
