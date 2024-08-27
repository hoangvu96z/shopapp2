package com.project.shopapp2.services;

import com.project.shopapp2.dtos.CategoryDTO;
import com.project.shopapp2.models.Category;

import java.util.List;

public interface ICategoryService {
    Category createCategory(CategoryDTO category);
    Category getCategoryById(long id);
    List<Category> getAllCategories();
    Category updateCategory(long categoryId, CategoryDTO category);
    void deleteCategory(long id);
}
