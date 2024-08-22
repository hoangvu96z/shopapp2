package com.project.shopapp2.dtos;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.*;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class UserLoginDTO {
    @NotBlank(message = "Phone number is requred")
    @JsonProperty("phone_number")
    private String phoneNumber;

    @NotNull(message = "Password is required")
    private String password;
}
