package com.project.rental_cars.services.auth.admin;

import com.project.rental_cars.dto.BookACarDto;
import com.project.rental_cars.dto.CarDto;
import com.project.rental_cars.dto.CarDtoListDto;
import com.project.rental_cars.dto.SearchCarDto;
import com.project.rental_cars.entity.Car;

import java.io.IOException;
import java.nio.channels.ScatteringByteChannel;
import java.util.List;

public interface AdminService {

     boolean postCar(CarDto carDto) throws IOException;

     List<CarDto> getAllCars();

     void deleteCar(Long id);

     CarDto getCarById(Long id);

     boolean updateCar(Long carId, CarDto carDto) throws IOException;

     List<BookACarDto> getBookings();

     boolean changeBookingStatus(Long bookingId, String status);

     CarDtoListDto searchCar(SearchCarDto searchCarDto);
}