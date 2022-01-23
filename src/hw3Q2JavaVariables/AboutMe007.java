package hw3Q2JavaVariables;

public class AboutMe007 {
	public String myIntroduction; // Here variable is declared.
	public String name = "Md Ariful Islam"; // Here variable is initialized.
	public byte age = 27;
	public short myRollNum = 32678;
	public int myRegistrationNum = 324567897;
	public long myCenterCode = 00000000000000000102l; // by using l at the end of long type
	public float gpaScale = 5.00f; // by using f at the end of float type
	public double myGpa = 4.751234567891234;
	public char myGrade = 'A';
	public boolean results = true;

	public static void main(String[] args) {
		AboutMe007 aboutMe = new AboutMe007();
		// AboutMe007 is a class, aboutMe is an object or reference variable
		// always start with lower case.
		// an object is created (aboutMe) from class (AboutMe007) which is new and
		// AboutMe007 type.
		// Since aboutMe(object) is created from AboutMe007 (class), So the class
		// (AboutMe007) is instantiated.
		System.out.println(aboutMe.name);
		System.out.println(aboutMe.age);
		System.out.println(aboutMe.myRollNum);
		System.out.println(aboutMe.myRegistrationNum);
		System.out.println(aboutMe.myCenterCode);
		System.out.println(aboutMe.gpaScale);
		System.out.println(aboutMe.myGpa);
		System.out.println(aboutMe.myGrade);
		System.out.println(aboutMe.results);

		System.out.println(aboutMe.name + aboutMe.age);
		// Using concatenation.
		System.out.println("My Name: " + aboutMe.name + ", My Age: " + aboutMe.age);
	}
}
