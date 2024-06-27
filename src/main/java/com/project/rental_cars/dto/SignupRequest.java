package com.project.rental_cars.dto;


import lombok.Data;

@Data
public class SignupRequest {
    private String email;
    private String name;
    private String password;
}
