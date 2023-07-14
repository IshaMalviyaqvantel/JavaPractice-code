package salecar;

public class employee {
 public void handle_cust(customer cust, boolean finance, vehicle vec) {
	 if(finance==true) {
		 double loan_amount=vec.getPrice()-cust.getCashonhand();
		 runCreditHistory(cust,loan_amount);
	 }
	 else if(vec.getPrice()<=cust.getCashonhand())
	 {
		 ProcessTransaction(cust,vec);
	 }
	 else {
		 System.out.println("Customer will need more money to purchase car. ");
	 }
	 
 }


public void runCreditHistory(customer cust, double loan_amount) {
System.out.println(" Run credit history for customer............");
System.out.println("Customer will has been purchased the vehicles.");

}
public void ProcessTransaction(customer cust,vehicle vec) {
	System.out.println("Customer has purchased the vehicles"+ vec+" for the Price  "+ vec.getPrice() );
	
}
}
