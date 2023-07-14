import java.util.concurrent.CopyOnWriteArrayList;
import java.util.*;
public class invest {
List<prod> saleprod=new CopyOnWriteArrayList<prod>();
List<prod> purchaseprod=new CopyOnWriteArrayList<prod>();

public void soldprod() throws InterruptedException {
	for(int i=0;i<10;i++) {
		prod p = new prod(i, " tested product_"+i);
		saleprod.add(p);
		System.out.println("Added "+p);
		try {
			Thread.sleep(10);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
}
 
public void displaysold()
{
	for(prod p : saleprod) {
		System.out.println("printing product :"+ p);
		try {
			Thread.sleep(10);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}

}
