package com.example.springapp.Services;

import com.example.springapp.Repositories.ReviewRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReviewService implements ReviewServiceInt
{
    @Autowired
    private ReviewRepo obr;

    @Override
    public void saveData()
    {
        // obr.save();
    }
}
