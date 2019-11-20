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
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * XapiCredentialPermissionsLevelSchema
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-11-19T22:54:47.497-06:00")
public class XapiCredentialPermissionsLevelSchema {
  /**
   * Gets or Sets xapiCredentialPermissionsLevel
   */
  public enum XapiCredentialPermissionsLevelEnum {
    DEFAULT("DEFAULT"),
    
    USER("USER"),
    
    ROOT("ROOT"),
    
    READONLY("READONLY"),
    
    WRITEONLY("WRITEONLY");

    private String value;

    XapiCredentialPermissionsLevelEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static XapiCredentialPermissionsLevelEnum fromValue(String text) {
      for (XapiCredentialPermissionsLevelEnum b : XapiCredentialPermissionsLevelEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("xapiCredentialPermissionsLevel")
  private XapiCredentialPermissionsLevelEnum xapiCredentialPermissionsLevel = null;

  public XapiCredentialPermissionsLevelSchema xapiCredentialPermissionsLevel(XapiCredentialPermissionsLevelEnum xapiCredentialPermissionsLevel) {
    this.xapiCredentialPermissionsLevel = xapiCredentialPermissionsLevel;
    return this;
  }

   /**
   * Get xapiCredentialPermissionsLevel
   * @return xapiCredentialPermissionsLevel
  **/
  @ApiModelProperty(example = "null", value = "")
  public XapiCredentialPermissionsLevelEnum getXapiCredentialPermissionsLevel() {
    return xapiCredentialPermissionsLevel;
  }

  public void setXapiCredentialPermissionsLevel(XapiCredentialPermissionsLevelEnum xapiCredentialPermissionsLevel) {
    this.xapiCredentialPermissionsLevel = xapiCredentialPermissionsLevel;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    XapiCredentialPermissionsLevelSchema xapiCredentialPermissionsLevelSchema = (XapiCredentialPermissionsLevelSchema) o;
    return Objects.equals(this.xapiCredentialPermissionsLevel, xapiCredentialPermissionsLevelSchema.xapiCredentialPermissionsLevel);
  }

  @Override
  public int hashCode() {
    return Objects.hash(xapiCredentialPermissionsLevel);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class XapiCredentialPermissionsLevelSchema {\n");
    
    sb.append("    xapiCredentialPermissionsLevel: ").append(toIndentedString(xapiCredentialPermissionsLevel)).append("\n");
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

