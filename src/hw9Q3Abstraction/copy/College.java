package hw9Q3Abstraction.copy;

public interface College {
	public void commonRoom();

	public void laboratory();

	public void languageClub();

	public default void dorm() { // default method
		System.out.println(" Many students are living in the dorm");
	}

	public static void studyRoom() { // static method
		System.out.println(" StudyRoom is a major components of library");
	}
}

/*
 * -->Two keywords--> 1. Extends and 2. Implements -->An Interface can inherit
 * more than one interface but it cannot inherit a regular class or abstract
 * class. -->There are 5 types of inheritance--> 1. Single Inheritance. 2.
 * multiple Inheritance(not allowed in java). 3. Multi-level Inheritance. 4.
 * Hierarchical Inheritance. 5. Hybrid Inheritance( Not allowed in java)
 */

/*
 * --> Two keywords--> 1. Abstract Keywords. 2. Non-abstract keywords. -->An
 * abstract class can inherit other abstract class or a regular class but it
 * cannot inherit an Interface.
 */

/*
 * --> A regular class can inherit one regular class or abstract class. It
 * cannot inherit an interface. --> There is 1 inheritance possible by a regular
 * class.
 */