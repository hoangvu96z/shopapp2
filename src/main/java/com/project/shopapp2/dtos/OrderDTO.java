package com.project.shopapp2.dtos;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import lombok.*;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class OrderDTO {
    @JsonProperty("user_id")
    @NotBlank(message = "userId is required")
    @Min(value = 1, message = "userId length must be greater than 1")
    private String userId;

    @JsonProperty("fullname")
    @NotBlank(message = "fullName is required")
    private String fullName;

    private String email;

    @JsonProperty("phone_number")
    private String phoneNumber;

    private String address;

    private String note;

    @Min(value = 0, message = "Price must be greater than 0")
    @JsonProperty("total_money")
    private float totalMoney;

    @JsonProperty("shipping_method")
    private float shippingMethod;

    @JsonProperty("shipping_address")
    private float shippingAddress;

    @JsonProperty("payment_method")
    private float paymentMethod;
}
