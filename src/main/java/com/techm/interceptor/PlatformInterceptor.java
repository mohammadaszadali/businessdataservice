package com.techm.interceptor;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.config.BeanNames;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import com.techm.beans.CommonActionBean;
import com.techm.beans.RaapResponseBean;
import com.techm.beans.ResponseParam;
import com.techm.common.CommonConstants;
/*import com.techm.pageBean.PageBean;
import com.techm.phenom.Helper.FrameworkHelper;
import com.techm.phenom.Utility.CommonUtilities;
import com.techm.phenom.Utility.FrameworkUtilities;
import com.techm.phenom.Utility.JsonUtils;*/

public class PlatformInterceptor implements HandlerInterceptor {
	//public static final Logger logger = LogManager.getLogger("PlatformInterceptor");
	@Autowired
	CommonActionBean commonActionBean;

	@Autowired
	RaapResponseBean raapResponseBean;
	
	
	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object arg2, Exception arg3)
			throws Exception {
		// TODO Auto-generated method stub
		
	}

/*	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object arg2, ModelAndView arg3){
		try {
		
		 * String appId = (String) request.getSession().getAttribute("appId");
		 * System.out.println("AppId" + appId); CommonActionBean commonActionBean_1 =
		 * (CommonActionBean)
		 * FrameworkUtilities.getBeanObject(BeanNames.COMMON_ACTION_BEAN);
		 
		ResponseParam responseParam = raapResponseBean;
		if (responseParam != null) {

		
				if(responseParam.getWriteResponse()) {
					String res = createResponse(responseParam);
					if (responseParam.getScreenJSONObject() != null) {
						res = responseParam.getScreenJSONObject().toString();
					}
					CommonUtilities.writeResponse(response, res);
				}
			
		}
		}catch(Throwable t) {
			System.out.println("In PlatformInterceptor:postHandle()"+t.getMessage());
		}
		
	}*/


	
	/*public String createResponse(ResponseParam responseParam) throws IOException {

		//RaapResponseBean raapResponseBean = new RaapResponseBean();
		JSONObject raapResponseBean = new JSONObject();
		// Create Response Map
		//Map<String, Object> responseMap = new HashMap<String, Object>();
		JSONObject responseMap = new JSONObject();

		responseMap.put(CommonConstants.SCREEN_JSON_TYPE, CommonConstants.FULL_SCREEN_JSON);

		// Set Screen JSON
		PageBean pageBean = (PageBean) FrameworkUtilities.getBeanObject(BeanNames.PAGE_BEAN);
		if (responseParam.isScreenJSON()) {
			// UserProfileBean userProfileBean = (UserProfileBean)
			// FrameworkUtilities.getBeanObject(BeanNames.USER_PROFILE_BEAN);

			responseMap.put(CommonConstants.SCREEN_JSON, new JSONObject(pageBean));
			// Set Screen JSON Type as Full/Partial
			responseMap.put(CommonConstants.SCREEN_JSON_TYPE, responseParam.getScreenJsonType());
		}

		Map<String, Object> valueMap = responseParam.getValueMap();
		if(valueMap == null) {
			responseMap.put(CommonConstants.VALUE_JSON, "");
		}else {
			responseMap.put(CommonConstants.VALUE_JSON, valueMap);
		}
		if (responseParam.isMsg() && responseParam.getMessage() != null) {
			// Set Message JSON
			responseMap.put(CommonConstants.MESSAGE_JSON, responseParam.getMessage());
		}

		// Create new RaapResponseBean

		// Set Response as status Success/Error/DataOnly/DataWithMsg/DataWithD3
		raapResponseBean.put("status", responseParam.getStatus());
		raapResponseBean.put("responseMap", responseMap);
		return raapResponseBean.toString();

	}*/
	
}
