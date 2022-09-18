package week3.day1.Assignments;

public class Student1 {
	public void getStudentInfo(int id) {
		System.out.println(" ID is " + id);
		
	}
	
	public void getStudentInfo(int id,String name){
		
		System.out.println(" ID is "+ id);
		System.out.println("Student Name is " + name);
	}
	
	public void getStudentInfo(String emailid,long phonenumber) {
		System.out.println("The student Email ID is" + " " +  emailid);
		System.out.println("The student PhoneNumber is"  + " " + phonenumber);
	}

	public static void main(String[] args) {

	 Student1 details = new Student1();
	 details.getStudentInfo(14);
	 details.getStudentInfo(14, "Logeshwari");
	 details.getStudentInfo("Logeshwari261997@gmail.com", 9597352357L);
	}

}

