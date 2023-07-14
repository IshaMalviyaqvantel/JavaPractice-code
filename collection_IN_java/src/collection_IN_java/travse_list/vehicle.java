package collection_IN_java.travse_list;

public class vehicle {
String make;
String modle;
int price;
boolean forwheel;

@Override
public String toString() {
	return "vehicle [make=" + make + ", modle=" + modle + ", price=" + price + ", forwheel=" + forwheel + "]";
}
public vehicle(String make, String modle, int price, boolean forwheel) {
	super();
	this.make = make;
	this.modle = modle;
	this.price = price;
	this.forwheel = forwheel;
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
public boolean isForwheel() {
	return forwheel;
}
public void setForwheel(boolean forwheel) {
	this.forwheel = forwheel;
}


}
