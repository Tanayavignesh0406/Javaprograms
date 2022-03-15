package javaassignment;

class Car{
	int speed;
	double regularPrice;
	String color;
	Car(int speed, double regularPrice, String color){
		this.speed = speed;
		this.regularPrice = regularPrice;
		this.color = color;
	}
	double getSalesPrice() {
		return 10000.0;
	}
}

class Truck extends Car{
	int weight;
	Truck(int weight, int speed, double regularPrice, String color){
		super(speed, regularPrice, color);
		this.weight = weight;
	}
	double getSalesPrice() {
		if(weight > 2000) {
			return 10.0;
		} else {
			return 20.0;
		}
	}
}

class Ford extends Car{
	int year;
	int manufacturerDiscount;
	
	Ford(int year, int manufacturerDiscount, int speed, double regularPrice, String color){
		super(speed, regularPrice, color);
		this.year = year;
		this.manufacturerDiscount = manufacturerDiscount;
	}
	double getSalesPrice() {
		return super.getSalesPrice() - manufacturerDiscount;
	}
}

class Sedan extends Car{
	int length;
	Sedan(int length, int speed, double regularPrice, String color){
		super(speed, regularPrice, color);
		this.length = length;
	}
	double getSalesPrice() {
		if(length > 20){
			return 5.0;
		} else {
			return 10.0;
		}
	}
}


public class MyOwnAutoShop {
	public static void main(String args[]) {
		Sedan sedan = new Sedan(5,100,1000.0,"Red");
		Ford ford1 = new Ford(2010,2,100,1000.0,"Green");
		Ford ford2 = new Ford(2012,2,100,10000.0,"Black");
		Car car = new Car(100, 15000.0, "White");
		
		System.out.println(sedan.getSalesPrice());
		System.out.println(ford1.getSalesPrice());
		System.out.println(ford2.getSalesPrice());
		System.out.println(car.getSalesPrice());
	}
}
