package hw4Q2_2_JavaVariables_declared;

public class AboutMe00007Test {
	public static void main(String[] args) {
		// AboutMe0007 class is instantiated, always inside main method, not in other
		// method
		AboutMe00007 me = new AboutMe00007(); // Constructor is initialized, when an object is created
		me.name = "Arif"; // variables initialized from this line.
		me.age = 27;
		me.myRollNum = 32678;
		me.myRegistrationNum = 324567897;
		me.myCenterCode = 00000000000000000102l;
		me.gpaScale = 5.00f;
		me.myGpa = 4.751234567891234d;
		me.myGrade = 'A';
		me.results = true;
		me.aboutMe(); // method initialized.

		System.out.println("\n**************************************************\n");
		// variable initialized
		AboutMe00007 me2 = new AboutMe00007();
		me2.name = "Alex";
		me2.age = 27;
		me2.myRollNum = 32766;
		me2.myRegistrationNum = 456789123;
		me2.myCenterCode = 00000000000000000107l;
		me2.gpaScale = 5.00f;
		me2.myGpa = 3.456789012349876d;
		me2.myGrade = 'C';
		me2.results = true;
		me2.aboutMe(); // method initialized.
	}
}
