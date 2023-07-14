package collection_IN_java;
import java.util.*;
public class hashset_sort {
	public static void main() {
		HashSet<String> hs =new HashSet <String>();
		hs.add("pea");
		hs.add("banana");
		hs.add("carrot");
		hs.add("apple");
		ArrayList<String>ar=new ArrayList<String>(hs);
		Collections.sort(ar);
		System.out.println(ar);
		
		
		
	}

}

