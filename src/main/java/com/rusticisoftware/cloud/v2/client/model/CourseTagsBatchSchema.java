/**
 * SCORM Cloud Rest API
 * REST API used for SCORM Cloud integrations.
 *
 * OpenAPI spec version: 2.0 beta
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */


package com.rusticisoftware.cloud.v2.client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.rusticisoftware.cloud.v2.client.model.TagPostSchema;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;


/**
 * CourseTagsBatchSchema
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2019-03-25T23:15:50.683-05:00")
public class CourseTagsBatchSchema   {
  @JsonProperty("courseIds")
  private List<String> courseIds = new ArrayList<String>();

  @JsonProperty("tags")
  private TagPostSchema tags = null;

  public CourseTagsBatchSchema courseIds(List<String> courseIds) {
    this.courseIds = courseIds;
    return this;
  }

  public CourseTagsBatchSchema addCourseIdsItem(String courseIdsItem) {
    this.courseIds.add(courseIdsItem);
    return this;
  }

   /**
   * Get courseIds
   * @return courseIds
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public List<String> getCourseIds() {
    return courseIds;
  }

  public void setCourseIds(List<String> courseIds) {
    this.courseIds = courseIds;
  }

  public CourseTagsBatchSchema tags(TagPostSchema tags) {
    this.tags = tags;
    return this;
  }

   /**
   * Get tags
   * @return tags
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public TagPostSchema getTags() {
    return tags;
  }

  public void setTags(TagPostSchema tags) {
    this.tags = tags;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CourseTagsBatchSchema courseTagsBatchSchema = (CourseTagsBatchSchema) o;
    return Objects.equals(this.courseIds, courseTagsBatchSchema.courseIds) &&
        Objects.equals(this.tags, courseTagsBatchSchema.tags);
  }

  @Override
  public int hashCode() {
    return Objects.hash(courseIds, tags);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CourseTagsBatchSchema {\n");
    
    sb.append("    courseIds: ").append(toIndentedString(courseIds)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
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

