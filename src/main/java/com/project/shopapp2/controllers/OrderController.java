package com.project.shopapp2.controllers;

import com.project.shopapp2.dtos.ProductDTO;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@RestController
@RequestMapping("api/v1/orders")
public class OrderController {
    @GetMapping("/{id}")
    public ResponseEntity<String> getProductById(@PathVariable("id") String orderId) {
        return ResponseEntity.ok("OK get order with id= "+orderId);
    }

    @PostMapping(value = "")
    public ResponseEntity<?> createProduct(
            @Valid @ModelAttribute ProductDTO productDTO,
            BindingResult result
    ) {
        try {
            if (result.hasErrors()) {
                List<String> errors = result.getFieldErrors()
                        .stream().map(FieldError::getDefaultMessage)
                        .toList();
                return ResponseEntity.badRequest().body(errors);
            }
        } catch (Exception e) {
            return ResponseEntity.badRequest().body(e);
        }
        return  ResponseEntity.ok().body("Order created successfully");
    }
}
