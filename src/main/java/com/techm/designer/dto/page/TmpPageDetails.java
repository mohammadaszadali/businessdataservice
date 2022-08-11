package com.techm.designer.dto.page;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
@JsonInclude(Include.NON_NULL)
@SuppressWarnings("serial")
@Document(collection="tmpPageDetails")
@JsonIgnoreProperties(ignoreUnknown=true)
public class TmpPageDetails {
       @Id
       private Integer pageId;
       private PageData pageData;
       private String sessionId;
       

       public PageData getPageData() {
		return pageData;
	}
	public void setPageData(PageData pageData) {
		this.pageData = pageData;
	}
	public Integer getPageId() {
              return pageId;
       }
       public void setPageId(Integer pageId) {
              this.pageId = pageId;
       }
       /**
       * @return the pagedata
       */
       public String getSessionId() {
              return sessionId;
       }
       public void setSessionId(String sessionId) {
              this.sessionId = sessionId;
       }
       

}
