package com.project.shopapp2.controllers;

import com.project.shopapp2.dtos.CategoryDTO;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/categories")
public class CategoryController {
    @GetMapping("")
    public ResponseEntity<?> getAllCategories(
            @RequestParam("page") int page,
            @RequestParam("limit") int limit
    ) {
        return ResponseEntity.ok(String.format("Get all. page = %d, limit = %d", page, limit));
    }

    @GetMapping("/{id}")
    public  ResponseEntity<String> getCategoryById(@PathVariable("id") String category_id) {
        return ResponseEntity.ok("OK get category with id= "+category_id);
    }

    @PostMapping("")
    public ResponseEntity<String> insertCategory(@Valid @RequestBody CategoryDTO categoryDTO, BindingResult result) {
        if (result.hasErrors()) {
            List<String> errorMess = result.getFieldErrors()
                    .stream()
                    .map(FieldError::getDefaultMessage)
                    .toList();
            return ResponseEntity.badRequest().body(errorMess.toString());
        }
        return ResponseEntity.ok("NAME"+ categoryDTO);
    }
    @PutMapping("/{id}")
    public ResponseEntity<String> updateById(@PathVariable Long id) {
        return ResponseEntity.ok("This id "+ id);
    }

}
