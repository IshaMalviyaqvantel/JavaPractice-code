

public class thrd {
	public static void main(String[] args) {
		System.out.println("start thread 0");
	
		Thread tr1= new Thread(new Runnable() {



			@Override
			public void run() {
				// TODO Auto-generated method stub
	
				for(int i=0;i<10;i++) {
					System.out.println("number "+i+"- "+Thread.currentThread().getName());
					try {
						Thread.sleep(10);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
			
			
		});
		tr1.start();
		
	
		System.out.println("start thread 1");
		
	
		Thread tr2=new Thread(new Runnable() {

			@Override
			public void run() {
				
				for(int i=0;i<10;i++) {
					System.out.println("number "+i+"- "+Thread.currentThread().getName());
					try {
						Thread.sleep(10);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
				
		
			
		});
		tr2.start();
		
		
		
	}
	

}
class task implements Runnable {
String name;
public task(String name) {
	this.name=name;
	}
public void run() {
	Thread.currentThread().setName(this.name);
	for(int i=0;i<10;i++) {
		System.out.println("number "+i+"- "+Thread.currentThread().getName());
	}
}
}
