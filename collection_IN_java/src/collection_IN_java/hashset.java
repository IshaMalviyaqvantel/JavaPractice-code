package collection_IN_java;
import java.util.*;
public class hashset {
	public static void main(String args[]) {
		HashSet<Integer> hs=new HashSet<Integer>();
		hs.add(4);
		hs.add(7);
		hs.add(4);
		hs.add(9);
		for( int num: hs) {
			System.out.println(" "+num);
		}
	}

}
