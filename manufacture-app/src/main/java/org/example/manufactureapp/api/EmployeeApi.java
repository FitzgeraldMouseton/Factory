/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (7.3.0).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package org.example.manufactureapp.api;


import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import org.example.manufactureapp.model.EmployeeRequest;
import org.example.manufactureapp.model.EmployeeResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.Generated;

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
@Validated
@Tag(name = "employee", description = "Everything about employees")
public interface EmployeeApi {

    /**
     * DELETE /employee/{username} : Delete employee
     * This can only be done by the logged in user.
     *
     * @param username The name that needs to be deleted (required)
     * @return Invalid username supplied (status code 400)
     *         or User not found (status code 404)
     */
    @Operation(
        operationId = "deleteEmployee",
        summary = "Delete employee",
        description = "This can only be done by the logged in user.",
        tags = { "employee" },
        responses = {
            @ApiResponse(responseCode = "400", description = "Invalid username supplied"),
            @ApiResponse(responseCode = "404", description = "User not found")
        }
    )
    @RequestMapping(
        method = RequestMethod.DELETE,
        value = "/employee/{username}"
    )
    
    ResponseEntity<Void> deleteEmployee(
        @Parameter(name = "username", description = "The name that needs to be deleted", required = true, in = ParameterIn.PATH) @PathVariable("username") String username
    );


    /**
     * GET /employee/{username} : Get employee by user name
     * 
     *
     * @param username  (required)
     * @return successful operation (status code 200)
     *         or Invalid username supplied (status code 400)
     *         or Employee not found (status code 404)
     */
    @Operation(
        operationId = "getEmployeeByName",
        summary = "Get employee by user name",
        description = "",
        tags = { "employee" },
        responses = {
            @ApiResponse(responseCode = "200", description = "successful operation", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = EmployeeResponse.class))
            }),
            @ApiResponse(responseCode = "400", description = "Invalid username supplied"),
            @ApiResponse(responseCode = "404", description = "Employee not found")
        }
    )
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/employee/{username}",
        produces = { "application/json" }
    )
    
    ResponseEntity<EmployeeResponse> getEmployeeByName(
        @Parameter(name = "username", description = "", required = true, in = ParameterIn.PATH) @PathVariable("username") String username
    );


    /**
     * PUT /employee/{username} : Update employee
     * This can only be done by the logged in user.
     *
     * @param username name that need to be deleted (required)
     * @param employeeRequest Update an existent employee in the store (optional)
     * @return successful operation (status code 200)
     */
    @Operation(
        operationId = "updateEmployee",
        summary = "Update employee",
        description = "This can only be done by the logged in user.",
        tags = { "employee" },
        responses = {
            @ApiResponse(responseCode = "default", description = "successful operation")
        }
    )
    @RequestMapping(
        method = RequestMethod.PUT,
        value = "/employee/{username}",
        consumes = { "application/json" }
    )
    
    ResponseEntity<Void> updateEmployee(
        @Parameter(name = "username", description = "name that need to be deleted", required = true, in = ParameterIn.PATH) @PathVariable("username") String username,
        @Parameter(name = "EmployeeRequest", description = "Update an existent employee in the store") @Valid @RequestBody(required = false) EmployeeRequest employeeRequest
    );

}