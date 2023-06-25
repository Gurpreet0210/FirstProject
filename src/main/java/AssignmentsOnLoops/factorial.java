package AssignmentsOnLoops;

//Write a program to find factorial ofa number 
public class factorial {

	public static void main(String[] args) {
		System.out.println(fact (6));

	}
	
	private static int fact(int n) {
		if(n==1) {
			return 1;
		}else {
			return n * fact(n-1);
		}

	}

}
