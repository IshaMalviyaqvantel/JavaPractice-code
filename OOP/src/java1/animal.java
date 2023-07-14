package java1;

public abstract class animal {
	int age;
	String gender;
	int weightslh;
	
	public animal(int age, String gender, int weightslh) {
		super();
		this.age = age;
		this.gender = gender;
		this.weightslh = weightslh;
	}
	public void eat() {
		System.out.println("eating........");
	}
 public void sleep () {
	 System.out.println("sleeping");}
	 public abstract void move();
 }


