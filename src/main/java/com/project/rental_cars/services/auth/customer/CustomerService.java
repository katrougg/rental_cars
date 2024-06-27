package com.project.rental_cars.services.auth.customer;

import com.project.rental_cars.dto.BookACarDto;
import com.project.rental_cars.dto.CarDto;
import com.project.rental_cars.dto.CarDtoListDto;
import com.project.rental_cars.dto.SearchCarDto;

import java.util.List;

public interface CustomerService {

    List<CarDto> getAllCars();

    boolean bookACar(BookACarDto bookACarDto);

    CarDto getCarById(Long carId);

    List<BookACarDto> getBookingsByUserId(Long userId);

    CarDtoListDto searchCar(SearchCarDto searchCarDto);

}
