package com.example.expensetracker.dto;

import java.math.BigDecimal;

public class BudgetDTO {

    private Long id;
    private BigDecimal amount;
    private Integer month;
    private Integer year;

    public BudgetDTO() {
    }

    public BudgetDTO(Long id, BigDecimal amount, Integer month, Integer year) {
        this.id = id;
        this.amount = amount;
        this.month = month;
        this.year = year;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public Integer getMonth() {
        return month;
    }

    public void setMonth(Integer month) {
        this.month = month;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }
}