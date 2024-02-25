package org.example.manufactureapp.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.io.Serializable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * RobotFullResponse
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class RobotFullResponse implements Serializable {

  private static final long serialVersionUID = 1L;

  private Long id;

  private RobotCategoryResponse category;

  private EmployeeResponse employee;

  private StoreResponse store;

  /**
   * robot status
   */
  public enum StatusEnum {
    DESIGNED("DESIGNED"),
    
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

  public RobotFullResponse id(Long id) {
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

  public RobotFullResponse category(RobotCategoryResponse category) {
    this.category = category;
    return this;
  }

  /**
   * Get category
   * @return category
  */
  @Valid 
  @Schema(name = "category", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("category")
  public RobotCategoryResponse getCategory() {
    return category;
  }

  public void setCategory(RobotCategoryResponse category) {
    this.category = category;
  }

  public RobotFullResponse employee(EmployeeResponse employee) {
    this.employee = employee;
    return this;
  }

  /**
   * Get employee
   * @return employee
  */
  @Valid 
  @Schema(name = "employee", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("employee")
  public EmployeeResponse getEmployee() {
    return employee;
  }

  public void setEmployee(EmployeeResponse employee) {
    this.employee = employee;
  }

  public RobotFullResponse store(StoreResponse store) {
    this.store = store;
    return this;
  }

  /**
   * Get store
   * @return store
  */
  @Valid 
  @Schema(name = "store", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("store")
  public StoreResponse getStore() {
    return store;
  }

  public void setStore(StoreResponse store) {
    this.store = store;
  }

  public RobotFullResponse status(StatusEnum status) {
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
    RobotFullResponse robotFullResponse = (RobotFullResponse) o;
    return Objects.equals(this.id, robotFullResponse.id) &&
        Objects.equals(this.category, robotFullResponse.category) &&
        Objects.equals(this.employee, robotFullResponse.employee) &&
        Objects.equals(this.store, robotFullResponse.store) &&
        Objects.equals(this.status, robotFullResponse.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, category, employee, store, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RobotFullResponse {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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

