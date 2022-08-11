package com.techm.beans;

import java.io.InputStream;
import java.util.List;
import java.util.Map;

import org.json.JSONObject;

import com.techm.common.CommonConstants;

public class ResponseParam {
	private boolean headerIcons;
	private boolean screenJSON=true;
	private boolean completeValueJSON;
	private boolean userProfileBean;
	private boolean commonActionBean;
	private boolean flexGeneratedCR;
	private boolean commonJSON;
	private String status;
	private String message;
	private boolean isMsg=true;
	private boolean isWorklistJSON;
	private boolean isValueJSON=true;
	private boolean isD3Response;
	private boolean isCloseWorklist;
	private boolean isHeaderJSON;
	private boolean isFooterJSON;
	private boolean isCreateTicketJSON;
	private boolean isAttachment;
	private Map<String, Object> valueMap; 
	private ResponseBean responseBean;
	private boolean ajaxCall=false;
    private String ajaxRenderId;
    private String displayCol;
    private boolean isUserPrefOnWorklist=false;
    private boolean isDisabled = false;
    private String exceptionCode;
    private String exceptionStack;
    private JSONObject resultJSON;
    private String redirectURL;
    private Boolean writeResponse=true;
    
    
	/**
	 * @return the resultJSON
	 */
	public JSONObject getResultJSON() {
		return resultJSON;
	}
	/**
	 * @param resultJSON the resultJSON to set
	 */
	public void setResultJSON(JSONObject resultJSON) {
		this.resultJSON = resultJSON;
	}
	public String getExceptionCode() {
		return exceptionCode;
	}
	public void setExceptionCode(String exceptionCode) {
		this.exceptionCode = exceptionCode;
	}
	public String getExceptionStack() {
		return exceptionStack;
	}
	public void setExceptionStack(String exceptionStack) {
		this.exceptionStack = exceptionStack;
	}
	public boolean isDisabled() {
		return isDisabled;
	}
	public void setDisabled(boolean isDisabled) {
		this.isDisabled = isDisabled;
	}
	public boolean isAjaxCall() {
		return ajaxCall;
	}
	public void setAjaxCall(boolean ajaxCall) {
		this.ajaxCall = ajaxCall;
	}
	public String getAjaxRenderId() {
		return ajaxRenderId;
	}
	public void setAjaxRenderId(String ajaxRenderId) {
		this.ajaxRenderId = ajaxRenderId;
	}
	//FlowRules
	private String flowName;
	private String flowType;
	private String serviceName;
	//As per PageName execute Flow only for GammaTM
	private String pageName;
	private Map<String,String> affectedFieldsMap;
	private String screenJsonType=CommonConstants.FULL_SCREEN_JSON;
	
	private String fileName;
	private InputStream inputStream;
	private boolean isGammaCMAttachment;
	
	private boolean isReportSheetForGAMMACM;
	private boolean isNextPageAffectedFields=true;
	private boolean isCallOnLoadMethod;
	private boolean isChangeScreenJsonAsPerRule;
	private List<String> rulesList;
	private String myConfiguredWorklistId;
	private boolean screenJsonChangeForFlexVDB=false;
	private boolean flexDBViewUpdateColorCodingRule=false;
	public String getActiveCategoryID() {
		return activeCategoryID;
	}
	public void setActiveCategoryID(String activeCategoryID) {
		this.activeCategoryID = activeCategoryID;
	}
	public String getActiveSubCategoryID() {
		return activeSubCategoryID;
	}
	public void setActiveSubCategoryID(String activeSubCategoryID) {
		this.activeSubCategoryID = activeSubCategoryID;
	}
	private boolean isViewTicketJSON;
	private String activeCategoryID;
	private String activeSubCategoryID;
	private boolean dashboardView=false;
	private boolean partialScreenJson;
	public void setViewTicketJSON(boolean isViewTicketJSON) {
		this.isViewTicketJSON = isViewTicketJSON;
	}
	public boolean isViewTicketJSON() {
		return isViewTicketJSON;
	}
	private String componentId;
	private String sectionName;
	
	private JSONObject screenJSONObject;
	public boolean isHeaderIcons() {
		return headerIcons;
	}
	public void setHeaderIcons(boolean headerIcons) {
		this.headerIcons = headerIcons;
	}
	public boolean isScreenJSON() {
		return screenJSON;
	}
	public void setScreenJSON(boolean screenJSON) {
		this.screenJSON = screenJSON;
	}
	public boolean isCompleteValueJSON() {
		return completeValueJSON;
	}
	public void setCompleteValueJSON(boolean completeValueJSON) {
		this.completeValueJSON = completeValueJSON;
	}
	public boolean isUserProfileBean() {
		return userProfileBean;
	}
	public void setUserProfileBean(boolean userProfileBean) {
		this.userProfileBean = userProfileBean;
	}
	public boolean isCommonActionBean() {
		return commonActionBean;
	}
	public void setCommonActionBean(boolean commonActionBean) {
		this.commonActionBean = commonActionBean;
	}
	public boolean isCommonJSON() {
		return commonJSON;
	}
	public void setCommonJSON(boolean commonJSON) {
		this.commonJSON = commonJSON;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public boolean isMsg() {
		return isMsg;
	}
	public void setMsg(boolean isMsg) {
		this.isMsg = isMsg;
	}
	public boolean isWorklistJSON() {
		return isWorklistJSON;
	}
	public void setWorklistJSON(boolean isWorklistJSON) {
		this.isWorklistJSON = isWorklistJSON;
	}
	public boolean isValueJSON() {
		return isValueJSON;
	}
	public void setValueJSON(boolean isValueJSON) {
		this.isValueJSON = isValueJSON;
	}
	public boolean isD3Response() {
		return isD3Response;
	}
	public void setD3Response(boolean isD3Response) {
		this.isD3Response = isD3Response;
	}
	public boolean isCloseWorklist() {
		return isCloseWorklist;
	}
	public void setCloseWorklist(boolean isCloseWorklist) {
		this.isCloseWorklist = isCloseWorklist;
	}
	public boolean isHeaderJSON() {
		return isHeaderJSON;
	}
	public void setHeaderJSON(boolean isHeaderJSON) {
		this.isHeaderJSON = isHeaderJSON;
	}
	public boolean isFooterJSON() {
		return isFooterJSON;
	}
	public void setFooterJSON(boolean isFooterJSON) {
		this.isFooterJSON = isFooterJSON;
	}
	public boolean isCreateTicketJSON() {
		return isCreateTicketJSON;
	}
	public void setCreateTicketJSON(boolean isCreateTicketJSON) {
		this.isCreateTicketJSON = isCreateTicketJSON;
	}
	public String getComponentId() {
		return componentId;
	}
	public void setComponentId(String componentId) {
		this.componentId = componentId;
	}
	public Map<String, Object> getValueMap() {
		return valueMap;
	}
	public void setValueMap(Map<String, Object> valueMap) {
		this.valueMap = valueMap;
	}
	public String getScreenJsonType() {
		return screenJsonType;
	}
	public void setScreenJsonType(String screenJsonType) {
		this.screenJsonType = screenJsonType;
	}
	public String getFlowName() {
		return flowName;
	}
	public void setFlowName(String flowName) {
		this.flowName = flowName;
	}
	public String getFlowType() {
		return flowType;
	}
	public void setFlowType(String flowType) {
		this.flowType = flowType;
	}
	public String getServiceName() {
		return serviceName;
	}
	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
	}
	public Map<String, String> getAffectedFieldsMap() {
		return affectedFieldsMap;
	}
	public void setAffectedFieldsMap(Map<String, String> affectedFieldsMap) {
		this.affectedFieldsMap = affectedFieldsMap;
	}
	public boolean isAttachment() {
		return isAttachment;
	}
	public void setAttachment(boolean isAttachment) {
		this.isAttachment = isAttachment;
	}
	public String getFileName() {
		return fileName;
	}
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	public InputStream getInputStream() {
		return inputStream;
	}
	public void setInputStream(InputStream inputStream) {
		this.inputStream = inputStream;
	}
	public ResponseBean getResponseBean() {
		return responseBean;
	}
	public void setResponseBean(ResponseBean responseBean) {
		this.responseBean = responseBean;
	}
	public String getPageName() {
		return pageName;
	}
	public void setPageName(String pageName) {
		this.pageName = pageName;
	}
	public boolean isGammaCMAttachment() {
		return isGammaCMAttachment;
	}
	public void setGammaCMAttachment(boolean isGammaCMAttachment) {
		this.isGammaCMAttachment = isGammaCMAttachment;
	}
	public boolean isReportSheetForGAMMACM() {
		return isReportSheetForGAMMACM;
	}
	public void setReportSheetForGAMMACM(boolean isReportSheetForGAMMACM) {
		this.isReportSheetForGAMMACM = isReportSheetForGAMMACM;
	}
	public boolean isNextPageAffectedFields() {
		return isNextPageAffectedFields;
	}
	public void setNextPageAffectedFields(boolean isNextPageAffectedFields) {
		this.isNextPageAffectedFields = isNextPageAffectedFields;
	}
	public boolean isCallOnLoadMethod() {
		return isCallOnLoadMethod;
	}
	public void setCallOnLoadMethod(boolean isCallOnLoadMethod) {
		this.isCallOnLoadMethod = isCallOnLoadMethod;
	}

	public String getMyConfiguredWorklistId() {
		return myConfiguredWorklistId;
	}
	public void setMyConfiguredWorklistId(String myConfiguredWorklistId) {
		this.myConfiguredWorklistId = myConfiguredWorklistId;
	}
	public boolean isChangeScreenJsonAsPerRule() {
		return isChangeScreenJsonAsPerRule;
	}
	public void setChangeScreenJsonAsPerRule(boolean isChangeScreenJsonAsPerRule) {
		this.isChangeScreenJsonAsPerRule = isChangeScreenJsonAsPerRule;
	}
	public List<String> getRulesList() {
		return rulesList;
	}
	public void setRulesList(List<String> rulesList) {
		this.rulesList = rulesList;
	}
	public boolean isDashboardView() {
		return dashboardView;
	}
	public void setDashboardView(boolean dashboardView) {
		this.dashboardView = dashboardView;
	}
	public boolean isScreenJsonChangeForFlexVDB() {
		return screenJsonChangeForFlexVDB;
	}
	public void setScreenJsonChangeForFlexVDB(boolean screenJsonChangeForFlexVDB) {
		this.screenJsonChangeForFlexVDB = screenJsonChangeForFlexVDB;
	}
	public void setScreenJSONObject(JSONObject screenJSONObject) {
		this.screenJSONObject=screenJSONObject;		
	}
	public JSONObject getScreenJSONObject(){
		return screenJSONObject;
	}
	public boolean isFlexDBViewUpdateColorCodingRule() {
		return flexDBViewUpdateColorCodingRule;
	}
	public void setFlexDBViewUpdateColorCodingRule(
			boolean flexDBViewUpdateColorCodingRule) {
		this.flexDBViewUpdateColorCodingRule = flexDBViewUpdateColorCodingRule;
	}
	public boolean isPartialScreenJson() {
		return partialScreenJson;
	}
	public void setPartialScreenJson(boolean partialScreenJson) {
		this.partialScreenJson = partialScreenJson;
	}
	public boolean isFlexGeneratedCR() {
		return flexGeneratedCR;
	}
	public void setFlexGeneratedCR(boolean flexGeneratedCR) {
		this.flexGeneratedCR = flexGeneratedCR;
	}
	public String getDisplayCol() {
		return displayCol;
	}
	public void setDisplayCol(String displayCol) {
		this.displayCol = displayCol;
	}
	public boolean isUserPrefOnWorklist() {
		return isUserPrefOnWorklist;
	}
	public void setUserPrefOnWorklist(boolean isUserPrefOnWorklist) {
		this.isUserPrefOnWorklist = isUserPrefOnWorklist;
	}
	public String getSectionName() {
		return sectionName;
	}
	public void setSectionName(String sectionName) {
		this.sectionName = sectionName;
	}
	public String getRedirectURL() {
		return redirectURL;
	}
	public void setRedirectURL(String redirectURL) {
		this.redirectURL = redirectURL;
	}
	public Boolean getWriteResponse() {
		return writeResponse;
	}
	public void setWriteResponse(Boolean writeResponse) {
		this.writeResponse = writeResponse;
	}
	
}
