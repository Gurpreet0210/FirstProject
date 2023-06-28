package moduleThree;

import java.util.Scanner;

public class UseScanner {

	public static void main(String[] args) {
		System.out.println(" Tell me your favorite car....");
		Scanner sc = new Scanner(System.in);
		
		String car = sc.next();
		String secondCar  = sc.next();
		System.out.println(" You said... "+ car);

	}

}
