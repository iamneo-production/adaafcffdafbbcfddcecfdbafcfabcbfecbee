package com.example.springapp.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController 
{
    @Autowired
    private ReviewService rs;

    // @PostMapping("/")
    // public void saveData()
    // {
    //     rs.save();
    // }
}
