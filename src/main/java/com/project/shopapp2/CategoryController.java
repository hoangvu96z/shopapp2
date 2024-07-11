package com.project.shopapp2;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/categories")
public class CategoryController {
    @GetMapping("")
    public ResponseEntity<String> getAllCategories() {
        return ResponseEntity.ok("HIHI");
    }
    @PutMapping("/{id}")
    public ResponseEntity<String> updateById(@PathVariable Long id) {
        return ResponseEntity.ok("This id "+ id);
    }
}
