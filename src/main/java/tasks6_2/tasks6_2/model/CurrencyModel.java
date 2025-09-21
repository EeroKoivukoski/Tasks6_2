package tasks6_2.tasks6_2.model;

import java.util.ArrayList;
import java.util.List;

public class CurrencyModel {
    private final List<Currency> currencies;

    public CurrencyModel() {
        currencies = new ArrayList<>();
        currencies.add(new Currency("USD", "US Dollar", 1.0));
        currencies.add(new Currency("EUR", "Euro", 0.92));
        currencies.add(new Currency("GBP", "British Pound", 0.78));
        currencies.add(new Currency("JPY", "Japanese Yen", 148.0));
    }

    public List<Currency> getCurrencies() {
        return currencies;
    }

    public double convert(double amount, Currency from, Currency to) {
        double inUSD = amount / from.getToUSD();
        return inUSD * to.getToUSD();
    }
}
