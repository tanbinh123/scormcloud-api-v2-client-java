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
import com.rusticisoftware.cloud.v2.client.model.DestinationIdSchema;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

/**
 * DestinationListSchema
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-09-20T12:48:59.622-05:00")
public class DestinationListSchema {
  @JsonProperty("destinations")
  private List<DestinationIdSchema> destinations = new ArrayList<DestinationIdSchema>();

  @JsonProperty("more")
  private String more = null;

  public DestinationListSchema destinations(List<DestinationIdSchema> destinations) {
    this.destinations = destinations;
    return this;
  }

  public DestinationListSchema addDestinationsItem(DestinationIdSchema destinationsItem) {
    this.destinations.add(destinationsItem);
    return this;
  }

   /**
   * 
   * @return destinations
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<DestinationIdSchema> getDestinations() {
    return destinations;
  }

  public void setDestinations(List<DestinationIdSchema> destinations) {
    this.destinations = destinations;
  }

  public DestinationListSchema more(String more) {
    this.more = more;
    return this;
  }

   /**
   * 
   * @return more
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getMore() {
    return more;
  }

  public void setMore(String more) {
    this.more = more;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DestinationListSchema destinationListSchema = (DestinationListSchema) o;
    return Objects.equals(this.destinations, destinationListSchema.destinations) &&
        Objects.equals(this.more, destinationListSchema.more);
  }

  @Override
  public int hashCode() {
    return Objects.hash(destinations, more);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DestinationListSchema {\n");
    
    sb.append("    destinations: ").append(toIndentedString(destinations)).append("\n");
    sb.append("    more: ").append(toIndentedString(more)).append("\n");
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

