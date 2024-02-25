package org.example.manufactureapp.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.jackson.nullable.JsonNullable;
import java.io.Serializable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * RobotRequest
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class RobotRequest implements Serializable {

  private static final long serialVersionUID = 1L;

  private Long category;

  private Long employee;

  private Integer drawing;

  public Integer getDrawing() {
    return drawing;
  }

  public void setDrawing(Integer drawing) {
    this.drawing = drawing;
  }

  private Long store;

  /**
   * robot status
   */
  public enum StatusEnum {
    CONSTRUCTED("CONSTRUCTED"),
    
    BROKEN("BROKEN");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static StatusEnum fromValue(String value) {
      for (StatusEnum b : StatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private StatusEnum status;

  public RobotRequest category(Long category) {
    this.category = category;
    return this;
  }

  /**
   * Get category
   * @return category
  */
  
  @Schema(name = "category", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("category")
  public Long getCategory() {
    return category;
  }

  public void setCategory(Long category) {
    this.category = category;
  }

  public RobotRequest employee(Long employee) {
    this.employee = employee;
    return this;
  }

  /**
   * Get employee
   * @return employee
  */
  
  @Schema(name = "employee", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("employee")
  public Long getEmployee() {
    return employee;
  }

  public void setEmployee(Long employee) {
    this.employee = employee;
  }

  public RobotRequest store(Long store) {
    this.store = store;
    return this;
  }

  /**
   * Get store
   * @return store
  */
  
  @Schema(name = "store", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("store")
  public Long getStore() {
    return store;
  }

  public void setStore(Long store) {
    this.store = store;
  }

  public RobotRequest status(StatusEnum status) {
    this.status = status;
    return this;
  }

  /**
   * robot status
   * @return status
  */
  
  @Schema(name = "status", description = "robot status", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("status")
  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RobotRequest robotRequest = (RobotRequest) o;
    return
        Objects.equals(this.category, robotRequest.category) &&
        Objects.equals(this.employee, robotRequest.employee) &&
        Objects.equals(this.store, robotRequest.store) &&
        Objects.equals(this.status, robotRequest.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(category, employee, store, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RobotRequest {\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    employee: ").append(toIndentedString(employee)).append("\n");
    sb.append("    store: ").append(toIndentedString(store)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

