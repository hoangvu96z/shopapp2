package com.project.shopapp2.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/products")
public class ProductController {
    @GetMapping("")
    public ResponseEntity<?> getAllProducts(
            @RequestParam("page") int page,
            @RequestParam("limit") int limit
    ) {
        return ResponseEntity.ok("Get product here");
    }

    @GetMapping("/{id}")
    public  ResponseEntity<String> getProductById(@PathVariable("id") String product_id) {
        return ResponseEntity.ok("OK get category with id= "+product_id);
    }
}
