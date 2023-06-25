package AssignmentsOnLoops;

// Write a program to reverse the digits of a number
public class ReverseTheDigitsOfANumber {

	public static void main(String[] args) {
		int num = 567;
		String s = "";
		
		while (num > 0 ) {
			s = s + Integer.toString(num % 10);
			num = num / 10;
			
		}
		System.out.println("reversed number>> "+s);
	}

}
