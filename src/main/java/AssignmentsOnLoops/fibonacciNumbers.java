package AssignmentsOnLoops;


// Write a program to generate 10 Fibonacci numbers
public class fibonacciNumbers {

	public static void main(String[] args) {
		fib(6);
	}
	
	public static int fib(int n) {
		int initialNum = 0;
		int firstNum = 1;
		int sum = 0;
		
		for (int i = 1; i <= n; i++) { // 0 1 1 2 3 5 8 13
			System.out.println( "initialNum: "+initialNum);
			System.out.println( "firstNum: "+firstNum);
			sum = initialNum + firstNum;   
			System.out.println( "SUM: "+sum);
			initialNum = firstNum;
			firstNum = sum;
			
		}
		
		
		return sum;
	}
}
