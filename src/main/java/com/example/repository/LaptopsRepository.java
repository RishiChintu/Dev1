package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.entity.Laptops;


public interface LaptopsRepository extends JpaRepository<Laptops, Integer> {

}
