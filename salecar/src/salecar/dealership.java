package salecar;

public class dealership {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		customer cust1 =new customer();
		 cust1.setName("Isha");
		 cust1.setAddress("15.abhinav Nagar,indore");
		 cust1.setCashonhand(12000);
		 
		 vehicle vec=new vehicle("honda","Accord",120000);
		 
		 
		 employee emp=new employee();
		 cust1.purchase(vec, emp, false);

	}

}
