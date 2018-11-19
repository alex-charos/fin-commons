package gr.charos.homeapp.commons.model.transaction;

import java.util.Date;

import gr.charos.homeapp.commons.model.forecast.Forecast;
import gr.charos.homeapp.commons.model.props.Properties.TransactionType;

public class ForecastTransaction extends Transaction {
	
	public ForecastTransaction() {
		super();
	}
	
	public ForecastTransaction(String transactionCode, Date d, Forecast forecast) {
		super(transactionCode,d);
		this.forecastExecuted = forecast;
	}
	
	private Forecast forecastExecuted;
	public Forecast getForecastExecuted() {
		return forecastExecuted;
	}
	public void setForecastExecuted(Forecast forecastExecuted) {
		this.forecastExecuted = forecastExecuted;
	}
	@Override
	public int getAmmountInCents() {
		return getForecastExecuted().getAmmountInCents();
	}
	@Override
	public TransactionType getTransactionType() {
		return getForecastExecuted().getTransactionType();
	}

	@Override
	public String getDescription() {
		StringBuilder sb = new StringBuilder();
		sb.append(getForecastExecuted().getDescription());
		sb.append(" at" );
		sb.append(new Date());
		return sb.toString();
	}
	 
}
