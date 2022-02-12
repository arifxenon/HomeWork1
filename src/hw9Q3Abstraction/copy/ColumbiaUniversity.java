package hw9Q3Abstraction.copy;

// method cannot be declared in regular class. only implemented is acceptable.
// abstract form is not acceptable in regular class.
public class ColumbiaUniversity {
	// public abstract void chemistry() // abstract does not have body in regular
	// class method.
	// Yes we create a constructor inside regular class.
	public String chemistry;
	public String biology;
	public String physics;

	// Default constructor.
	public ColumbiaUniversity() {
		System.out.println(" This is from default constructor of ColumbiaUniversity class.");
	}

	// Non-abstract method.
	public void biology() {
		System.out.println("The ColumbiaUniversity has a MSA club.");
	}
}
