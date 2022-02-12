package hw9Q3Abstraction.copy;

public interface Hospital {
	public void emergencyRoom();

	public void surgeryRoom();

	public void cafeteria();

	public default void morgue() { // Default method.
		System.out.println(" Morgue form hospital ");
	}

	public static void pharmacy() { // Static method.
		System.out.println(" pharmacy form hospital");
	}
}
