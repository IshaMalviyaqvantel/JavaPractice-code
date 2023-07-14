import java.util.*;

public class producer implements Runnable {
	
	List<Integer> qlist =null;
	final int limit=5;
	private int qno;
	 Object myob=new Object();
	  
	public producer(List<Integer> qlist) {
		super();
		this.qlist = qlist;
	}






	public void readq(int qno) throws InterruptedException {
		synchronized(qlist) {
		while(qlist.size()==limit) {
			System.out.println("queation has pilled. wait for answer");
		qlist.wait();
		}
	}
		synchronized(qlist) {
			System.out.println("new Qestion "+qno);
			qlist.add(qno);
			Thread.sleep(2000);
			qlist.notify();
			}
		}
	
	
	
	
	
	

	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true) {
			try {
				readq(qno++);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	

}
