package java1;

public class human {
String name;
int age;
float height;
String eyecolor;
  

public human(String name, int age, float height, String eyecolor) {
	super();
	this.name = name;
	this.age = age;
	this.height = height;
	this.eyecolor = eyecolor;
}
public void Speak() {
	System.out.println("\n hello I m "+name);
	System.out.println("I m "+age+"old.");
	System.out.println("My Height "+height+"inched.");
	System.out.println("My eyecolor "+eyecolor);
}
public void eat() {
	System.out.println("\n I m eating...........");
}
public void walk() {
	System.out.println("I m walking...........");
}
public void work() {
	System.out.println("I m working at qvantel..........");
}

}
