package PackagesAndMultiThreading;

public class ArithmeticOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public void subtract() {
		System.out.println(" SUBTRACTING ....");
	}
	
	public void multiply() {
		System.out.println(" MULTIPLYING ....");
	}
	
	public void divide() {
		System.out.println(" DIVIDING ....");
	}

	public int reverse(int num) 
	{
		String s = "";
		
		while (num > 0 ) {
			s = s + (num % 10);
			num = num / 10;
		}
		return Integer.valueOf(s);
	}
	
	
	public int factor (int x)
	{
		int fact = 1;
		for (int i = 1; i <= x; ++ i) {
			
			fact = fact * i;
		}
		return fact;
	}
}
