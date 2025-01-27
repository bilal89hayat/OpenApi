package com.example.openapi.rest;

import com.example.openapi.dto.GetResponse;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExampleEndpoint {

    @Operation(summary = "To Get Records", description = "Update user's name and email based on the mobile number.",
            responses = {
                    @ApiResponse(responseCode = "200", description = "Record updated successfully"),
                    @ApiResponse(responseCode = "400", description = "Invalid input data"),
                    @ApiResponse(responseCode = "404", description = "Record not found")
            }
    )
    @GetMapping("/get/response")
    public GetResponse getResponse(){

        GetResponse response = new GetResponse();
        response.setA(1);
        response.setB("Bilal");
        return response;
    }
}
