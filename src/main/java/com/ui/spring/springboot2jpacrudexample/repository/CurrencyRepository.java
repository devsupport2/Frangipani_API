package com.ui.spring.springboot2jpacrudexample.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ui.spring.springboot2jpacrudexample.model.Currency;

@Repository
public interface CurrencyRepository extends JpaRepository<Currency, Long>{
	 
}
