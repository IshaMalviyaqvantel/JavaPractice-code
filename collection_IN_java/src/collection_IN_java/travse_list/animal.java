package collection_IN_java.travse_list;
import java.util.*;

public class animal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<String> ar= new ArrayList<String>();
ar.add("Dog");
ar.add("cat");
ar.add("Lion");
ar.add("Goat");

for(int i=0;i<ar.size();i++) {
	System.out.println(ar.get(i));
}
 for( String st:ar) {
	 System.out.println(st);
 }
 
 // vehicles list
 ArrayList <vehicle> v=new ArrayList<vehicle>();
 
 v.add(new vehicle("Toyota", "camery", 12000, false));
 v.add(new vehicle("honda", "accord", 12000, false));
 v.add(new vehicle("jeep", "wrangles", 25000, true));
 for(vehicle v1 :v) {
	 System.out.println(v1);
	
 }
printElement(ar);
printElement(v);
	}
	public static void printElement(ArrayList l1) {
		for(int i=0;i<l1.size();i++) {
			System.out.println(l1.get(i));
		}
	}
}
