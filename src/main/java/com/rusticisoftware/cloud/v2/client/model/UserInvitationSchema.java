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
import com.rusticisoftware.cloud.v2.client.model.UserInvitationSchemaRegistrationReport;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;

/**
 * UserInvitationSchema
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-11-19T22:54:47.497-06:00")
public class UserInvitationSchema {
  @JsonProperty("email")
  private String email = null;

  @JsonProperty("url")
  private String url = null;

  @JsonProperty("isStarted")
  private Boolean isStarted = null;

  @JsonProperty("updated")
  private OffsetDateTime updated = null;

  @JsonProperty("registrationId")
  private String registrationId = null;

  @JsonProperty("registrationReport")
  private UserInvitationSchemaRegistrationReport registrationReport = null;

  public UserInvitationSchema email(String email) {
    this.email = email;
    return this;
  }

   /**
   * The email of the user who took an invitation.
   * @return email
  **/
  @ApiModelProperty(example = "null", value = "The email of the user who took an invitation.")
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public UserInvitationSchema url(String url) {
    this.url = url;
    return this;
  }

   /**
   * The URL which the user would follow to take the invitation.
   * @return url
  **/
  @ApiModelProperty(example = "null", value = "The URL which the user would follow to take the invitation.")
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public UserInvitationSchema isStarted(Boolean isStarted) {
    this.isStarted = isStarted;
    return this;
  }

   /**
   * A boolean flag stating if the user has started the invitation.
   * @return isStarted
  **/
  @ApiModelProperty(example = "null", value = "A boolean flag stating if the user has started the invitation.")
  public Boolean getIsStarted() {
    return isStarted;
  }

  public void setIsStarted(Boolean isStarted) {
    this.isStarted = isStarted;
  }

  public UserInvitationSchema updated(OffsetDateTime updated) {
    this.updated = updated;
    return this;
  }

   /**
   * Get updated
   * @return updated
  **/
  @ApiModelProperty(example = "null", value = "")
  public OffsetDateTime getUpdated() {
    return updated;
  }

  public void setUpdated(OffsetDateTime updated) {
    this.updated = updated;
  }

  public UserInvitationSchema registrationId(String registrationId) {
    this.registrationId = registrationId;
    return this;
  }

   /**
   * The id of the registration which was created from the user being invited.
   * @return registrationId
  **/
  @ApiModelProperty(example = "null", value = "The id of the registration which was created from the user being invited.")
  public String getRegistrationId() {
    return registrationId;
  }

  public void setRegistrationId(String registrationId) {
    this.registrationId = registrationId;
  }

  public UserInvitationSchema registrationReport(UserInvitationSchemaRegistrationReport registrationReport) {
    this.registrationReport = registrationReport;
    return this;
  }

   /**
   * Get registrationReport
   * @return registrationReport
  **/
  @ApiModelProperty(example = "null", value = "")
  public UserInvitationSchemaRegistrationReport getRegistrationReport() {
    return registrationReport;
  }

  public void setRegistrationReport(UserInvitationSchemaRegistrationReport registrationReport) {
    this.registrationReport = registrationReport;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserInvitationSchema userInvitationSchema = (UserInvitationSchema) o;
    return Objects.equals(this.email, userInvitationSchema.email) &&
        Objects.equals(this.url, userInvitationSchema.url) &&
        Objects.equals(this.isStarted, userInvitationSchema.isStarted) &&
        Objects.equals(this.updated, userInvitationSchema.updated) &&
        Objects.equals(this.registrationId, userInvitationSchema.registrationId) &&
        Objects.equals(this.registrationReport, userInvitationSchema.registrationReport);
  }

  @Override
  public int hashCode() {
    return Objects.hash(email, url, isStarted, updated, registrationId, registrationReport);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserInvitationSchema {\n");
    
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    isStarted: ").append(toIndentedString(isStarted)).append("\n");
    sb.append("    updated: ").append(toIndentedString(updated)).append("\n");
    sb.append("    registrationId: ").append(toIndentedString(registrationId)).append("\n");
    sb.append("    registrationReport: ").append(toIndentedString(registrationReport)).append("\n");
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

