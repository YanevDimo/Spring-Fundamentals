package com.example.andrey.model.service;

import java.math.BigDecimal;

public class UserServiceModel {
    private Long id;
    private String username;
    private String password;
    private String email;
    private BigDecimal budget;

    public UserServiceModel() {
    }

    public Long getId() {
        return id;
    }

    public UserServiceModel setId(Long id) {
        this.id = id;
        return this;
    }

    public String getUsername() {
        return username;
    }

    public UserServiceModel setUsername(String username) {
        this.username = username;
        return this;
    }

    public String getPassword() {
        return password;
    }

    public UserServiceModel setPassword(String password) {
        this.password = password;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public UserServiceModel setEmail(String email) {
        this.email = email;
        return this;
    }

    public BigDecimal getBudget() {
        return budget;
    }

    public UserServiceModel setBudget(BigDecimal budget) {
        this.budget = budget;
        return this;
    }
}
