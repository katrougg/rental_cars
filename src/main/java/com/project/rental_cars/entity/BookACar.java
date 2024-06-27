package com.project.rental_cars.entity;


import com.fasterxml.jackson.annotation.JsonIgnore;
import com.project.rental_cars.dto.BookACarDto;
import com.project.rental_cars.enums.BookCarStatus;
import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;
import org.springframework.boot.autoconfigure.web.WebProperties;

import java.util.Date;

@Entity
@Data
public class BookACar {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;
    private Date fromDate;
    private Date toDate;
    private Long days;
    private Long price;
    private BookCarStatus bookCarStatus;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "user_id", nullable = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JsonIgnore
    private User user;


    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "car_id", nullable = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JsonIgnore
    private Car car;

    public BookACarDto getBookACarDto() {
        BookACarDto bookACarDto = new BookACarDto();
        bookACarDto.setId(id);
        bookACarDto.setDays(days);
        bookACarDto.setBookCarStatus(bookCarStatus);
        bookACarDto.setPrice(price);
        bookACarDto.setToDate(toDate);
        bookACarDto.setFromDate(fromDate);
        bookACarDto.setEmail(user.getEmail());
        bookACarDto.setUsername(user.getUsername());
        bookACarDto.setUserId(user.getId());
        bookACarDto.setCarId(car.getId());
        return bookACarDto;

    }
}
