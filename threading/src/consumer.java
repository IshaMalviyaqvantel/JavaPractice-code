import java.util.List;

public class consumer implements Runnable {
	List<Integer> qlist =null;
  
public consumer(List<Integer> qlist) {
	super();
	this.qlist = qlist;
}






public void ansq() throws InterruptedException {
	synchronized(qlist) {
	while(qlist.isEmpty()) {
		System.out.println("no question to answer waiting... producer to get qus.");
	qlist.wait();
	}
}
	synchronized(qlist) {
		Thread.sleep(1000);
		System.out.println("Answer the Qestion "+qlist.remove(0));
	qlist.notify();
		}
	}







@Override
public void run() {
	// TODO Auto-generated method stub
	while(true) {
		try {
			ansq();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

	

}
