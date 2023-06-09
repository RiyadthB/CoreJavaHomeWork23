package hw7UseOfNestedIf;

import java.util.Scanner;

public class DiabeticCondition {
	public static void main(String[] args) {
		System.out.println("Enter my Hemoglobin A1C value below");
		Scanner scanner = new Scanner(System.in);
		double hbA1c = scanner.nextDouble();

		if (hbA1c > 6.4) {
			System.out.println("I'm a diabetic patient");
		} else if (hbA1c <= 6.4) {
			if (hbA1c >= 5.7) {
				System.out.println("I'm a pre-diabetic patient");
			} else if (hbA1c < 5.7) {
				System.out.println("I'm a healthy person");
			}
		}

		scanner.close();
	}
}
