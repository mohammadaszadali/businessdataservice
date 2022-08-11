package com.techm.service;

import java.util.HashMap;
import java.util.Map;

import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.techm.beans.CommonActionBean;
import com.techm.beans.ComponentScreenData;
import com.techm.beans.ComponentValueData;
import com.techm.beans.RaapResponseBean;
import com.techm.common.CommonConstants;
import com.techm.designer.dao.BusinessWidgetMgtRepository;
import com.techm.designer.dto.page.BusinessWidget;
import com.techm.repository.ComponentScreenDataRepository;
import com.techm.repository.ComponentValueDataRepository;

@Service
public class ComponentDataService {

	@Autowired
	private BusinessWidgetMgtRepository businessWidgetRepository;
	
	@Autowired
	CommonActionBean commonActionBean;

	@Autowired
	MongoOperations mongoOperations;

	@Value("${serviceUrl}")
	private String serviceUrl;

	

	public RaapResponseBean getSectionData(Integer appId, Integer widgetId) {

		RaapResponseBean raapBean = new RaapResponseBean();

		BusinessWidget widget = (BusinessWidget) businessWidgetRepository.findByAppIdAndId(appId,widgetId);
		//ComponentValueData componentValueData = componentValueDataRepository.findByComponentName(componentName);

		if (widget != null) {
			raapBean.setStatus("SUCCESS");
			Map<String, Object> result = new HashMap<String, Object>();
			result.put(CommonConstants.SCREEN_JSON, widget);
			raapBean.setResponseMap(result);
			return raapBean;

		} else {
			return null;

		}
		
		

	

		
		
		
	}

	
}
