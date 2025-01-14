/*
 * SCORM Cloud Rest API
 * REST API used for SCORM Cloud integrations.
 *
 * OpenAPI spec version: 2.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.rusticisoftware.cloud.v2.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * https://github.com/adlnet/xAPI-Spec/blob/1.0.2/xAPI.md#413-verb
 */
@ApiModel(description = "https://github.com/adlnet/xAPI-Spec/blob/1.0.2/xAPI.md#413-verb")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-11-05T13:19:45.469-05:00")
public class XapiVerb {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("display")
  private Map<String, String> display = null;

  public XapiVerb id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(required = true, value = "")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public XapiVerb display(Map<String, String> display) {
    this.display = display;
    return this;
  }

  public XapiVerb putDisplayItem(String key, String displayItem) {
    if (this.display == null) {
      this.display = new HashMap<>();
    }
    this.display.put(key, displayItem);
    return this;
  }

  /**
   * Get display
   * @return display
  **/
  @ApiModelProperty(value = "")
  public Map<String, String> getDisplay() {
    return display;
  }

  public void setDisplay(Map<String, String> display) {
    this.display = display;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    XapiVerb xapiVerb = (XapiVerb) o;
    return Objects.equals(this.id, xapiVerb.id) &&
        Objects.equals(this.display, xapiVerb.display);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, display);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class XapiVerb {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    display: ").append(toIndentedString(display)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

