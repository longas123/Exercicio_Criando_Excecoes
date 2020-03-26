package Application;

import java.util.Locale;
import java.util.Scanner;

import Entities.Account;
import model.Exception.DomainExceptions;

public class Program {

	public static void main(String[] args)  {
		try (Scanner sc = new Scanner(System.in)) {
			Locale.setDefault(Locale.US);
			
		
			System.out.println("Enter account data");
			System.out.print("Number: ");
			int number = sc.nextInt();
			System.out.print("Holder: ");
			sc.nextLine();
			String holder = sc.nextLine();
			System.out.print("Initial balance: ");
			double  balance = sc.nextDouble();
			System.out.print("Withdraw limit: ");
			double withdrawLimit = sc.nextDouble();
			
			
			Account acount = new Account(number, holder, balance, withdrawLimit);
			
			System.out.print("Enter amount for withdraw: ");
			double amount  = sc.nextDouble();
			
			try {
				acount.withDraw(amount);
				System.out.println(acount);
			}
			catch (DomainExceptions e) {
				System.out.println("Withdraw error: " + e.getMessage());
			}
		}

	}

}
