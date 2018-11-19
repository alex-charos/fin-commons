package gr.charos.homeapp.commons.model;

public class House extends Spender {
	
	private String address;

	public String getAddress() {
		return address;
	}

	public House setAddress(String address) {
		this.address = address;
		return this;
	}

}
