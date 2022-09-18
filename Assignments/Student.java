package week3.day1.Assignments;

public class Student extends Department {

	public void studentName() {
		System.out.println("The Student Name is " + " " + "R.Logeshwari" );
		
	}
	public void studentDepartment() {
		System.out.println("studied in the department of  "+ " " + "CSE" );
			}
	
	public void studentId() {
		System.out.println("The Student Id no is " + " " + "14CS031");
	}

	public static void main(String[] args) {

		Student details = new Student();
		details.studentName();
		details.studentDepartment();
		details.studentId();
		details.deptName();
		details.collegeCode();
		details.collegeName();
		details.collegeRank();
	}

}

