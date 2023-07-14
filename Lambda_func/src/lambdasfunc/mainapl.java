package lambdasfunc;
import  java.util.*;
public class mainapl {

	public static void main(String[] args) {
	List<car>c=Arrays.asList(
			new car("honda", "xyz", "block", 80000),
			new car("suzeki","abc","white",75000),
			new car("indigo","hji","voilet",25000)
			);
	range(c,26000,76000);
	col(c,"white");
	System.out.println("range price");
	
concn(c,new condition() {
	

		@Override
		public boolean test(car c) {
			// TODO Auto-generated method stub
			return c.getPrice()>=26000 && c.getPrice()<=76000;
		}
	}			
	);
	
System.out.println("match color");

concn(c,new condition() {
	

		@Override
		public boolean test(car c) {
			// TODO Auto-generated method stub
			return c.getColor().equals("white");
	}
}
	);
	

	
		// TODO Auto-generated method stub

	}
	
	public static void  concn(List<car>c,   condition con)
	
	{
	for(car c1:c)	
	{
		if(con.test(c1)) {
			
			c1.printcar();
		}
	}
	
	}
		public static void range(List<car>c, int l,int h) {
		for(car c1: c) {
			if(l>=c1.getPrice() && h<=c1.getPrice()) {
				c1.printcar();
			}
			
		}
	}
	public static void col(List<car>c,String color) {
		for(car c1:c) {
			if(c1.getColor().equals(color)) {
				c1.printcar();
			}
		}
	}

}
interface condition{
	public boolean test(car c);
	
}
