package com.dimitrova.fullcrudsavetravels.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import com.dimitrova.fullcrudsavetravels.models.Expense;
import com.dimitrova.fullcrudsavetravels.services.ExpenseService;

@Controller
public class ExpenseController {
	
//	set up access to service
	@Autowired
	ExpenseService expenseService;
	
//	redirect to main page
	@GetMapping("/")
	public String home() {
		return "redirect:/expenses";
	}
	
//	list out all expenses previously input
	@GetMapping("/expenses")
	public String index(@ModelAttribute("expense") Expense expense, Model model) {
		List<Expense> expenses = expenseService.allExpenses();
		model.addAttribute("expenses", expenses);
		return "index.jsp";
	}
	
//	check for errors and redirect
	@PostMapping("/expenses")
	public String index(@Valid @ModelAttribute("expense") Expense expense, BindingResult result, Model model) {
		if(result.hasErrors()) {
			List<Expense> expenses = expenseService.allExpenses();
			model.addAttribute("expenses", expenses);
			return "index.jsp";
		}
		else {
			expenseService.createExpense(expense);
			return "redirect:/expenses";
		}
	}
	
//	edit expenses
	@GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, Model model) {
        Expense expense = expenseService.findExpense(id);
        model.addAttribute("expense", expense);
        return "edit.jsp";
    }
    
    @PutMapping("/edit/{id}")
    public String update(@Valid @ModelAttribute("expense") Expense expense, BindingResult result) {
        if (result.hasErrors()) {
            return "redirect:/edit/{id}";
        } 
        else {
            expenseService.updateExpense(expense);
            return "redirect:/expenses";
        }
    }
	
    
//    delete expenses
    @DeleteMapping("/expenses/{id}")
    public String destroy(@PathVariable("id") Long id) {
        expenseService.deleteExpense(id);
        return "redirect:/expenses";
    }
    
//    expense details
    @GetMapping("/expenses/{id}")
    public String showExpenses(Model viewModel, @PathVariable("id") Long id) {
		viewModel.addAttribute("expense", this.expenseService.findExpense(id));
		return "details.jsp";
    }
}