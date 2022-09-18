package week3.day1.Assignments;

public class College {
	public void collegeName() {
		System.out.println("The College Name is" + " " + "SETHU INSTITTE OF TECHNOLOGY");
		
	}
	
	public void collegeCode() {
		System.out.println("The College code is" + " " + "9217");
	}
	
	public void collegeRank() {
		System.out.println("The College Rank is" + " " + "118");
	}
	public static void main(String[] args) {

		College details = new College();
		details.collegeCode();
		details.collegeName();
		details.collegeRank();
		

	}

}
