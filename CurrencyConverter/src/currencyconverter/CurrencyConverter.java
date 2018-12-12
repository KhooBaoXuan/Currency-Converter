package currencyconverter;

import componentmodel.ComponentInterface;
import currencyconverter.ifce.CurrencyConverterIfce;

public class CurrencyConverter implements CurrencyConverterIfce, ComponentInterface {

	public double convertCurrency(Double amount, String currency) {
		
		Double rate;
		
		switch (currency) {
		case "USD":
			rate = 0.24;
			break;
			
		case "CND":
			rate = 0.32;
			break;
			
		case "JPN":
			rate = 27.19;
			break;
			
		case "SGD":
			rate = 0.33;
			break;
			
		case "THB":
			rate = 7.85;
			break;
			
		case "MYRU":
			rate = 1/0.24;
			break;
			
		case "MYRC":
			rate = 1/0.32;
			break;
			
		case "MYRJ":
			rate = 1/27.19;
			break;
			
		case "MYRS":
			rate = 1/0.33;
			break;
			
		case "MYRT":
			rate = 1/7.85;
			break;
			
		default:
			rate = 1.00;
			break;
		}
		
		return amount * rate;
	}
	
	
}