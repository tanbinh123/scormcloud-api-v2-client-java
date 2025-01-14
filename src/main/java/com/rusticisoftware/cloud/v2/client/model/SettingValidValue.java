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

/**
 * SettingValidValue
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-11-05T13:19:45.469-05:00")
public class SettingValidValue {
  @JsonProperty("value")
  private String value = null;

  @JsonProperty("valueDescription")
  private String valueDescription = null;

  public SettingValidValue value(String value) {
    this.value = value;
    return this;
  }

  /**
   * Get value
   * @return value
  **/
  @ApiModelProperty(value = "")
  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  public SettingValidValue valueDescription(String valueDescription) {
    this.valueDescription = valueDescription;
    return this;
  }

  /**
   * Description of what this valid value means, how it will be applied if used in a setting
   * @return valueDescription
  **/
  @ApiModelProperty(value = "Description of what this valid value means, how it will be applied if used in a setting")
  public String getValueDescription() {
    return valueDescription;
  }

  public void setValueDescription(String valueDescription) {
    this.valueDescription = valueDescription;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SettingValidValue settingValidValue = (SettingValidValue) o;
    return Objects.equals(this.value, settingValidValue.value) &&
        Objects.equals(this.valueDescription, settingValidValue.valueDescription);
  }

  @Override
  public int hashCode() {
    return Objects.hash(value, valueDescription);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SettingValidValue {\n");
    
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    valueDescription: ").append(toIndentedString(valueDescription)).append("\n");
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

