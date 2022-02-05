package hw8Q3Abstraction;

public abstract class MedicalSchool {
	// Abstract name.
	public abstract void anatomyLab();

	// non-abstract name.
	public void biochemistryLab() {
		System.out.println(" Every BiochemistryLab should have major equipments to perform an experiment");
	}
}

// We can not create a constructor inside an abstract class.
//Since it can not create an object and can not be implemented, there is no need of having constructor in it.
