package collection_IN_java;
import java.util.ArrayList;
import java.util.*;
public class list {
	
	public static void main(String args[]) {
	// Arraylist 
		ArrayList wds=new ArrayList();
		wds.add("isha");
		wds.add("there");
		wds.add(10);
		wds.add(15);
		wds.add(12.00);
		int item1= (int)wds.get(2);
		int item2=(int)wds.get(3);
		System.out.println(item1+item2);
		
		
		// Arraylist for particular datatype
		ArrayList <String> s= new ArrayList<String>();
		s.add("isha");
		s.add("arya");
		s.add("ram");
		String st= s.get(2);
		System.out.println(st);
		
		
		// linked  list
		
		LinkedList<Integer> l=new LinkedList<Integer>();
		l.add(4);
		l.add(8);
		l.add(12);
		l.add(16);
		l.add(20);
		for(int num: l) {
			System.out.print(" "+num);
		}
		
		
		System.out.print("\n");
		l .remove();
		for(int num: l) {
			System.out.print(" "+num);
		}
		
	
		System.out.print("\n");
	l.removeFirst();
	for(int num: l) {
		System.out.print(" "+num);
	}
	
	System.out.print("\n");
l.removeLast();
for(int num: l) {
	System.out.print(" "+num);
}

		
	
		
		
	}

}
