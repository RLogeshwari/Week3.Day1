package week3.day1.Assignments;

public class Desktop extends Computer {
	public void destopSize() {
		System.out.println("The size of Desktop is " + " " + "30 Inch");
	}

	public static void main(String[] args) {
		Desktop size = new Desktop();
		size.destopSize();
		Desktop model = new Desktop();
		model.computerModel();
	}

}

