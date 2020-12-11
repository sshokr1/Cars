public abstract class Car {
protected String name;
protected String brand;
protected String model;
protected double price;
protected String bodyType;
public Car (){
}
abstract void printCarDetails();
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getBrand() {
	return brand;
}
public void setBrand(String brand) {
	this.brand = brand;
}
public String getModel() {
	return model;
}
public void setModel(String model) {
	this.model = model;
}
public double getPrice() {
	return price;
}
public void setPrice(double price) {
	this.price = price;
}
public String getBodyType() {
	return bodyType;
}
public void setBodyType(String bodyType) {
	this.bodyType = bodyType;
}


}
