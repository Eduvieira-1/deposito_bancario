package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Account act;

		System.out.print("Enter account number: ");
		int num = sc.nextInt();

		System.out.print("Enter account holder: ");
		String name = sc.next();

		System.out.print("Is there initial an deposit (y/n)? ");
		char response = sc.next().charAt(0);

		if (response == 'y') {
			System.out.print("Enter initial deposit value: ");
			double initialDeposit = sc.nextDouble();
			act = new Account(num, name, initialDeposit);
		} else {
			act = new Account(num, name);
		}

		System.out.println();
		System.out.println("Account data: " + act);

		System.out.println();
		System.out.print("Enter deposit value: ");
		double depositValue = sc.nextDouble();
		act.addDeposit(depositValue);

		System.out.println();
		System.out.println("Updated account data: " + act);

		System.out.println();
		System.out.print("Enter withdraw value: ");
		depositValue = sc.nextDouble();
		act.removeDeposit(depositValue);

		System.out.println();
		System.out.println("Updated account data: " + act);

		sc.close();

	}

}
