package hw5Q3Constructor;

public class Student {
	public String stName;
	public int stID;
	public char sex;
	public boolean isProgrammer;
	public float grade;

	public Student() {
		System.out.println("this is from default constructor of Student class");
	}

	public Student(String stName, int stID, char sex, boolean isProgrammer, float grade) {
		this.stName = stName;
		this.stID = stID;
		this.sex = sex;
		this.isProgrammer = isProgrammer;
		this.grade = grade;

		System.out.println("student name:" + stName + ", ID:" + stID + ", Sex:" + sex + ",Grade:" + grade
				+ ",and JavaProgrammer? Ans:" + isProgrammer);
	}
}