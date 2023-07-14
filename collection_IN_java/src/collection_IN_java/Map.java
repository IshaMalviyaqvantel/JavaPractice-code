package collection_IN_java;
import java.util.*;

public class Map {

	public class Entry<T1, T2> {

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap <Integer,String>hm=new HashMap<Integer,String>();
		hm.put(1, " ram");
		hm.put(8, "charan");
		hm.put(5, "cherry");
		hm.put(6, "raja");
		
		
		for(int num: hm.keySet()) {
			System.out.println(num);
		}
		for(String wd:hm.values()) {
			System.out.println(hm.get(wd));
		}
		for(java.util.Map.Entry<Integer, String> en: hm.entrySet()) {
		System.out.println(en.getKey());
		System.out.println(en.getValue());
		}
		
		LinkedHashMap <Integer,String>l=new LinkedHashMap<Integer,String>();
		l.put(1, " ram");
		l.put(8, "charan");
		l.put(5, "cherry");
		l.put(6, "raja");
		
		
		for(int num: l.keySet()) {
			System.out.println(l);
		}
	
	}

}
