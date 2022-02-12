package hw9Q3Abstraction.copy;

public interface University {
	public void classSize();

	public void playGround();

	public void teacher();

	public default void gymnasium() { // Default method.
		System.out.println(" Gymnasium form University ");
	}

	public static void library() { // Static method.
		System.out.println(" Library from University");
	}
}

// Interface does not have constructor because the values of interfaces are constant.
// There is no body for calling method in an interface.
// There is no need of creating an object for an interface and having a constructor in it.
// Interface cannot create object.