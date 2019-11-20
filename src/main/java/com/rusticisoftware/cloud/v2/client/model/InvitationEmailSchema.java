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
import java.util.ArrayList;
import java.util.List;

/**
 * Object representing an e-mail to be sent to a given list of e-mail addresses inviting them to participate in a course.
 */
@ApiModel(description = "Object representing an e-mail to be sent to a given list of e-mail addresses inviting them to participate in a course.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-11-19T22:54:47.497-06:00")
public class InvitationEmailSchema {
  @JsonProperty("subject")
  private String subject = null;

  @JsonProperty("body")
  private String body = null;

  @JsonProperty("addresses")
  private List<String> addresses = new ArrayList<String>();

  public InvitationEmailSchema subject(String subject) {
    this.subject = subject;
    return this;
  }

   /**
   * The subject line for the email.
   * @return subject
  **/
  @ApiModelProperty(example = "null", value = "The subject line for the email.")
  public String getSubject() {
    return subject;
  }

  public void setSubject(String subject) {
    this.subject = subject;
  }

  public InvitationEmailSchema body(String body) {
    this.body = body;
    return this;
  }

   /**
   * The body of the email.
   * @return body
  **/
  @ApiModelProperty(example = "null", value = "The body of the email.")
  public String getBody() {
    return body;
  }

  public void setBody(String body) {
    this.body = body;
  }

  public InvitationEmailSchema addresses(List<String> addresses) {
    this.addresses = addresses;
    return this;
  }

  public InvitationEmailSchema addAddressesItem(String addressesItem) {
    this.addresses.add(addressesItem);
    return this;
  }

   /**
   * A comma separated list of email addresses to which this invitation will be sent.  NOTE: registrations with automatically be create for each of these e-mail addresses.
   * @return addresses
  **/
  @ApiModelProperty(example = "null", required = true, value = "A comma separated list of email addresses to which this invitation will be sent.  NOTE: registrations with automatically be create for each of these e-mail addresses.")
  public List<String> getAddresses() {
    return addresses;
  }

  public void setAddresses(List<String> addresses) {
    this.addresses = addresses;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InvitationEmailSchema invitationEmailSchema = (InvitationEmailSchema) o;
    return Objects.equals(this.subject, invitationEmailSchema.subject) &&
        Objects.equals(this.body, invitationEmailSchema.body) &&
        Objects.equals(this.addresses, invitationEmailSchema.addresses);
  }

  @Override
  public int hashCode() {
    return Objects.hash(subject, body, addresses);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InvitationEmailSchema {\n");
    
    sb.append("    subject: ").append(toIndentedString(subject)).append("\n");
    sb.append("    body: ").append(toIndentedString(body)).append("\n");
    sb.append("    addresses: ").append(toIndentedString(addresses)).append("\n");
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

