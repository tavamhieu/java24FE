package com.example.movieapp.model.request;

import com.example.movieapp.model.enums.UserRole;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.*;
import lombok.experimental.FieldDefaults;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class CreateUserRequest {
    @NotEmpty(message = "tên ko dc để trống")
    String name;

    @NotEmpty(message = "email  ko dc để trống")
    @Email(message = "email ko hợp lệ ")
    String email;
    @NotNull(message = "role ko dc để trống")

    UserRole role;

}
