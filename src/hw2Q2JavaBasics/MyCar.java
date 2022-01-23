package hw2Q2JavaBasics;

public class MyCar {

	public static void main(String[] args) {
		System.out.println("My name is Md Ariful Islam, I love to drive, My car info is below: ");
		// the bellow is String concatenation.
		System.out.println("My name is Md Ariful Islam, " + "I love to drive, " + "My car info is below: ");
		// println (to print line by line)
		System.out.println("The color of my car is black.");
		System.out.println("The model of my car is subaru outback.");
		System.out.println("The year of my car is 2018.");
		System.out.println("The wheel of my car is AWD.");
		// the below is print (not println),( to print without line by line)
		System.out.print("The color of my car is black.");
		System.out.print("The model of my car is subaru outback.");
		System.out.print("The year of my car is 2018.");
		System.out.print("The wheel of my car is AWD.");
		// the below is \n\t (to print new line and tab; to make paragraph style)
		System.out.println(
				"\n\tMy name is Md Ariful Islam. I love to drive.My car info is below: It is a black subaru. The model of My car is 2018 outback,It has a premium 2.5i turbo boxer engine. It has a symmetrical AWD wheel. \n\tThe car was a black line crossing centrally from the front bumper to the rear bumper. It had alloy rims and was squeaky clean. The rear seat was folded to create larger storage space. It looked new (or rather, well maintained). The interior was customized with leather seats and a CD player. \n\tIn addition, a tree-shaped air freshener was visible as it hung on the interior rearview mirror.The number plate was standard, and there was a sticker on the rear left with the message “my drive to achieve”. Similarly, the car had a large Subaru sticker on the windscreen. Generally, the car looked simple but elegant.");
	}
}