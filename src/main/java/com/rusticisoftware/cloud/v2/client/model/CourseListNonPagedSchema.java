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
import com.rusticisoftware.cloud.v2.client.model.CourseSchema;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

/**
 * CourseListNonPagedSchema
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-11-05T13:19:45.469-05:00")
public class CourseListNonPagedSchema {
  @JsonProperty("courses")
  private List<CourseSchema> courses = null;

  public CourseListNonPagedSchema courses(List<CourseSchema> courses) {
    this.courses = courses;
    return this;
  }

  public CourseListNonPagedSchema addCoursesItem(CourseSchema coursesItem) {
    if (this.courses == null) {
      this.courses = new ArrayList<>();
    }
    this.courses.add(coursesItem);
    return this;
  }

  /**
   * Get courses
   * @return courses
  **/
  @ApiModelProperty(value = "")
  public List<CourseSchema> getCourses() {
    return courses;
  }

  public void setCourses(List<CourseSchema> courses) {
    this.courses = courses;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CourseListNonPagedSchema courseListNonPagedSchema = (CourseListNonPagedSchema) o;
    return Objects.equals(this.courses, courseListNonPagedSchema.courses);
  }

  @Override
  public int hashCode() {
    return Objects.hash(courses);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CourseListNonPagedSchema {\n");
    
    sb.append("    courses: ").append(toIndentedString(courses)).append("\n");
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

