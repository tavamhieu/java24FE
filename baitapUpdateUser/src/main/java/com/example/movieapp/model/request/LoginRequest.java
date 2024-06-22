package com.example.movieapp.model.request;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import lombok.*;
import lombok.experimental.FieldDefaults;
import org.hibernate.validator.constraints.Length;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class LoginRequest {

    @NotEmpty(message = "email ko dc để trống")

    @Email(message = "email ko đúng định dạng")
    String email;

    @NotEmpty(message = "mk ko dc để trống")
    @Length(min =3, message = " mật khẩu sai or thiếu kí tụ")
    String password;
}
