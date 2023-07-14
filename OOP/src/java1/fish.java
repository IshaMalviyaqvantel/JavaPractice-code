package java1;

public class fish extends animal {
	
 public fish(int age, String gender, int weightslh) {
		super(age, gender, weightslh);
		// TODO Auto-generated constructor stub
	}

public void swim() {
	 System.out.println("\n swimming......");
 }

@Override
public void move() {
	// TODO Auto-generated method stub
	System.out.println("fish is swimming............");
}
}
