package com.restaurant.repository;

import org.springframework.data.jpa.repository.JpaRepository;


import com.restaurant.entity.Dinner;

public interface Dinnerrepo extends JpaRepository <Dinner,Long> {

}
