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
import com.rusticisoftware.cloud.v2.client.model.TagPostSchema;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

/**
 * RegistrationTagsBatchSchema
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-03-26T00:55:07.262-05:00")
public class RegistrationTagsBatchSchema {
  @JsonProperty("registrationIds")
  private List<String> registrationIds = new ArrayList<>();

  @JsonProperty("tags")
  private TagPostSchema tags = null;

  public RegistrationTagsBatchSchema registrationIds(List<String> registrationIds) {
    this.registrationIds = registrationIds;
    return this;
  }

  public RegistrationTagsBatchSchema addRegistrationIdsItem(String registrationIdsItem) {
    this.registrationIds.add(registrationIdsItem);
    return this;
  }

   /**
   * Get registrationIds
   * @return registrationIds
  **/
  @ApiModelProperty(required = true, value = "")
  public List<String> getRegistrationIds() {
    return registrationIds;
  }

  public void setRegistrationIds(List<String> registrationIds) {
    this.registrationIds = registrationIds;
  }

  public RegistrationTagsBatchSchema tags(TagPostSchema tags) {
    this.tags = tags;
    return this;
  }

   /**
   * Get tags
   * @return tags
  **/
  @ApiModelProperty(required = true, value = "")
  public TagPostSchema getTags() {
    return tags;
  }

  public void setTags(TagPostSchema tags) {
    this.tags = tags;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RegistrationTagsBatchSchema registrationTagsBatchSchema = (RegistrationTagsBatchSchema) o;
    return Objects.equals(this.registrationIds, registrationTagsBatchSchema.registrationIds) &&
        Objects.equals(this.tags, registrationTagsBatchSchema.tags);
  }

  @Override
  public int hashCode() {
    return Objects.hash(registrationIds, tags);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RegistrationTagsBatchSchema {\n");
    
    sb.append("    registrationIds: ").append(toIndentedString(registrationIds)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
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

