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
import com.rusticisoftware.cloud.v2.client.model.ReportageAccountInfoUsageSchema;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;

/**
 * ReportageAccountInfoSchema
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-09-20T12:48:59.622-05:00")
public class ReportageAccountInfoSchema {
  @JsonProperty("email")
  private String email = null;

  @JsonProperty("firstName")
  private String firstName = null;

  @JsonProperty("lastName")
  private String lastName = null;

  @JsonProperty("company")
  private String company = null;

  @JsonProperty("accountType")
  private String accountType = null;

  @JsonProperty("regLimit")
  private Integer regLimit = null;

  @JsonProperty("strictLimit")
  private Boolean strictLimit = null;

  @JsonProperty("createDate")
  private OffsetDateTime createDate = null;

  @JsonProperty("usage")
  private ReportageAccountInfoUsageSchema usage = null;

  public ReportageAccountInfoSchema email(String email) {
    this.email = email;
    return this;
  }

   /**
   * Get email
   * @return email
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public ReportageAccountInfoSchema firstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

   /**
   * Get firstName
   * @return firstName
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public ReportageAccountInfoSchema lastName(String lastName) {
    this.lastName = lastName;
    return this;
  }

   /**
   * Get lastName
   * @return lastName
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public ReportageAccountInfoSchema company(String company) {
    this.company = company;
    return this;
  }

   /**
   * Get company
   * @return company
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getCompany() {
    return company;
  }

  public void setCompany(String company) {
    this.company = company;
  }

  public ReportageAccountInfoSchema accountType(String accountType) {
    this.accountType = accountType;
    return this;
  }

   /**
   * Get accountType
   * @return accountType
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getAccountType() {
    return accountType;
  }

  public void setAccountType(String accountType) {
    this.accountType = accountType;
  }

  public ReportageAccountInfoSchema regLimit(Integer regLimit) {
    this.regLimit = regLimit;
    return this;
  }

   /**
   * Get regLimit
   * @return regLimit
  **/
  @ApiModelProperty(example = "null", value = "")
  public Integer getRegLimit() {
    return regLimit;
  }

  public void setRegLimit(Integer regLimit) {
    this.regLimit = regLimit;
  }

  public ReportageAccountInfoSchema strictLimit(Boolean strictLimit) {
    this.strictLimit = strictLimit;
    return this;
  }

   /**
   * Get strictLimit
   * @return strictLimit
  **/
  @ApiModelProperty(example = "null", value = "")
  public Boolean getStrictLimit() {
    return strictLimit;
  }

  public void setStrictLimit(Boolean strictLimit) {
    this.strictLimit = strictLimit;
  }

  public ReportageAccountInfoSchema createDate(OffsetDateTime createDate) {
    this.createDate = createDate;
    return this;
  }

   /**
   * Get createDate
   * @return createDate
  **/
  @ApiModelProperty(example = "null", value = "")
  public OffsetDateTime getCreateDate() {
    return createDate;
  }

  public void setCreateDate(OffsetDateTime createDate) {
    this.createDate = createDate;
  }

  public ReportageAccountInfoSchema usage(ReportageAccountInfoUsageSchema usage) {
    this.usage = usage;
    return this;
  }

   /**
   * Get usage
   * @return usage
  **/
  @ApiModelProperty(example = "null", value = "")
  public ReportageAccountInfoUsageSchema getUsage() {
    return usage;
  }

  public void setUsage(ReportageAccountInfoUsageSchema usage) {
    this.usage = usage;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReportageAccountInfoSchema reportageAccountInfoSchema = (ReportageAccountInfoSchema) o;
    return Objects.equals(this.email, reportageAccountInfoSchema.email) &&
        Objects.equals(this.firstName, reportageAccountInfoSchema.firstName) &&
        Objects.equals(this.lastName, reportageAccountInfoSchema.lastName) &&
        Objects.equals(this.company, reportageAccountInfoSchema.company) &&
        Objects.equals(this.accountType, reportageAccountInfoSchema.accountType) &&
        Objects.equals(this.regLimit, reportageAccountInfoSchema.regLimit) &&
        Objects.equals(this.strictLimit, reportageAccountInfoSchema.strictLimit) &&
        Objects.equals(this.createDate, reportageAccountInfoSchema.createDate) &&
        Objects.equals(this.usage, reportageAccountInfoSchema.usage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(email, firstName, lastName, company, accountType, regLimit, strictLimit, createDate, usage);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReportageAccountInfoSchema {\n");
    
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    company: ").append(toIndentedString(company)).append("\n");
    sb.append("    accountType: ").append(toIndentedString(accountType)).append("\n");
    sb.append("    regLimit: ").append(toIndentedString(regLimit)).append("\n");
    sb.append("    strictLimit: ").append(toIndentedString(strictLimit)).append("\n");
    sb.append("    createDate: ").append(toIndentedString(createDate)).append("\n");
    sb.append("    usage: ").append(toIndentedString(usage)).append("\n");
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

