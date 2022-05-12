package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.entity.Tv;

public interface TvRepository extends JpaRepository<Tv, Integer> {

}
