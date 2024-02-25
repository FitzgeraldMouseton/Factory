package org.example.manufactureapp.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.jackson.nullable.JsonNullable;
import java.io.Serializable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * StoreResponse
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class StoreResponse implements Serializable {

  private static final long serialVersionUID = 1L;

  private Long id;

  private Long capacity;

  private Boolean complete;

  public StoreResponse id(Long id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  */
  
  @Schema(name = "id", example = "10", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("id")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public StoreResponse capacity(Long capacity) {
    this.capacity = capacity;
    return this;
  }

  /**
   * Get capacity
   * @return capacity
  */
  
  @Schema(name = "capacity", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("capacity")
  public Long getCapacity() {
    return capacity;
  }

  public void setCapacity(Long capacity) {
    this.capacity = capacity;
  }

  public StoreResponse complete(Boolean complete) {
    this.complete = complete;
    return this;
  }

  /**
   * Get complete
   * @return complete
  */
  
  @Schema(name = "complete", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("complete")
  public Boolean isComplete() {
    return complete;
  }

  public void setComplete(Boolean complete) {
    this.complete = complete;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StoreResponse storeResponse = (StoreResponse) o;
    return Objects.equals(this.id, storeResponse.id) &&
        Objects.equals(this.capacity, storeResponse.capacity) &&
        Objects.equals(this.complete, storeResponse.complete);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, capacity, complete);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StoreResponse {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    capacity: ").append(toIndentedString(capacity)).append("\n");
    sb.append("    complete: ").append(toIndentedString(complete)).append("\n");
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

