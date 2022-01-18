package model.entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Installment {

	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

	private Date dueDate;
	private Double amount;

	public Installment() {

	}

	public Installment(Date duDate, Double amount) {
		super();
		this.dueDate = duDate;
		this.amount = amount;
	}

	public Date getDuDate() {
		return dueDate;
	}

	public void setDuDate(Date duDate) {
		this.dueDate = duDate;
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	@Override
	public String toString() {
		return sdf.format(dueDate) + " - " + String.format("%.2f", amount);
	}

}
