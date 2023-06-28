package moduleThreeAssignment;

import java.util.Scanner;

public class createAccountObject {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(" What type of account do you want to open? ");

		String accountType = sc.next();
		System.out.println(" Open "+ accountType + " account");

		if (accountType == "SB") {
			System.out.println(" open SB account....");
			AbstractBankAccount a = new SBAccount();
		} else {
			System.out.println(" open current account....");
			AbstractBankAccount b = new CurrentAccount();
		}

	}

}
