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
import com.rusticisoftware.cloud.v2.client.model.ActivityResultSchema;
import com.rusticisoftware.cloud.v2.client.model.CourseReferenceSchema;
import com.rusticisoftware.cloud.v2.client.model.LearnerSchema;
import com.rusticisoftware.cloud.v2.client.model.ObjectiveSchema;
import com.rusticisoftware.cloud.v2.client.model.RegistrationCompletion;
import com.rusticisoftware.cloud.v2.client.model.RegistrationSuccess;
import com.rusticisoftware.cloud.v2.client.model.ScoreSchema;
import com.rusticisoftware.cloud.v2.client.model.SharedDataEntrySchema;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;

/**
 * RegistrationSchema
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-03-26T00:55:07.262-05:00")
public class RegistrationSchema {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("instance")
  private Integer instance = null;

  @JsonProperty("xapiRegistrationId")
  private String xapiRegistrationId = null;

  @JsonProperty("dispatchId")
  private String dispatchId = null;

  @JsonProperty("updated")
  private OffsetDateTime updated = null;

  @JsonProperty("registrationCompletion")
  private RegistrationCompletion registrationCompletion = null;

  @JsonProperty("registrationCompletionAmount")
  private Double registrationCompletionAmount = null;

  @JsonProperty("registrationSuccess")
  private RegistrationSuccess registrationSuccess = null;

  @JsonProperty("score")
  private ScoreSchema score = null;

  @JsonProperty("totalSecondsTracked")
  private Double totalSecondsTracked = null;

  @JsonProperty("firstAccessDate")
  private OffsetDateTime firstAccessDate = null;

  @JsonProperty("lastAccessDate")
  private OffsetDateTime lastAccessDate = null;

  @JsonProperty("completedDate")
  private OffsetDateTime completedDate = null;

  @JsonProperty("createdDate")
  private OffsetDateTime createdDate = null;

  @JsonProperty("course")
  private CourseReferenceSchema course = null;

  @JsonProperty("learner")
  private LearnerSchema learner = null;

  @JsonProperty("globalObjectives")
  private List<ObjectiveSchema> globalObjectives = null;

  @JsonProperty("sharedData")
  private List<SharedDataEntrySchema> sharedData = null;

  @JsonProperty("suspendedActivityId")
  private String suspendedActivityId = null;

  @JsonProperty("activityDetails")
  private ActivityResultSchema activityDetails = null;

  public RegistrationSchema id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(value = "")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public RegistrationSchema instance(Integer instance) {
    this.instance = instance;
    return this;
  }

   /**
   * Get instance
   * @return instance
  **/
  @ApiModelProperty(value = "")
  public Integer getInstance() {
    return instance;
  }

  public void setInstance(Integer instance) {
    this.instance = instance;
  }

  public RegistrationSchema xapiRegistrationId(String xapiRegistrationId) {
    this.xapiRegistrationId = xapiRegistrationId;
    return this;
  }

   /**
   * xAPI registration id associated with this registration
   * @return xapiRegistrationId
  **/
  @ApiModelProperty(value = "xAPI registration id associated with this registration")
  public String getXapiRegistrationId() {
    return xapiRegistrationId;
  }

  public void setXapiRegistrationId(String xapiRegistrationId) {
    this.xapiRegistrationId = xapiRegistrationId;
  }

  public RegistrationSchema dispatchId(String dispatchId) {
    this.dispatchId = dispatchId;
    return this;
  }

   /**
   * Dispatch ID for this registration, if applicable
   * @return dispatchId
  **/
  @ApiModelProperty(value = "Dispatch ID for this registration, if applicable")
  public String getDispatchId() {
    return dispatchId;
  }

  public void setDispatchId(String dispatchId) {
    this.dispatchId = dispatchId;
  }

  public RegistrationSchema updated(OffsetDateTime updated) {
    this.updated = updated;
    return this;
  }

   /**
   * Get updated
   * @return updated
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getUpdated() {
    return updated;
  }

  public void setUpdated(OffsetDateTime updated) {
    this.updated = updated;
  }

  public RegistrationSchema registrationCompletion(RegistrationCompletion registrationCompletion) {
    this.registrationCompletion = registrationCompletion;
    return this;
  }

   /**
   * Get registrationCompletion
   * @return registrationCompletion
  **/
  @ApiModelProperty(value = "")
  public RegistrationCompletion getRegistrationCompletion() {
    return registrationCompletion;
  }

  public void setRegistrationCompletion(RegistrationCompletion registrationCompletion) {
    this.registrationCompletion = registrationCompletion;
  }

  public RegistrationSchema registrationCompletionAmount(Double registrationCompletionAmount) {
    this.registrationCompletionAmount = registrationCompletionAmount;
    return this;
  }

   /**
   * Get registrationCompletionAmount
   * @return registrationCompletionAmount
  **/
  @ApiModelProperty(value = "")
  public Double getRegistrationCompletionAmount() {
    return registrationCompletionAmount;
  }

  public void setRegistrationCompletionAmount(Double registrationCompletionAmount) {
    this.registrationCompletionAmount = registrationCompletionAmount;
  }

  public RegistrationSchema registrationSuccess(RegistrationSuccess registrationSuccess) {
    this.registrationSuccess = registrationSuccess;
    return this;
  }

   /**
   * Get registrationSuccess
   * @return registrationSuccess
  **/
  @ApiModelProperty(value = "")
  public RegistrationSuccess getRegistrationSuccess() {
    return registrationSuccess;
  }

  public void setRegistrationSuccess(RegistrationSuccess registrationSuccess) {
    this.registrationSuccess = registrationSuccess;
  }

  public RegistrationSchema score(ScoreSchema score) {
    this.score = score;
    return this;
  }

   /**
   * Get score
   * @return score
  **/
  @ApiModelProperty(value = "")
  public ScoreSchema getScore() {
    return score;
  }

  public void setScore(ScoreSchema score) {
    this.score = score;
  }

  public RegistrationSchema totalSecondsTracked(Double totalSecondsTracked) {
    this.totalSecondsTracked = totalSecondsTracked;
    return this;
  }

   /**
   * Get totalSecondsTracked
   * @return totalSecondsTracked
  **/
  @ApiModelProperty(value = "")
  public Double getTotalSecondsTracked() {
    return totalSecondsTracked;
  }

  public void setTotalSecondsTracked(Double totalSecondsTracked) {
    this.totalSecondsTracked = totalSecondsTracked;
  }

  public RegistrationSchema firstAccessDate(OffsetDateTime firstAccessDate) {
    this.firstAccessDate = firstAccessDate;
    return this;
  }

   /**
   * Get firstAccessDate
   * @return firstAccessDate
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getFirstAccessDate() {
    return firstAccessDate;
  }

  public void setFirstAccessDate(OffsetDateTime firstAccessDate) {
    this.firstAccessDate = firstAccessDate;
  }

  public RegistrationSchema lastAccessDate(OffsetDateTime lastAccessDate) {
    this.lastAccessDate = lastAccessDate;
    return this;
  }

   /**
   * Get lastAccessDate
   * @return lastAccessDate
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getLastAccessDate() {
    return lastAccessDate;
  }

  public void setLastAccessDate(OffsetDateTime lastAccessDate) {
    this.lastAccessDate = lastAccessDate;
  }

  public RegistrationSchema completedDate(OffsetDateTime completedDate) {
    this.completedDate = completedDate;
    return this;
  }

   /**
   * Get completedDate
   * @return completedDate
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getCompletedDate() {
    return completedDate;
  }

  public void setCompletedDate(OffsetDateTime completedDate) {
    this.completedDate = completedDate;
  }

  public RegistrationSchema createdDate(OffsetDateTime createdDate) {
    this.createdDate = createdDate;
    return this;
  }

   /**
   * Get createdDate
   * @return createdDate
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getCreatedDate() {
    return createdDate;
  }

  public void setCreatedDate(OffsetDateTime createdDate) {
    this.createdDate = createdDate;
  }

  public RegistrationSchema course(CourseReferenceSchema course) {
    this.course = course;
    return this;
  }

   /**
   * Get course
   * @return course
  **/
  @ApiModelProperty(value = "")
  public CourseReferenceSchema getCourse() {
    return course;
  }

  public void setCourse(CourseReferenceSchema course) {
    this.course = course;
  }

  public RegistrationSchema learner(LearnerSchema learner) {
    this.learner = learner;
    return this;
  }

   /**
   * Get learner
   * @return learner
  **/
  @ApiModelProperty(value = "")
  public LearnerSchema getLearner() {
    return learner;
  }

  public void setLearner(LearnerSchema learner) {
    this.learner = learner;
  }

  public RegistrationSchema globalObjectives(List<ObjectiveSchema> globalObjectives) {
    this.globalObjectives = globalObjectives;
    return this;
  }

  public RegistrationSchema addGlobalObjectivesItem(ObjectiveSchema globalObjectivesItem) {
    if (this.globalObjectives == null) {
      this.globalObjectives = new ArrayList<>();
    }
    this.globalObjectives.add(globalObjectivesItem);
    return this;
  }

   /**
   * Get globalObjectives
   * @return globalObjectives
  **/
  @ApiModelProperty(value = "")
  public List<ObjectiveSchema> getGlobalObjectives() {
    return globalObjectives;
  }

  public void setGlobalObjectives(List<ObjectiveSchema> globalObjectives) {
    this.globalObjectives = globalObjectives;
  }

  public RegistrationSchema sharedData(List<SharedDataEntrySchema> sharedData) {
    this.sharedData = sharedData;
    return this;
  }

  public RegistrationSchema addSharedDataItem(SharedDataEntrySchema sharedDataItem) {
    if (this.sharedData == null) {
      this.sharedData = new ArrayList<>();
    }
    this.sharedData.add(sharedDataItem);
    return this;
  }

   /**
   * Get sharedData
   * @return sharedData
  **/
  @ApiModelProperty(value = "")
  public List<SharedDataEntrySchema> getSharedData() {
    return sharedData;
  }

  public void setSharedData(List<SharedDataEntrySchema> sharedData) {
    this.sharedData = sharedData;
  }

  public RegistrationSchema suspendedActivityId(String suspendedActivityId) {
    this.suspendedActivityId = suspendedActivityId;
    return this;
  }

   /**
   * Get suspendedActivityId
   * @return suspendedActivityId
  **/
  @ApiModelProperty(value = "")
  public String getSuspendedActivityId() {
    return suspendedActivityId;
  }

  public void setSuspendedActivityId(String suspendedActivityId) {
    this.suspendedActivityId = suspendedActivityId;
  }

  public RegistrationSchema activityDetails(ActivityResultSchema activityDetails) {
    this.activityDetails = activityDetails;
    return this;
  }

   /**
   * Get activityDetails
   * @return activityDetails
  **/
  @ApiModelProperty(value = "")
  public ActivityResultSchema getActivityDetails() {
    return activityDetails;
  }

  public void setActivityDetails(ActivityResultSchema activityDetails) {
    this.activityDetails = activityDetails;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RegistrationSchema registrationSchema = (RegistrationSchema) o;
    return Objects.equals(this.id, registrationSchema.id) &&
        Objects.equals(this.instance, registrationSchema.instance) &&
        Objects.equals(this.xapiRegistrationId, registrationSchema.xapiRegistrationId) &&
        Objects.equals(this.dispatchId, registrationSchema.dispatchId) &&
        Objects.equals(this.updated, registrationSchema.updated) &&
        Objects.equals(this.registrationCompletion, registrationSchema.registrationCompletion) &&
        Objects.equals(this.registrationCompletionAmount, registrationSchema.registrationCompletionAmount) &&
        Objects.equals(this.registrationSuccess, registrationSchema.registrationSuccess) &&
        Objects.equals(this.score, registrationSchema.score) &&
        Objects.equals(this.totalSecondsTracked, registrationSchema.totalSecondsTracked) &&
        Objects.equals(this.firstAccessDate, registrationSchema.firstAccessDate) &&
        Objects.equals(this.lastAccessDate, registrationSchema.lastAccessDate) &&
        Objects.equals(this.completedDate, registrationSchema.completedDate) &&
        Objects.equals(this.createdDate, registrationSchema.createdDate) &&
        Objects.equals(this.course, registrationSchema.course) &&
        Objects.equals(this.learner, registrationSchema.learner) &&
        Objects.equals(this.globalObjectives, registrationSchema.globalObjectives) &&
        Objects.equals(this.sharedData, registrationSchema.sharedData) &&
        Objects.equals(this.suspendedActivityId, registrationSchema.suspendedActivityId) &&
        Objects.equals(this.activityDetails, registrationSchema.activityDetails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, instance, xapiRegistrationId, dispatchId, updated, registrationCompletion, registrationCompletionAmount, registrationSuccess, score, totalSecondsTracked, firstAccessDate, lastAccessDate, completedDate, createdDate, course, learner, globalObjectives, sharedData, suspendedActivityId, activityDetails);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RegistrationSchema {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    instance: ").append(toIndentedString(instance)).append("\n");
    sb.append("    xapiRegistrationId: ").append(toIndentedString(xapiRegistrationId)).append("\n");
    sb.append("    dispatchId: ").append(toIndentedString(dispatchId)).append("\n");
    sb.append("    updated: ").append(toIndentedString(updated)).append("\n");
    sb.append("    registrationCompletion: ").append(toIndentedString(registrationCompletion)).append("\n");
    sb.append("    registrationCompletionAmount: ").append(toIndentedString(registrationCompletionAmount)).append("\n");
    sb.append("    registrationSuccess: ").append(toIndentedString(registrationSuccess)).append("\n");
    sb.append("    score: ").append(toIndentedString(score)).append("\n");
    sb.append("    totalSecondsTracked: ").append(toIndentedString(totalSecondsTracked)).append("\n");
    sb.append("    firstAccessDate: ").append(toIndentedString(firstAccessDate)).append("\n");
    sb.append("    lastAccessDate: ").append(toIndentedString(lastAccessDate)).append("\n");
    sb.append("    completedDate: ").append(toIndentedString(completedDate)).append("\n");
    sb.append("    createdDate: ").append(toIndentedString(createdDate)).append("\n");
    sb.append("    course: ").append(toIndentedString(course)).append("\n");
    sb.append("    learner: ").append(toIndentedString(learner)).append("\n");
    sb.append("    globalObjectives: ").append(toIndentedString(globalObjectives)).append("\n");
    sb.append("    sharedData: ").append(toIndentedString(sharedData)).append("\n");
    sb.append("    suspendedActivityId: ").append(toIndentedString(suspendedActivityId)).append("\n");
    sb.append("    activityDetails: ").append(toIndentedString(activityDetails)).append("\n");
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

