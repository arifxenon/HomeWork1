package hw5Q2Constructor;

public class Computer {

	public String brandName, model, operatingSystem;
	public int price;
	public boolean madeInUSA;
	public char grade;

	public Computer() {
		System.out.println("this is from default constructor of Computer class");
	}

	public Computer(String brandName, String model, String operatingSystem, int price, boolean madeInUSA, char grade) {
		this.brandName = brandName;
		this.model = model;
		this.operatingSystem = operatingSystem;
		this.price = price;
		this.madeInUSA = madeInUSA;
		this.grade = grade;

		System.out.println("My Brand:" + brandName + ",Model:" + model + ",OperatingSystem:" + operatingSystem
				+ ",Price:" + price + ",Grade:" + grade + ",Made in USA? Ans:" + madeInUSA);

	}

}
