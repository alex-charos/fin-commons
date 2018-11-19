package gr.charos.homeapp.commons.model.transaction;

import java.util.Date;

import gr.charos.homeapp.commons.model.props.Properties.TransactionType;

public class AdHocTransaction extends Transaction {
	
	private String description;
	private TransactionType transactionType;
	private int ammountInCents;
	
	public AdHocTransaction() {
		super();
	}
	
	public AdHocTransaction(String transactionCode, Date d,TransactionType type, int ammountInCents, String description) {
		super(transactionCode,d);
		this.transactionType = type;
		this.ammountInCents = ammountInCents;
		this.setDescription(description);
	
	}
	
	
	@Override
	public TransactionType getTransactionType() {
		return transactionType;
	}


	public int getAmmountInCents() {
		return ammountInCents;
	}

	public void setAmmountInCents(int ammountInCents) {
		this.ammountInCents = ammountInCents;
	}

	
	public void setTransactionType(TransactionType transactionType) {
		this.transactionType = transactionType;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}
	

}
