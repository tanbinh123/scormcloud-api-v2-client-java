/*
 * SCORM Cloud Rest API
 * REST API used for SCORM Cloud integrations.
 *
 * OpenAPI spec version: 2.0 beta
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

/**
 * https://github.com/adlnet/xAPI-Spec/blob/1.0.2/xAPI.md#statement-references
 */
@ApiModel(description = "https://github.com/adlnet/xAPI-Spec/blob/1.0.2/xAPI.md#statement-references")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-03-26T00:55:07.262-05:00")
public class XapiStatementReference {
  @JsonProperty("objectType")
  private String objectType = "StatementRef";

  @JsonProperty("id")
  private String id = null;

  public XapiStatementReference objectType(String objectType) {
    this.objectType = objectType;
    return this;
  }

   /**
   * Get objectType
   * @return objectType
  **/
  @ApiModelProperty(required = true, value = "")
  public String getObjectType() {
    return objectType;
  }

  public void setObjectType(String objectType) {
    this.objectType = objectType;
  }

  public XapiStatementReference id(String id) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    XapiStatementReference xapiStatementReference = (XapiStatementReference) o;
    return Objects.equals(this.objectType, xapiStatementReference.objectType) &&
        Objects.equals(this.id, xapiStatementReference.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(objectType, id);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class XapiStatementReference {\n");
    
    sb.append("    objectType: ").append(toIndentedString(objectType)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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

