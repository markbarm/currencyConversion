package util;

public class CurrencyConversion {
	public static final double IOF= 0.06;
	public static double payment(double quantity, double dollarPrice) {
		return quantity * dollarPrice * (1+IOF);
	}
}
