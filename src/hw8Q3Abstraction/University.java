package hw8Q3Abstraction;

public interface University {
	public void classSize();

	public void playGround();

	public void teacher();
}

// Interface does not have constructor because the values of interfaces are constant.
// There is no body for calling method in an interface.
// There is no need of creating an object for an interface and having a constructor in it.
// Interface cannot create object.