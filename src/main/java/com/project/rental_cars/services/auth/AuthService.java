package com.project.rental_cars.services.auth;

import com.project.rental_cars.dto.SignupRequest;
import com.project.rental_cars.dto.UserDTO;

public interface AuthService {
    UserDTO createCustomer(SignupRequest signupRequest);

    boolean hasCustomerWithEmail(String email);

}
