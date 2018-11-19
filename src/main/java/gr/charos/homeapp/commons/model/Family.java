package gr.charos.homeapp.commons.model;

import java.util.HashSet;
import java.util.Set;

import gr.charos.homeapp.commons.model.forecast.Forecast;
import gr.charos.homeapp.commons.model.transaction.Transaction;

public class Family {
	
	private String familyName;

	private House house;
	private Set<House> vacationHouses;
	private Set<Member> members;
	private Set<Vehicle> vehicles;
	private Set<Budget> budgets;
	
	public Set<Forecast> getIncomingForecasts() {
		Set<Forecast> forecasts = new HashSet<Forecast>();
		forecasts.addAll(getHouse().getIncomingForecasts());
		
		for (Spender m : getMembers()) {
			forecasts.addAll(m.getIncomingForecasts());
		}
		for (Spender m : getVacationHouses()) {
			forecasts.addAll(m.getIncomingForecasts());
		}
		for (Spender m : getVehicles()) {
			forecasts.addAll(m.getIncomingForecasts());
		}
		return forecasts;
	}
	
	public Set<Forecast> getOutgoingForecasts() {
		Set<Forecast> forecasts = new HashSet<Forecast>();
		forecasts.addAll(getHouse().getOutgoingForecasts());
		
		for (Spender m : getMembers()) {
			forecasts.addAll(m.getOutgoingForecasts());
		}
		for (Spender m : getVacationHouses()) {
			forecasts.addAll(m.getOutgoingForecasts());
		}
		for (Spender m : getVehicles()) {
			forecasts.addAll(m.getOutgoingForecasts());
		}
		return forecasts;
	}
	
	public Set<Transaction> getIncomingTransactions() {
		Set<Transaction> transactions = new HashSet<Transaction>();
		transactions.addAll(getHouse().getIncomingTransactions());
		
		for (Spender m : getMembers()) {
			transactions.addAll(m.getIncomingTransactions());
		}
		for (Spender m : getVacationHouses()) {
			transactions.addAll(m.getIncomingTransactions());
		}
		for (Spender m : getVehicles()) {
			transactions.addAll(m.getIncomingTransactions());
		}
		return transactions;
	}
	
	public Set<Transaction> getOutgoingTransactions() {
		Set<Transaction> transactions = new HashSet<Transaction>();
		transactions.addAll(getHouse().getOutgoingTransactions());
		
		for (Spender m : getMembers()) {
			transactions.addAll(m.getOutgoingTransactions());
		}
		for (Spender m : getVacationHouses()) {
			transactions.addAll(m.getOutgoingTransactions());
		}
		for (Spender m : getVehicles()) {
			transactions.addAll(m.getOutgoingTransactions());
		}
		return transactions;
	}
	
	public House getHouse() {
		return house;
	}
	public Family setHouse(House house) {
		this.house = house;
		return this;
	}
	 
	public Set<Member> getMembers() {
		if (members == null) {
			members = new HashSet<Member>();
		}
		return members;
	}
	public Family setMembers(Set<Member> members) {
		this.members = members;
		return this;
	}
	public Set<Vehicle> getVehicles() {
		if (vehicles == null) {
			vehicles = new HashSet<Vehicle>();
		}
		return vehicles;
	}
	public Family setVehicles(Set<Vehicle> vehicles) {
		this.vehicles = vehicles;
		return this;
	}
	public String getFamilyName() {
		return familyName;
	}
	public Family setFamilyName(String familyName) {
		this.familyName = familyName;
		return this;
	}
	public Set<House> getVacationHouses() {
		return vacationHouses;
	}
	public void setVacationHouses(Set<House> vacationHouses) {
		this.vacationHouses = vacationHouses;
	}

	public Set<Budget> getBudgets() {
		if (budgets == null) {
			budgets = new HashSet<>();
		}
		return budgets;
	}

	public void setBudgets(Set<Budget> budgets) {
		this.budgets = budgets;
	}
	
	
	

}
