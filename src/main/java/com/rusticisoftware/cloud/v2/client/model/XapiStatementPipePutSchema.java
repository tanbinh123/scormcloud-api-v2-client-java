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
import com.rusticisoftware.cloud.v2.client.model.XapiEndpointSchema;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * XapiStatementPipePutSchema
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-03-06T09:44:40.358-06:00")
public class XapiStatementPipePutSchema {
  @JsonProperty("source")
  private XapiEndpointSchema source = null;

  @JsonProperty("target")
  private XapiEndpointSchema target = null;

  public XapiStatementPipePutSchema source(XapiEndpointSchema source) {
    this.source = source;
    return this;
  }

   /**
   * Get source
   * @return source
  **/
  @ApiModelProperty(example = "null", value = "")
  public XapiEndpointSchema getSource() {
    return source;
  }

  public void setSource(XapiEndpointSchema source) {
    this.source = source;
  }

  public XapiStatementPipePutSchema target(XapiEndpointSchema target) {
    this.target = target;
    return this;
  }

   /**
   * Get target
   * @return target
  **/
  @ApiModelProperty(example = "null", value = "")
  public XapiEndpointSchema getTarget() {
    return target;
  }

  public void setTarget(XapiEndpointSchema target) {
    this.target = target;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    XapiStatementPipePutSchema xapiStatementPipePutSchema = (XapiStatementPipePutSchema) o;
    return Objects.equals(this.source, xapiStatementPipePutSchema.source) &&
        Objects.equals(this.target, xapiStatementPipePutSchema.target);
  }

  @Override
  public int hashCode() {
    return Objects.hash(source, target);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class XapiStatementPipePutSchema {\n");
    
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    target: ").append(toIndentedString(target)).append("\n");
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

