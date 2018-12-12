package currencyconverter.app;

import java.util.Scanner;

import currencyconverter.ifce.CurrencyConverterIfce;
import componentmodel.ComponentRegistry;

public class CurrencyConverterApp {

	private static CurrencyConverterIfce currencyConverter;
	private static Scanner scanner;
	
	public static void main(String [] args) {
		currencyConverter = (CurrencyConverterIfce) ComponentRegistry.fetchComponent(CurrencyConverterIfce.class);
		System.out.println("Welcome to Currency Converter!");
		getAmount();
	
	}
	
	public static void getAmount() {
		scanner = new Scanner(System.in);
		System.out.println("Enter currency you wish to convert:"
				+ "\n 1. MYR to USA"
				+ "\n 2. MYR to CND"
				+ "\n 3. MYR to JPN"
				+ "\n 4. MYR to SGD"
				+ "\n 5. MYR to THB"
				+ "\n 6. USA to MYR"
				+ "\n 7. CND to MYR"
				+ "\n 8. JPN to MYR"
				+ "\n 9. SGD to MYR"
				+ "\n 10. THB to MYR");
		int choice = scanner.nextInt();
		double amount, newCurrency;	
		String currency = "";
		
		switch(choice) {
		case 1:
			System.out.println("Enter amount you wish to convert:");
			amount = scanner.nextInt();
			currency = "USD";
			newCurrency = currencyConverter.convertCurrency(amount, currency);
			System.out.println("RM" + amount + " get you " + currency + newCurrency);
			choose();
			break;
			
		case 2:
			System.out.println("Enter amount you wish to convert:");
			amount = scanner.nextInt();
			currency = "CND";
			newCurrency = currencyConverter.convertCurrency(amount, currency);
			System.out.println("RM" + amount + " get you " + currency + newCurrency);
			choose();
			break;
			
			
		case 3:
			System.out.println("Enter amount you wish to convert:");
			amount = scanner.nextInt();
			currency = "JPN";
			newCurrency = currencyConverter.convertCurrency(amount, currency);
			System.out.println("RM" + amount + " get you " + currency + newCurrency);
			choose();
			break;
			
		case 4:
			System.out.println("Enter amount you wish to convert:");
			amount = scanner.nextInt();
			currency = "SGD";
			newCurrency = currencyConverter.convertCurrency(amount, currency);
			System.out.println("RM" + amount + " get you " + currency + newCurrency);
			choose();
			break;
			
		case 5: 
			System.out.println("Enter amount you wish to convert:");
			amount = scanner.nextInt();
			currency = "THB";
			newCurrency = currencyConverter.convertCurrency(amount, currency);
			System.out.println("RM" + amount + " get you " + currency + newCurrency);
			choose();
			break;
			
		case 6: 
			System.out.println("Enter amount you wish to convert:");
			amount = scanner.nextInt();
			currency = "MYRU";
			newCurrency = currencyConverter.convertCurrency(amount, currency);
			System.out.println("USA" + amount + " get you RM"+ newCurrency);
			choose();
			break;
			
		case 7: 
			System.out.println("Enter amount you wish to convert:");
			amount = scanner.nextInt();
			currency = "MYRC";
			newCurrency = currencyConverter.convertCurrency(amount, currency);
			System.out.println("CND" + amount + " get you RM" + newCurrency);
			choose();
			break;
			
		case 8: 
			System.out.println("Enter amount you wish to convert:");
			amount = scanner.nextInt();
			currency = "MYRJ";
			newCurrency = currencyConverter.convertCurrency(amount, currency);
			System.out.println("JPN" + amount + " get you RM" + newCurrency);
			choose();
			break;
			
		case 9: 
			System.out.println("Enter amount you wish to convert:");
			amount = scanner.nextInt();
			currency = "MYRS";
			newCurrency = currencyConverter.convertCurrency(amount, currency);
			System.out.println("SGD" + amount + " get you RM"+ newCurrency);
			choose();
			break;
			
		case 10: 
			System.out.println("Enter amount you wish to convert:");
			amount = scanner.nextInt();
			currency = "MYRT";
			newCurrency = currencyConverter.convertCurrency(amount, currency);
			System.out.println("THB" + amount + " get you RM" + newCurrency);
			choose();
			break;
			
			default: 
				System.out.println("You enter the wrong input. Invalid currency. Please try again");
				getAmount();
				break;
		}
		
		
	}
	
	public static void choose() {
		scanner = new Scanner(System.in);
		System.out.println("Enter your option:"
				+ "\n 1. Convert other currency"
				+ "\n 2. Exit");
		int choose = scanner.nextInt();
		
		switch(choose) {
		case 1: 
			getAmount();
			break;
			
		case 2:
			System.out.println("Exit");
			break;
			
		default:
			System.out.println("You enter the wrong input. Try again!");
			choose();
			break;
		}
	}
}
