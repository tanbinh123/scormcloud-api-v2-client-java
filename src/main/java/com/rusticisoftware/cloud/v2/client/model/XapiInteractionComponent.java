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
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * https://github.com/adlnet/xAPI-Spec/blob/1.0.2/xAPI.md#interaction-components
 */
@ApiModel(description = "https://github.com/adlnet/xAPI-Spec/blob/1.0.2/xAPI.md#interaction-components")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-03-26T00:55:07.262-05:00")
public class XapiInteractionComponent {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("description")
  private Map<String, String> description = null;

  public XapiInteractionComponent id(String id) {
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

  public XapiInteractionComponent description(Map<String, String> description) {
    this.description = description;
    return this;
  }

  public XapiInteractionComponent putDescriptionItem(String key, String descriptionItem) {
    if (this.description == null) {
      this.description = new HashMap<>();
    }
    this.description.put(key, descriptionItem);
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @ApiModelProperty(value = "")
  public Map<String, String> getDescription() {
    return description;
  }

  public void setDescription(Map<String, String> description) {
    this.description = description;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    XapiInteractionComponent xapiInteractionComponent = (XapiInteractionComponent) o;
    return Objects.equals(this.id, xapiInteractionComponent.id) &&
        Objects.equals(this.description, xapiInteractionComponent.description);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, description);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class XapiInteractionComponent {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
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

