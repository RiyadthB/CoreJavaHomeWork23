package hw5Q2Constructor;

public class Computer {
// Variables declared -->> below
	public String brand;
	public String model;
	public String operatingSystem;
	public double price;
	public char grade;
	public boolean made_By_Usa;

// Default constructor declared -->> below
	public Computer() {
		System.out.println("This is from the default Constructor of Computer class");

	}

//	Parameterized Constructor declared
	public Computer(String brand, String model, String operatingSystem, double price, char grade, boolean made_by_usa) {
		this.brand = brand;
		this.model = model;
		this.operatingSystem = operatingSystem;
		this.price = price;
		this.grade = grade;
		this.made_By_Usa = made_By_Usa;

		System.out.println("\tBrand : " + brand + "\n\tModel: " + model + "\n\tOperating system: " + operatingSystem
				+ "\n\tPrice: " + operatingSystem + "\n\tPrice is : " + price + "\n\tGrade: " + grade
				+ "\n\tMade by USA : " + made_by_usa);

	}

}
