import java.util.*;
public class appln {
public static void main(String args[])  {
	List<Integer> l=new ArrayList<Integer>();
	Thread t1=new Thread(new producer(l));
	Thread t2=new Thread(new consumer(l));
	t1.start();
	t2.start();
	
	
	
	}
	
}
