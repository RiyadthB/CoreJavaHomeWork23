package hw4JavaVariables;

public class AboutMe2 {
// Variables declared -->>
	public String name;
// This is 8 type of variables declared -->>
	public byte age;
	public short myRent;
	public int mySalary;
	public long myBankBalance;
	public float myHeight;
	public double myWeight;
	public char sex;
	public boolean usCitizen;

// Constructor declared below -->>
	public AboutMe2() {

		System.out.println("This is all about us");

	}

// Method implemented below -->>
	public void aboutMe() {

		System.out.println("\nMy nsme is :- " + name + "\nMy age is :-" + age + "\nMy salary is :-" + mySalary
				+ "\nMy bank blance is :-" + myBankBalance + "\nMy height is :-" + myHeight + "\nMy weight is :-"
				+ myWeight + "\nMy gender is :-" + sex + "\nI'm a US citizen :-" + usCitizen);
	}

}
