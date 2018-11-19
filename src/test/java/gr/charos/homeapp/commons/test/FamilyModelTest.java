package gr.charos.homeapp.commons.test;

import java.util.Date;

import org.junit.Test;

import gr.charos.homeapp.commons.model.Family;
import gr.charos.homeapp.commons.model.House;
import gr.charos.homeapp.commons.model.forecast.Forecast;
import gr.charos.homeapp.commons.model.props.Properties.ExpenseType;
import gr.charos.homeapp.commons.model.props.Properties.IncomeType;
import gr.charos.homeapp.commons.model.props.Properties.TransactionType;
import gr.charos.homeapp.commons.model.transaction.AdHocTransaction;
import gr.charos.homeapp.commons.model.transaction.ForecastTransaction;

public class FamilyModelTest {
	
	@Test
	public void testModel() {
		House f = new House()
				.setAddress("Mr. & Mrs. Charos");
		Forecast rent = new Forecast();
		rent.setTransactionType(TransactionType.outgoing);
		rent.setReoccurenceInDays(30);
		rent.setAmmountInCents(430*100);
		rent.setDescription("Rent");
		f.getForecasts().add(rent);
		
		Forecast alexWage = new Forecast();
		alexWage.setAmmountInCents(1610*100);
		alexWage.setDescription("Alex's Wage");
		alexWage.setReoccurenceInDays(30);
		alexWage.setTransactionType(TransactionType.incoming);
		f.getForecasts().add(alexWage);
		
		
//		ForecastTransaction aWage = new ForecastTransaction(alexWage);
//		aWage.setDate(new Date());
//		aWage.setForecastExecuted(alexWage);
//		
//		
//		AdHocTransaction cigarettes = new AdHocTransaction(TransactionType.outgoing, 540);
//		
//		f.getTransactions().add(aWage);
//		f.getTransactions().add(cigarettes);
//		
		
	}

}
