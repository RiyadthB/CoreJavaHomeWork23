package hw5Q2Constructor;

public class ComputerTest {

	public static void main(String[] args) {
// Default constructor intialized -->> below
		Computer compInfo = new Computer();

// Parameterized constructor initialized -->> below
		Computer compInfo1 = new Computer("Microsoft", "Surface5", "Windows11", 1550, 'A', true);

		System.out.println("\n\t----------------------------\n");

		Computer compInfo2 = new Computer("Apple", "Macbook air", "MacOS", 800.0, 'A', false);

	}
}
