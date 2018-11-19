package gr.charos.homeapp.commons.model.forecast;

import gr.charos.homeapp.commons.model.props.Properties.TransactionType;

public class Forecast {
	
	private String forecastCode;
	
	private String description;
	
	private TransactionType transactionType;
	
	private int reoccurenceInDays;
	private int ammountInCents;
	
	public int getReoccurenceInDays() {
		return reoccurenceInDays;
	}

	public Forecast setReoccurenceInDays(int reoccurenceInDays) {
		this.reoccurenceInDays = reoccurenceInDays;
		return this;
	}

	public int getAmmountInCents() {
		return ammountInCents;
	}

	public Forecast setAmmountInCents(int ammountInCents) {
		this.ammountInCents = ammountInCents;
		return this;
	}

	public String getDescription() {
		return description;
	}

	public Forecast setDescription(String description) {
		this.description = description;
		return this;
	}

	public TransactionType getTransactionType() {
		return transactionType;
	}

	public Forecast setTransactionType(TransactionType transactionType) {
		this.transactionType = transactionType;
		return this;
	}

	public String getForecastCode() {
		return forecastCode;
	}

	public void setForecastCode(String forecastCode) {
		this.forecastCode = forecastCode;
	}
}
