package hw3_java_variable;

public class AboutMe1 {

// This is variable declared.
	public String raza;
// This is variable initialized declared.
	public String name = "Riyadth Bhuiyan";
//	primitive data 8 type are below ------>>>
	public byte age = 104;
	public short myRent = 2000;
	public int mySalary = 10081008;
	public long myBankBalance = 1008100818l;
	public float myHeight = 5.700f;
	public double myWeight = 6.200200200;
	public char sex = 'M';
	public boolean usCitizen = true;

	public static void main(String[] args) {
// Constructor is initialized
		AboutMe1 myinfo = new AboutMe1();

		System.out.println("This is al about Myinfo");
		System.out.println("\tMy name is :- " + myinfo.name + "\n\tMy age is :- " + myinfo.age + "\n\tMy house Rent :-"
				+ myinfo.myRent);
		System.out.println("\tMy salary is :- " + myinfo.mySalary + "\n\tMy bank balance is :- " + myinfo.myBankBalance
				+ "\n\tMy height is :-" + myinfo.myHeight);
		System.out.println("\tMy weight is : " + myinfo.myWeight + "\n\tMy gender is : " + myinfo.sex
				+ "\n\tI'm a US citizen :- " + myinfo.usCitizen);

	}

}
