package util;

public class CurrencyConverter {
    public static final double IOF = 6;

    public static double converter(double dollarPrice, double dollarQuantity) {
        return (dollarQuantity + dollarQuantity * IOF / 100) * dollarPrice;
    }
}
