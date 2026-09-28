package com.example.expensetracker.service;

import com.example.expensetracker.entity.Budget;
import com.example.expensetracker.repository.BudgetRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BudgetService {

    private final BudgetRepository budgetRepository;

    public BudgetService(BudgetRepository budgetRepository) {
        this.budgetRepository = budgetRepository;
    }

    public List<Budget> getAllBudgets() {
        return budgetRepository.findAll();
    }

    public Budget getBudgetById(Long id) {
        return budgetRepository.findById(id).orElse(null);
    }

    public Budget addBudget(Budget budget) {
        return budgetRepository.save(budget);
    }

    public Budget updateBudget(Long id, Budget budget) {
        budget.setId(id);
        return budgetRepository.save(budget);
    }

    public void deleteBudget(Long id) {
        budgetRepository.deleteById(id);
    }
}