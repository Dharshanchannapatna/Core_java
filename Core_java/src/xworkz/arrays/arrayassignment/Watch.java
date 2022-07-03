package xworkz.arrays.arrayassignment;

public class Watch {
	String brand;
	String color;
	double price;
	 Watch(String brand,String color,double price){
		 this.brand=brand;
		 this.color=color;
		 this.price=price;
	 }
	@Override
	public String toString() {
		return "Watch [brand=" + brand + ", color=" + color + ", price=" + price + "]";
	}
	 

}
