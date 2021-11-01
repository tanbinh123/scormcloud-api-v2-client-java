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
import com.rusticisoftware.cloud.v2.client.model.PostBackSchema;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;

/**
 * PublicInvitationUpdateSchema
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-11-01T15:24:36.536-05:00")
public class PublicInvitationUpdateSchema {
  @JsonProperty("allowLaunch")
  private Boolean allowLaunch = null;

  @JsonProperty("allowNewRegistrations")
  private Boolean allowNewRegistrations = null;

  @JsonProperty("postBack")
  private PostBackSchema postBack = null;

  @JsonProperty("expirationDate")
  private OffsetDateTime expirationDate = null;

  @JsonProperty("registrationCap")
  private Integer registrationCap = 0;

  public PublicInvitationUpdateSchema allowLaunch(Boolean allowLaunch) {
    this.allowLaunch = allowLaunch;
    return this;
  }

  /**
   * If true, then new registrations can be created for this invitation.
   * @return allowLaunch
  **/
  @ApiModelProperty(value = "If true, then new registrations can be created for this invitation.")
  public Boolean isAllowLaunch() {
    return allowLaunch;
  }

  public void setAllowLaunch(Boolean allowLaunch) {
    this.allowLaunch = allowLaunch;
  }

  public PublicInvitationUpdateSchema allowNewRegistrations(Boolean allowNewRegistrations) {
    this.allowNewRegistrations = allowNewRegistrations;
    return this;
  }

  /**
   * If true, then new registrations can be created for this invitation.
   * @return allowNewRegistrations
  **/
  @ApiModelProperty(value = "If true, then new registrations can be created for this invitation.")
  public Boolean isAllowNewRegistrations() {
    return allowNewRegistrations;
  }

  public void setAllowNewRegistrations(Boolean allowNewRegistrations) {
    this.allowNewRegistrations = allowNewRegistrations;
  }

  public PublicInvitationUpdateSchema postBack(PostBackSchema postBack) {
    this.postBack = postBack;
    return this;
  }

  /**
   * Specifies a URL for which to post activity and status data in real time as the course is completed
   * @return postBack
  **/
  @ApiModelProperty(value = "Specifies a URL for which to post activity and status data in real time as the course is completed")
  public PostBackSchema getPostBack() {
    return postBack;
  }

  public void setPostBack(PostBackSchema postBack) {
    this.postBack = postBack;
  }

  public PublicInvitationUpdateSchema expirationDate(OffsetDateTime expirationDate) {
    this.expirationDate = expirationDate;
    return this;
  }

  /**
   * The ISO 8601 TimeStamp (defaults to UTC) after which this invitation will expire and can no longer be launched. An empty value will represent no expiration date. 
   * @return expirationDate
  **/
  @ApiModelProperty(value = "The ISO 8601 TimeStamp (defaults to UTC) after which this invitation will expire and can no longer be launched. An empty value will represent no expiration date. ")
  public OffsetDateTime getExpirationDate() {
    return expirationDate;
  }

  public void setExpirationDate(OffsetDateTime expirationDate) {
    this.expirationDate = expirationDate;
  }

  public PublicInvitationUpdateSchema registrationCap(Integer registrationCap) {
    this.registrationCap = registrationCap;
    return this;
  }

  /**
   * Integer value that limits the amount of registrations a public invitation can generate.
   * @return registrationCap
  **/
  @ApiModelProperty(value = "Integer value that limits the amount of registrations a public invitation can generate.")
  public Integer getRegistrationCap() {
    return registrationCap;
  }

  public void setRegistrationCap(Integer registrationCap) {
    this.registrationCap = registrationCap;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PublicInvitationUpdateSchema publicInvitationUpdateSchema = (PublicInvitationUpdateSchema) o;
    return Objects.equals(this.allowLaunch, publicInvitationUpdateSchema.allowLaunch) &&
        Objects.equals(this.allowNewRegistrations, publicInvitationUpdateSchema.allowNewRegistrations) &&
        Objects.equals(this.postBack, publicInvitationUpdateSchema.postBack) &&
        Objects.equals(this.expirationDate, publicInvitationUpdateSchema.expirationDate) &&
        Objects.equals(this.registrationCap, publicInvitationUpdateSchema.registrationCap);
  }

  @Override
  public int hashCode() {
    return Objects.hash(allowLaunch, allowNewRegistrations, postBack, expirationDate, registrationCap);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PublicInvitationUpdateSchema {\n");
    
    sb.append("    allowLaunch: ").append(toIndentedString(allowLaunch)).append("\n");
    sb.append("    allowNewRegistrations: ").append(toIndentedString(allowNewRegistrations)).append("\n");
    sb.append("    postBack: ").append(toIndentedString(postBack)).append("\n");
    sb.append("    expirationDate: ").append(toIndentedString(expirationDate)).append("\n");
    sb.append("    registrationCap: ").append(toIndentedString(registrationCap)).append("\n");
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

