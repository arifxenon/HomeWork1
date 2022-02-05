package hw8Q2Inheritance;

public class AnimalTest {
	public static void main(String[] args) {
		Animal animal = new Animal();
		animal.animalInfo();

		System.out.println("\n----------------------------------\n");
// Hierarchical inheritance.
		Mammal mammal = new Mammal();
		mammal.mammalInfo();
		mammal.animalInfo();

		System.out.println("\n----------------------------------\n");
// Hierarchical inheritance.
		Reptile reptile = new Reptile();
		reptile.reptileInfo();
		reptile.animalInfo();

		System.out.println("\n----------------------------------\n");
// Hierarchical inheritance.
		Birds birds = new Birds();
		birds.birdsInfo();
		birds.animalInfo();

		System.out.println("\n----------------------------------\n");
// Single inheritance.
		Dog dog = new Dog();
		dog.dogInfo();
		dog.mammalInfo();
		dog.animalInfo();

		System.out.println("\n----------------------------------\n");
// Single inheritance.
		Snake snake = new Snake();
		snake.snakeInfo();
		snake.reptileInfo();
		snake.animalInfo();

		System.out.println("\n----------------------------------\n");
// Single inheritance
		Robin robin = new Robin();
		robin.robinInfo();
		robin.birdsInfo();
		robin.animalInfo();

		System.out.println("\n----------------------------------\n");
// Multi-level inheritance.
		BullDog bullDog = new BullDog();
		bullDog.bullDogInfo();
		bullDog.dogInfo();
		bullDog.mammalInfo();
		bullDog.animalInfo();

		System.out.println("\n----------------------------------\n");
// Multi-level inheritance.
		Cobra cobra = new Cobra();
		cobra.cobraInfo();
		cobra.snakeInfo();
		cobra.reptileInfo();
		cobra.animalInfo();
	}
}
