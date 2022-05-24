package com.dimitrova.fullcrudsavetravels.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.dimitrova.fullcrudsavetravels.models.Expense;
import com.dimitrova.fullcrudsavetravels.repositories.ExpenseRepository;

@Service
public class ExpenseService {
//	add repository as dependency
	private final ExpenseRepository expenseRepo;
	
	public ExpenseService(ExpenseRepository expenseRepo) {
		this.expenseRepo = expenseRepo;
	}
	
//	return all expenses
	public List<Expense> allExpenses(){
		return expenseRepo.findAll();
	}
	
//	create an expense
	public Expense createExpense(Expense expense) {
		return expenseRepo.save(expense);
	}
	
//	update expense
	public Expense updateExpense(Expense expense) {
		return expenseRepo.save(expense);
	}
	
//	find expense
	public Expense findExpense(Long id) {
			return this.expenseRepo.findById(id).orElse(null);
		}
	
//	delete expense
	public void deleteExpense(Long id) {
		Optional<Expense> optionalExpense = expenseRepo.findById(id);
		if(optionalExpense.isPresent()) {
			expenseRepo.deleteById(id);
		}
	}

}