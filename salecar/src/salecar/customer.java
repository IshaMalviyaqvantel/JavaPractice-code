package salecar;

public class customer {
	private String name;
	private String address;
	private double cashonhand;
	
 public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		address+="dealership city";
		this.address = address;
	}

	public double getCashonhand() {
		return cashonhand;
	}

	public void setCashonhand(double cashonhand) {
		cashonhand+=500;
		this.cashonhand = cashonhand;
	}

public void purchase(vehicle vec, employee emp, boolean finance ) {
	emp.handle_cust(this, finance, vec);
	 
 }

}
