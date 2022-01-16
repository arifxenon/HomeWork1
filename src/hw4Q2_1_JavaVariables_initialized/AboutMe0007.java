package hw4Q2_1_JavaVariables_initialized;

public class AboutMe0007 {
	
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
	
	
	public AboutMe0007() {
		System.out.println("This is all about me");
	}
	
	public void aboutMe() {
		System.out.println("My name: "+name+ "\nMy Age:"+age+"\nMy Roll Num:"+myRollNum+"\nMy Registration Num:"+myRegistrationNum+"\nMy center code:"+myCenterCode+"\nOut of gpa:"+gpaScale+"\nMy gpa is:"+myGpa+"\nMy grade is:"+myGrade+"\nDid the result out? Ans:"+results);
	}

	public static void main(String[] args) {
		AboutMe0007 me= new AboutMe0007();
		me.aboutMe();
		
		

	}

}

