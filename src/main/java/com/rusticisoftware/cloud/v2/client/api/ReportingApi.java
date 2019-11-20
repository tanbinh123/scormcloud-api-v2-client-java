package com.rusticisoftware.cloud.v2.client.api;

import com.rusticisoftware.cloud.v2.client.ApiException;
import com.rusticisoftware.cloud.v2.client.ApiClient;
import com.rusticisoftware.cloud.v2.client.Configuration;
import com.rusticisoftware.cloud.v2.client.Pair;

import javax.ws.rs.core.GenericType;

import com.rusticisoftware.cloud.v2.client.model.MessageSchema;
import com.rusticisoftware.cloud.v2.client.model.ReportageAccountInfoSchema;
import com.rusticisoftware.cloud.v2.client.model.ReportageAuthTokenSchema;
import com.rusticisoftware.cloud.v2.client.model.ReportageLinkSchema;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-11-19T22:54:47.497-06:00")
public class ReportingApi {
  private ApiClient apiClient;

  public ReportingApi() {
    this(Configuration.getDefaultApiClient());
  }

  public ReportingApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Get all of the account information specified by the given app ID
   * Get all of the account information specified by the given app ID
   * @return ReportageAccountInfoSchema
   * @throws ApiException if fails to make API call
   */
  public ReportageAccountInfoSchema getAccountInfo() throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/reporting/accountInfo".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "APP_NORMAL", "OAUTH" };

    GenericType<ReportageAccountInfoSchema> localVarReturnType = new GenericType<ReportageAccountInfoSchema>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Get a session authentication token to use when launching Reportage
   * Get a session authentication token to use when launching Reportage
   * @param navPermission The navigation permissions for this Reportage session (required)
   * @param admin Grant admin privileges to this Reportage session (optional, default to false)
   * @return ReportageAuthTokenSchema
   * @throws ApiException if fails to make API call
   */
  public ReportageAuthTokenSchema getReportageAuthToken(String navPermission, Boolean admin) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'navPermission' is set
    if (navPermission == null) {
      throw new ApiException(400, "Missing the required parameter 'navPermission' when calling getReportageAuthToken");
    }
    
    // create path and map variables
    String localVarPath = "/reporting/reportageAuth".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "navPermission", navPermission));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "admin", admin));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "APP_NORMAL", "OAUTH" };

    GenericType<ReportageAuthTokenSchema> localVarReturnType = new GenericType<ReportageAuthTokenSchema>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Get the link to a page in Reportage with the given authentication and permissions
   * Get the link to a page in Reportage with the given authentication and permissions
   * @param auth The reportage authentication token retrieved from a previous call to &#x60;GET reportageAuth&#x60; (required)
   * @param reportUrl The Reportage URL to try and access (required)
   * @return ReportageLinkSchema
   * @throws ApiException if fails to make API call
   */
  public ReportageLinkSchema getReportageLink(String auth, String reportUrl) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'auth' is set
    if (auth == null) {
      throw new ApiException(400, "Missing the required parameter 'auth' when calling getReportageLink");
    }
    
    // verify the required parameter 'reportUrl' is set
    if (reportUrl == null) {
      throw new ApiException(400, "Missing the required parameter 'reportUrl' when calling getReportageLink");
    }
    
    // create path and map variables
    String localVarPath = "/reporting/reportageLink".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "auth", auth));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "reportUrl", reportUrl));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "APP_NORMAL", "OAUTH" };

    GenericType<ReportageLinkSchema> localVarReturnType = new GenericType<ReportageLinkSchema>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
}
