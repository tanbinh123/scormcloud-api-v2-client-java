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
import com.rusticisoftware.cloud.v2.client.model.RegistrationCompletion;
import com.rusticisoftware.cloud.v2.client.model.RegistrationSuccess;
import com.rusticisoftware.cloud.v2.client.model.ScoreSchema;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * An high level overview of information about the registration of the user to the invitation.
 */
@ApiModel(description = "An high level overview of information about the registration of the user to the invitation.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-09-20T12:48:59.622-05:00")
public class UserInvitationSchemaRegistrationReport {
  @JsonProperty("complete")
  private RegistrationCompletion complete = null;

  @JsonProperty("success")
  private RegistrationSuccess success = null;

  @JsonProperty("totalSecondsTracked")
  private Double totalSecondsTracked = null;

  @JsonProperty("score")
  private ScoreSchema score = null;

  public UserInvitationSchemaRegistrationReport complete(RegistrationCompletion complete) {
    this.complete = complete;
    return this;
  }

   /**
   * Get complete
   * @return complete
  **/
  @ApiModelProperty(example = "null", value = "")
  public RegistrationCompletion getComplete() {
    return complete;
  }

  public void setComplete(RegistrationCompletion complete) {
    this.complete = complete;
  }

  public UserInvitationSchemaRegistrationReport success(RegistrationSuccess success) {
    this.success = success;
    return this;
  }

   /**
   * Get success
   * @return success
  **/
  @ApiModelProperty(example = "null", value = "")
  public RegistrationSuccess getSuccess() {
    return success;
  }

  public void setSuccess(RegistrationSuccess success) {
    this.success = success;
  }

  public UserInvitationSchemaRegistrationReport totalSecondsTracked(Double totalSecondsTracked) {
    this.totalSecondsTracked = totalSecondsTracked;
    return this;
  }

   /**
   * Get totalSecondsTracked
   * @return totalSecondsTracked
  **/
  @ApiModelProperty(example = "null", value = "")
  public Double getTotalSecondsTracked() {
    return totalSecondsTracked;
  }

  public void setTotalSecondsTracked(Double totalSecondsTracked) {
    this.totalSecondsTracked = totalSecondsTracked;
  }

  public UserInvitationSchemaRegistrationReport score(ScoreSchema score) {
    this.score = score;
    return this;
  }

   /**
   * Get score
   * @return score
  **/
  @ApiModelProperty(example = "null", value = "")
  public ScoreSchema getScore() {
    return score;
  }

  public void setScore(ScoreSchema score) {
    this.score = score;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserInvitationSchemaRegistrationReport userInvitationSchemaRegistrationReport = (UserInvitationSchemaRegistrationReport) o;
    return Objects.equals(this.complete, userInvitationSchemaRegistrationReport.complete) &&
        Objects.equals(this.success, userInvitationSchemaRegistrationReport.success) &&
        Objects.equals(this.totalSecondsTracked, userInvitationSchemaRegistrationReport.totalSecondsTracked) &&
        Objects.equals(this.score, userInvitationSchemaRegistrationReport.score);
  }

  @Override
  public int hashCode() {
    return Objects.hash(complete, success, totalSecondsTracked, score);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserInvitationSchemaRegistrationReport {\n");
    
    sb.append("    complete: ").append(toIndentedString(complete)).append("\n");
    sb.append("    success: ").append(toIndentedString(success)).append("\n");
    sb.append("    totalSecondsTracked: ").append(toIndentedString(totalSecondsTracked)).append("\n");
    sb.append("    score: ").append(toIndentedString(score)).append("\n");
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

