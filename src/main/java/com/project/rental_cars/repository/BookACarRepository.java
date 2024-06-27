package com.project.rental_cars.repository;

import com.project.rental_cars.dto.BookACarDto;
import com.project.rental_cars.entity.BookACar;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookACarRepository extends JpaRepository<BookACar, Long> {
    List<BookACarDto> findAllByUserId(Long userId);
}
