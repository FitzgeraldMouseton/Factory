package org.example.manufactureapp.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;

import javax.annotation.Generated;
import javax.validation.Valid;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * RobotSchemaResponse
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class RobotSchemaResponse implements Serializable {

  private static final long serialVersionUID = 1L;

  private String name;

  private String createdAt;

  private Long developerId;

  @Valid
  private List<Long> details;

  public RobotSchemaResponse name(String name) {
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

  public RobotSchemaResponse createdAt(String createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * Get createdAt
   * @return createdAt
  */
  
  @Schema(name = "createdAt", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("createdAt")
  public String getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(String createdAt) {
    this.createdAt = createdAt;
  }

  public RobotSchemaResponse developerId(Long developerId) {
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

  public RobotSchemaResponse details(List<Long> details) {
    this.details = details;
    return this;
  }

  public RobotSchemaResponse addDetailsItem(Long detailsItem) {
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
    RobotSchemaResponse robotSchemaResponse = (RobotSchemaResponse) o;
    return Objects.equals(this.name, robotSchemaResponse.name) &&
        Objects.equals(this.createdAt, robotSchemaResponse.createdAt) &&
        Objects.equals(this.developerId, robotSchemaResponse.developerId) &&
        Objects.equals(this.details, robotSchemaResponse.details);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, createdAt, developerId, details);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RobotSchemaResponse {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
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

