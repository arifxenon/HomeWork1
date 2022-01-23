package hw5Q2Constructor;

public class ComputerTest {
	public static void main(String[] args) {
		Computer computer01 = new Computer();
		Computer computer02 = new Computer("Apple", "MacbookAir", "MacOSMojave", 800, false, 'A');
		Computer computer03 = new Computer("Asus", "Nitro5", "Windows11", 1200, false, 'A');
	}
}