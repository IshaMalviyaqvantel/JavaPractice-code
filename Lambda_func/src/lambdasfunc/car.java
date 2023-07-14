package lambdasfunc;

public class car {
	String model,make,color;
	int price;
	public car(String model, String make, String color, int price) {
		super();
		this.model = model;
		this.make = make;
		this.color = color;
		this.price = price;
	}
	
	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	public void printcar() {
		System.out.println(this);
	}

	@Override
	public String toString() {
		return "car [model=" + model + ", make=" + make + ", color=" + color + ", price=" + price + "]";
	}
	

}
