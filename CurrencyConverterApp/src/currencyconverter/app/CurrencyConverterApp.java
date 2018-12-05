package currencyconverter.app;

import java.util.Scanner;

import currencyconverter.ifce.CurrencyConverterIfce;
import componentmodel.ComponentRegistry;

public class CurrencyConverterApp {

	private static CurrencyConverterIfce currencyConverter;
	private static Scanner scanner;
	
	public static void main(String [] args) {
		currencyConverter = (CurrencyConverterIfce) ComponentRegistry.fetchComponent(CurrencyConverterIfce.class);
		
		scanner = new Scanner(System.in);
		
		System.out.println("What is the amount of money you wish to convert? ");
		double amount = scanner.nextInt();
		
		System.out.println("What currency you wish to convert to?"
				+ "\n 1. USA"
				+ "\n 2. CND"
				+ "\n 3. JPN"
				+ "\n 4. SGD"
				+ "\n 5. THB");
		int choice = scanner.nextInt();
		
		String currency = "";
		
		switch(choice) {
		case 1:
			currency = "USD";
			break;
			
		case 2:
			currency = "CND";
			break;
			
		case 3:
			currency = "JPN";
			break;
			
		case 4:
			currency = "SGD";
			break;
			
		case 5: 
			currency = "THB";
			break;
			
			default: 
				System.out.println("Invalid currency");
				break;
		}
		
		double newCurrency = currencyConverter.convertCurrency(amount, currency);
		
		System.out.println("RM" + amount + " get you " + currency + newCurrency);
		
	}
}
