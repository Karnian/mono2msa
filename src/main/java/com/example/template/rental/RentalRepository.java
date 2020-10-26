package com.example.template.rental;

import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;

public interface RentalRepository extends PagingAndSortingRepository<Rental, Long> {

    List<Rental> findByCustomerId(String customerId);
}

