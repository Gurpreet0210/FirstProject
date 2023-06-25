package AssignmentsOnLoops;

// Write a program to add the digits of a number
public class AddDigitsOfANumber {

	public static void main(String[] args) {
		int num = 36511;
		int sum = 0;
		
		sum = addDigits(num);
	}
	
	private static int addDigits(int num) {
		int sum = 0;
		while(num > 0) {
			sum = sum + (num % 10);
			System.out.println(sum);
			num = num /10;
			System.out.println(num);
		}
		System.out.println(" FINAL: "+sum);
		return sum;

	}

}
