package gr.charos.homeapp.commons.model;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

import gr.charos.homeapp.commons.model.forecast.Forecast;
import gr.charos.homeapp.commons.model.props.Properties.TransactionType;
import gr.charos.homeapp.commons.model.transaction.Transaction;

public class Spender {
	private String code;
	private Set<Forecast> forecasts;
	protected Set<Transaction> transactions;
	
	public Set<Transaction> getIncomingTransactions() {
		return filterTransactionsByTransactionType(TransactionType.incoming);
	}
	public Set<Transaction> getOutgoingTransactions() {
		return filterTransactionsByTransactionType(TransactionType.outgoing);
	}
	
	public Set<Forecast> getIncomingForecasts() {
		return filterForecastsByTransactionType(TransactionType.incoming);
	}
	public Set<Forecast> getOutgoingForecasts() {
		return filterForecastsByTransactionType(TransactionType.outgoing);
	}
	
	private Set<Forecast> filterForecastsByTransactionType(TransactionType tt) {
		return getForecasts()
				.stream()
				.filter(p-> p.getTransactionType().equals(tt))
				.collect(Collectors.toSet());
	}
	private Set<Transaction> filterTransactionsByTransactionType(TransactionType tt) {
		for (Transaction t : getTransactions()) {
			if (t.getTransactionType() == null) {
				System.out.println(t);
			}
		}
		
		return getTransactions()
				.stream()
				.filter(p-> p.getTransactionType().equals(tt))
				.collect(Collectors.toSet());
	}
	

	public Set<Transaction> getTransactions() {
		if (transactions == null) {
			transactions = new HashSet<Transaction>();
		}
		return transactions;
	}

	public void setTransactions(Set<Transaction> transactions) {
		this.transactions = transactions;
	}

	public Set<Forecast> getForecasts() {
		if (forecasts==null) {
			forecasts = new HashSet<Forecast>();
		}
		return forecasts;
	}

	public void setForecasts(Set<Forecast> forecasts) {
		
		this.forecasts = forecasts;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}

}
