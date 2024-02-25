package org.example.manufactureapp.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import java.io.Serializable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * RobotSchemaRequest
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class RobotSchemaRequest implements Serializable {

  private static final long serialVersionUID = 1L;

  private String name;

  private Long developerId;

  @Valid
  private List<Long> details;

  public RobotSchemaRequest name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
  */
  
  @Schema(name = "name", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public RobotSchemaRequest developerId(Long developerId) {
    this.developerId = developerId;
    return this;
  }

  /**
   * Get developerId
   * @return developerId
  */
  
  @Schema(name = "developerId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("developerId")
  public Long getDeveloperId() {
    return developerId;
  }

  public void setDeveloperId(Long developerId) {
    this.developerId = developerId;
  }

  public RobotSchemaRequest details(List<Long> details) {
    this.details = details;
    return this;
  }

  public RobotSchemaRequest addDetailsItem(Long detailsItem) {
    if (this.details == null) {
      this.details = new ArrayList<>();
    }
    this.details.add(detailsItem);
    return this;
  }

  /**
   * Get details
   * @return details
  */
  
  @Schema(name = "details", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("details")
  public List<Long> getDetails() {
    return details;
  }

  public void setDetails(List<Long> details) {
    this.details = details;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RobotSchemaRequest robotSchemaRequest = (RobotSchemaRequest) o;
    return Objects.equals(this.name, robotSchemaRequest.name) &&
        Objects.equals(this.developerId, robotSchemaRequest.developerId) &&
        Objects.equals(this.details, robotSchemaRequest.details);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, developerId, details);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RobotSchemaRequest {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    developerId: ").append(toIndentedString(developerId)).append("\n");
    sb.append("    details: ").append(toIndentedString(details)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

