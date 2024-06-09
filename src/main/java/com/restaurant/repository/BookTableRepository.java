package com.restaurant.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.restaurant.entity.BookTable;

public interface BookTableRepository extends JpaRepository<BookTable, Integer>{

}
