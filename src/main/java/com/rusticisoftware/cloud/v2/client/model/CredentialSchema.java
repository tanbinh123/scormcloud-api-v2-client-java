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
 * CredentialSchema
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-09-20T12:48:59.622-05:00")
public class CredentialSchema {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("credential")
  private String credential = null;

  @JsonProperty("pensCredential")
  private String pensCredential = null;

  @JsonProperty("status")
  private String status = null;

  public CredentialSchema id(String id) {
    this.id = id;
    return this;
  }

   /**
   * id for this credential
   * @return id
  **/
  @ApiModelProperty(example = "null", value = "id for this credential")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public CredentialSchema name(String name) {
    this.name = name;
    return this;
  }

   /**
   * name for this credential
   * @return name
  **/
  @ApiModelProperty(example = "null", value = "name for this credential")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public CredentialSchema credential(String credential) {
    this.credential = credential;
    return this;
  }

   /**
   * The newly created API credential
   * @return credential
  **/
  @ApiModelProperty(example = "null", value = "The newly created API credential")
  public String getCredential() {
    return credential;
  }

  public void setCredential(String credential) {
    this.credential = credential;
  }

  public CredentialSchema pensCredential(String pensCredential) {
    this.pensCredential = pensCredential;
    return this;
  }

   /**
   * The PENS key for this credential
   * @return pensCredential
  **/
  @ApiModelProperty(example = "null", value = "The PENS key for this credential")
  public String getPensCredential() {
    return pensCredential;
  }

  public void setPensCredential(String pensCredential) {
    this.pensCredential = pensCredential;
  }

  public CredentialSchema status(String status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CredentialSchema credentialSchema = (CredentialSchema) o;
    return Objects.equals(this.id, credentialSchema.id) &&
        Objects.equals(this.name, credentialSchema.name) &&
        Objects.equals(this.credential, credentialSchema.credential) &&
        Objects.equals(this.pensCredential, credentialSchema.pensCredential) &&
        Objects.equals(this.status, credentialSchema.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, credential, pensCredential, status);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CredentialSchema {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    credential: ").append(toIndentedString(credential)).append("\n");
    sb.append("    pensCredential: ").append(toIndentedString(pensCredential)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

