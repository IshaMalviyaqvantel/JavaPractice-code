package fileprocess;

public class student {
String name;
int rollno;
int age;
public student(String name, int rollno, int age) {
	super();
	this.name = name;
	this.rollno = rollno;
	this.age = age;
}

public String getName() {
	return name;
}
@Override
public String toString() {
	return "student [name=" + name + ", rollno=" + rollno + ", age=" + age + "]";
}

public void setName(String name) {
	this.name = name;
}
public int getRollno() {
	return rollno;
}
public void setRollno(int rollno) {
	this.rollno = rollno;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}


}
