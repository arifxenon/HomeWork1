package hw4Q2_2_JavaVariables_declared;

public class AboutMe00007 {
	// Here variable is declared.
	public String name;
	public byte age;
	public short myRollNum;
	public int myRegistrationNum;
	public long myCenterCode;
	public float gpaScale;
	public double myGpa;
	public char myGrade;
	public boolean results;

	// Constructor declared.
	public AboutMe00007() {
		System.out.println("This is all about me");
	}

	// method implemented.
	public void aboutMe() {
		System.out.println("My name: " + name + "\nMy Age: " + age + "\nMy Roll Num: " + myRollNum
				+ "\nMy Registration Num: " + myRegistrationNum + "\nMy center code: " + myCenterCode + "\nOut of gpa: "
				+ gpaScale + "\nMy gpa is: " + myGpa + "\nMy grade is: " + myGrade + "\nresults came? Ans: " + results);
	}
}
