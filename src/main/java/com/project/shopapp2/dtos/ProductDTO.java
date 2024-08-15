package com.project.shopapp2.dtos;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.*;
import lombok.*;

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ProductDTO {
    @NotBlank(message = "Product name must not empty")
    @Size(min = 3, max = 200, message = "Name must be between 3 and 200 characters")
    private String name;
    @Min(value= 0, message = "price must be greater than or equal 0")
    @Max(value = 10000000, message = "price must be less than or equal 10 000 000")
    private int price;
    private String thumbnail;
    private String description;
    @NotNull(message = "categoryId is requested")
    @JsonProperty("category_id")
    private String categoryId;
}
