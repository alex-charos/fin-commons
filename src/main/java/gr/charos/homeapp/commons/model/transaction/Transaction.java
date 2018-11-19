package gr.charos.homeapp.commons.model.transaction;

import java.util.Date;

import gr.charos.homeapp.commons.model.props.Properties.TransactionType;

public abstract class Transaction {
	
	
	private String transactionCode;
	private Date date;
	private String budgetCode;
	
	public Transaction() {}
	
	public Transaction(String transactionCode, Date d) {
		setTransactionCode(transactionCode);
		setDate(d);
	}
	
	
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	
	
	public abstract int getAmmountInCents();
	public abstract String getDescription();
	
	public abstract TransactionType getTransactionType();
	public String getTransactionCode() {
		return transactionCode;
	}
	public void setTransactionCode(String transactionCode) {
		this.transactionCode = transactionCode;
	}

	public String getBudgetCode() {
		return budgetCode;
	}

	public void setBudgetCode(String budgetCode) {
		this.budgetCode = budgetCode;
	}
 
}
