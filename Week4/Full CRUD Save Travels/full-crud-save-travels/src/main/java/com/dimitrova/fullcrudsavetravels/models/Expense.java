package com.dimitrova.fullcrudsavetravels.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

// set up table and variables
@Entity
@Table(name="expenses")
public class Expense {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotNull
	@Size(min = 1, max = 400, message="Name cannot be empty.")
	private String name;
	
	@NotNull
	@Size(min = 1, max = 400, message="Vendor cannot be empty.")
	private String vendor;
	
	@NotNull(message="Amount cannot be empty.")
	@DecimalMin(value="0.01", message="Amount must be greater than 0.")
	private Double amount;
	
	@NotNull
	@Size(min = 1, max = 400, message="Description cannot be empty.")
	private String description;
	

//	generate constructor
	public Expense() {}
	
//	populate constructor w/ variables
	public Expense(String name, String vendor, Double amount, String description) {
		this.name = name;
		this.vendor = vendor;
		this.amount = amount;
		this.description = description;
	}

//	getters and setters
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getVendor() {
		return vendor;
	}

	public void setVendor(String vendor) {
		this.vendor = vendor;
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}