package salecar;

public class vehicle {
String make;
String modle;
int price;

public vehicle(String make, String modle, int price) {
	super();
	this.make = make;
	this.modle = modle;
	this.price = price;
}
public String getMake() {
	return make;
}
public void setMake(String make) {
	this.make = make;
}
public String getModle() {
	return modle;
}
public void setModle(String modle) {
	this.modle = modle;
}
public int getPrice() {
	return price;
}
public void setPrice(int price) {
	this.price = price;
}
@Override
public String toString() {
	return "vehicle [make=" + make + ", modle=" + modle + ", price=" + price + "]";
}

}
