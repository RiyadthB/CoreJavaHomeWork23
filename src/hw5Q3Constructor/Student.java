package hw5Q3Constructor;

public class Student {
// Default constructor declared -->> below 
	public String studentName;
	public int studentId;
	public char sex;
	public float grade;
	public boolean isProgrammer;

//	Default constructor declared -->> below 
	public Student() {
		System.out.println("This is from default constructor of the student of the class");

	}

// Parameterized constructor declared
	public Student(String studentName, int studentId, char sex, float grade, boolean isProgrammer) {
		this.studentName = studentName;
		this.studentId = studentId;
		this.sex = sex;
		this.grade = grade;
		this.isProgrammer = isProgrammer;
		System.out.println("Name :- " + studentName + "\nStudent ID :- " + studentName + "\nStudent gender :-" + sex
				+ "\nStudent grade :-" + grade + "\nStudent is :-" + isProgrammer);
	}
}
