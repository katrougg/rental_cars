package com.project.rental_cars.repository;

import com.project.rental_cars.entity.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestBody;

@Repository
public interface CarRepository extends JpaRepository<Car, Long> {
}
