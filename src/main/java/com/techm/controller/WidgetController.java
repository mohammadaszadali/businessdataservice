package com.techm.controller;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.techm.beans.ComponentValueData;
import com.techm.beans.RaapResponseBean;
import com.techm.common.CommonConstants;
import com.techm.errors.ServiceResponse;
import com.techm.service.ComponentDataService;



@RestController
@CrossOrigin(origins = "*")
@RequestMapping({ "/businessDataService/widgetController" })
public class WidgetController {
	
	@Autowired
	ComponentDataService componentService;
	
		
	@RequestMapping(method = { RequestMethod.POST }, value = { "/getBusinessWidget/{appId}/{widgetId}" }, produces = { "application/json" })
	@ResponseBody
	public ResponseEntity<?> getWidgetData(@PathVariable Integer appId,@PathVariable Integer widgetId) {
		
		    if(appId!=null && widgetId != null) {
		        try {
		               
		        	  RaapResponseBean raapBean= componentService.getSectionData(appId,widgetId);
		             
		               if(raapBean !=null) {
		                     return new ResponseEntity<RaapResponseBean>(raapBean, HttpStatus.OK);            
		               }else {
		                     ServiceResponse serRes = new ServiceResponse(HttpStatus.NO_CONTENT.toString(), CommonConstants.NO_CONTENT);
		                     return new ResponseEntity<ServiceResponse>(serRes, HttpStatus.NO_CONTENT);
		               }
		        } catch (Exception e) {
		              
		               ServiceResponse serRes = new ServiceResponse(HttpStatus.INTERNAL_SERVER_ERROR.toString(), CommonConstants.INTERNAL_SERVER_ERROR);
		               return new ResponseEntity<ServiceResponse>(serRes, HttpStatus.INTERNAL_SERVER_ERROR);
		        }
			}else {
				ServiceResponse serRes = new ServiceResponse(HttpStatus.BAD_REQUEST.toString(), CommonConstants.BAD_REQUEST);
				return new ResponseEntity<ServiceResponse>(serRes, HttpStatus.BAD_REQUEST);
			}
		
	}
	
	
}
