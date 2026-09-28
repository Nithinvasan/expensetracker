package com.example.expensetracker.dto;

import java.math.BigDecimal;
import java.time.LocalDate;

public class ExpenseDTO {

    private Long id;
    private String title;
    private BigDecimal amount;
    private LocalDate expenseDate;

    public ExpenseDTO() {
    }

    public ExpenseDTO(Long id, String title, BigDecimal amount, LocalDate expenseDate) {
        this.id = id;
        this.title = title;
        this.amount = amount;
        this.expenseDate = expenseDate;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public LocalDate getExpenseDate() {
        return expenseDate;
    }

    public void setExpenseDate(LocalDate expenseDate) {
        this.expenseDate = expenseDate;
    }
}