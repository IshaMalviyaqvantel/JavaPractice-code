package java1;

public class bird extends animal{
	
	public bird(int age, String gender, int weightslh) {
		super(age, gender, weightslh);
		// TODO Auto-generated constructor stub
	}

	public void fly() {
		System .out.println("\n flying");
	}

	@Override
	public void move() {
		System.out.println("flapping wing....");
		// TODO Auto-generated method stub
		
	}

}
