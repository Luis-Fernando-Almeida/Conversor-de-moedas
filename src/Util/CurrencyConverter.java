package Util;

public class CurrencyConverter {

    public static final double IOF = 0.06;
    public static double converter(double dollarPrice, double quantityDollars){
        return dollarPrice * quantityDollars * (1.0 + IOF);
    }
}
