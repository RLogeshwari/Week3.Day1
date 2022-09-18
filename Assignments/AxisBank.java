package week3.day1.Assignments;

public class AxisBank extends BankInfo {
	public void saving(float interest) {
		System.out.println("The interest percentage for Savings Account is " + interest);
	}
	
	public void fixed(float interest) {
		System.out.println("The interest percentage for Fixed Deposit is " + interest);

	}
	
	public void deposit(int amount) {
		System.out.println("The maximum value of deposit Amount is " + amount);
	}

public static void main(String[] args) {
	AxisBank details = new AxisBank();
	details.saving(12.50f);
	details.fixed(4.6f);
	details.deposit(96000);
}

}

