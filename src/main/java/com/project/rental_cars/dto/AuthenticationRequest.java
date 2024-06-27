package com.project.rental_cars.dto;


import lombok.Data;

@Data
public class AuthenticationRequest {

    private String email;
    private String password;
}
