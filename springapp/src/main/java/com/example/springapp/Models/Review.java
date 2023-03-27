package com.example.springapp.Models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Review 
{
    @Id
    @Column(name="reviewId")
    private int reviewId;    

    @Column(name="userId")
    private int userId; 

    @Column(name="productId")
    private int productId; 

    @Column(name="reviewText")
    private String reviewText; 

    @Column(name="reviewDate")
    private String reviewDate;

    public int getReviewId() 
    {
        return reviewId;
    }

    public void setReviewId(int reviewId)
    {
        this.reviewId = reviewId;
    }

    public int getUserId() 
    {
        return userId;
    }

    public void setUserId(int userId) 
    {
        this.userId = userId;
    }

    public int getProductId() 
    {
        return productId;
    }

    public void setProductId(int productId) 
    {
        this.productId = productId;
    }

    public String getReviewText() 
    {
        return reviewText;
    }

    public void setReviewText(String reviewText) 
    {
        this.reviewText = reviewText;
    }

    public String getReviewDate() 
    {
        return reviewDate;
    }

    public void setReviewDate(String reviewDate) 
    {
        this.reviewDate = reviewDate;
    }

    public Review(int reviewId, int userId, int productId, String reviewText, String reviewDate) 
    {
        this.reviewId = reviewId;
        this.userId = userId;
        this.productId = productId;
        this.reviewText = reviewText;
        this.reviewDate = reviewDate;
    }

    @Override
    public String toString() {
        return "Review [productId=" + productId + ", reviewDate=" + reviewDate + ", reviewId=" + reviewId
                + ", reviewText=" + reviewText + ", userId=" + userId + "]";
    } 
}
