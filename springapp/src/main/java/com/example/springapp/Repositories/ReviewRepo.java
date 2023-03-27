package com.example.springapp.Repositories;

import com.example.springapp.Models.Review;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface ReviewRepo extends JpaRepository<Review,Integer>
{
    // @Query("Select ")
}
