package com.example.entity;

import javax.persistence.*;

@Entity
public class Transaction {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String type;

    // Other transaction details, such as amount, timestamp, etc.

    // Getters and setters
}
