package in.bushansirgur.expensetracker.service;

import java.util.List;

import in.bushansirgur.expensetracker.model.Expense;

public interface ExpenseService {
	
	List<Expense> findAll();
	
	Expense save(Expense expense);
	
	Expense findById(long id);
}