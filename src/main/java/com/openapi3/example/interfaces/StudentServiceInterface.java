package com.openapi3.example.interfaces;

import com.openapi3.example.Model.Student;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

public interface StudentServiceInterface {

    @Operation(summary = "Get list of students")
    @GetMapping("/")
    List<Student> getAllStudents();

    @ApiResponses(value = {@ApiResponse(description = "Successfully received student", responseCode = "200", content = @Content(schema = @Schema(implementation = Student.class)))})
    @Operation(summary = "get student by ID")
    @GetMapping("/{studentID}")
    Student getStudentByID(@PathVariable("studentID") int id);
}
