package com.project.shopapp2.repositories;

import com.project.shopapp2.models.Category;
import com.project.shopapp2.models.OrderDetail;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
