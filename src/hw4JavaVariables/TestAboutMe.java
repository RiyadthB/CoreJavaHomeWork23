package hw4JavaVariables;

public class TestAboutMe {

	public static void main(String[] args) {

//		Constructor is initialized below -->>
		AboutMe2 myinfo = new AboutMe2();
//     Variables initialized below-->>
		myinfo.name = "Riyadth B";
		myinfo.age = 103;
		myinfo.myRent = 2003;
		myinfo.mySalary = 10011001;
		myinfo.myBankBalance = 1001100212l;
		myinfo.myHeight = 5.770f;
		myinfo.myWeight = 7.200300300;
		myinfo.sex = 'M';
		myinfo.usCitizen = true;
//		Methood initialized below -->>
		myinfo.aboutMe();

		System.out.println("\n-------------------------------\n");

//		Constructor initialized below -->>
		AboutMe2 alex = new AboutMe2();
//		Variables initialized below -->>
		alex.name = "Alex K";
		alex.age = 100;
		alex.myRent = 3003;
		alex.mySalary = 20022002;
		alex.myBankBalance = 2002200212l;
		alex.myHeight = 6.770f;
		alex.myWeight = 8.200200200;
		alex.sex = 'F';
		alex.usCitizen = false;
//		Methood initialized below -->>
		alex.aboutMe();

	}
}
