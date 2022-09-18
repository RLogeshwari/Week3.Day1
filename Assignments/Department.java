package week3.day1.Assignments;

	public class Department extends College {
		public void deptName() {
			System.out.println("The Department name is "+ " "+ "CSE");
		}

		public static void main(String[] args) {
			
			Department name = new Department();
			name.deptName();
			name.collegeCode();
			name.collegeName();
			name.collegeRank();
			
		}

	}

	