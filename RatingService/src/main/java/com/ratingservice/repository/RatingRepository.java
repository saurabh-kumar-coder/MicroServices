package com.ratingservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ratingservice.entity.Rating;

public interface RatingRepository extends JpaRepository<Rating, String> {

}
