package com.example.movieapp.model.request;

import lombok.Data;

@Data
public class UpdateUserRequest {
    private String name;
    private String email;
}