package application;

import java.util.Locale;
import java.util.Scanner;

import util.CurrencyConversion;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.print("Whats is the dollar price? ");
		double dollarPrice = sc.nextDouble();
		System.out.print("How many dollar will be bought? ");
		double quantity = sc.nextDouble();
		
		System.out.printf("Amount to paid in reais %.2f%n", CurrencyConversion.payment(quantity, dollarPrice));
		
		sc.close();
		
	}

}
