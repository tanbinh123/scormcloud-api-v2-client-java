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
import java.time.OffsetDateTime;

/**
 * FileListItemSchema
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-11-05T13:19:45.469-05:00")
public class FileListItemSchema {
  @JsonProperty("path")
  private String path = null;

  @JsonProperty("size")
  private Long size = null;

  @JsonProperty("modified")
  private OffsetDateTime modified = null;

  public FileListItemSchema path(String path) {
    this.path = path;
    return this;
  }

  /**
   * Relative file path of the file. Used in asset manipulation calls
   * @return path
  **/
  @ApiModelProperty(value = "Relative file path of the file. Used in asset manipulation calls")
  public String getPath() {
    return path;
  }

  public void setPath(String path) {
    this.path = path;
  }

  public FileListItemSchema size(Long size) {
    this.size = size;
    return this;
  }

  /**
   * File size in bytes of the file
   * @return size
  **/
  @ApiModelProperty(value = "File size in bytes of the file")
  public Long getSize() {
    return size;
  }

  public void setSize(Long size) {
    this.size = size;
  }

  public FileListItemSchema modified(OffsetDateTime modified) {
    this.modified = modified;
    return this;
  }

  /**
   * Get modified
   * @return modified
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getModified() {
    return modified;
  }

  public void setModified(OffsetDateTime modified) {
    this.modified = modified;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FileListItemSchema fileListItemSchema = (FileListItemSchema) o;
    return Objects.equals(this.path, fileListItemSchema.path) &&
        Objects.equals(this.size, fileListItemSchema.size) &&
        Objects.equals(this.modified, fileListItemSchema.modified);
  }

  @Override
  public int hashCode() {
    return Objects.hash(path, size, modified);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FileListItemSchema {\n");
    
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    modified: ").append(toIndentedString(modified)).append("\n");
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

