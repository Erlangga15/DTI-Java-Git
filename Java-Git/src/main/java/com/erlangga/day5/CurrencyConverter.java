package com.erlangga.day5;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CurrencyConverter {
    private static final Map<String, Double> EXCHANGE_RATES = new HashMap<>();
    private final Scanner scanner;

    static {
        EXCHANGE_RATES.put("USD_EUR", 0.91);
        EXCHANGE_RATES.put("USD_GBP", 0.79);
				EXCHANGE_RATES.put("USD_JPY", 110.00);
				EXCHANGE_RATES.put("EUR_USD", 1.10);
				EXCHANGE_RATES.put("EUR_GBP", 0.88);
				EXCHANGE_RATES.put("EUR_JPY", 122.00);
				EXCHANGE_RATES.put("GBP_USD", 1.30);
				EXCHANGE_RATES.put("GBP_EUR", 1.14);
				EXCHANGE_RATES.put("GBP_JPY", 135.00);
				EXCHANGE_RATES.put("JPY_USD", 0.0091);
				EXCHANGE_RATES.put("JPY_EUR", 0.0082);
				EXCHANGE_RATES.put("JPY_GBP", 0.0074);
    }

    public CurrencyConverter() {
        this.scanner = new Scanner(System.in);
    }

    public void convertCurrency() {
        System.out.println("Currency Converter");
        double amount = getAmount();
        String sourceCurrency = getCurrency("Source");
        String targetCurrency = getCurrency("Target");

        if (!isValidCurrency(sourceCurrency) || !isValidCurrency(targetCurrency)) {
            System.out.println("Invalid currency code.");
            return;
        }

        double convertedAmount = convert(amount, sourceCurrency, targetCurrency);
        System.out.printf("Converted amount: %.2f %s%n", convertedAmount, targetCurrency);
				System.out.println("=========================");
    }

    private double getAmount() {
        System.out.println("Enter the amount:");
        return scanner.nextDouble();
    }

    private String getCurrency(String direction) {
        System.out.println("Enter the currency code " + direction + " (USD, EUR, GBP, JPY):");
        return scanner.next().toUpperCase();
    }

    private boolean isValidCurrency(String currency) {
        return EXCHANGE_RATES.keySet().stream()
            .anyMatch(key -> key.startsWith(currency + "_") || key.endsWith("_" + currency));
    }

    private double convert(double amount, String from, String to) {
        String key = from + "_" + to;
        Double rate = EXCHANGE_RATES.get(key);
        if (rate == null) {
            key = to + "_" + from;
            rate = EXCHANGE_RATES.get(key);
            if (rate == null) {
                throw new IllegalArgumentException("Invalid currency pair: " + from + " to " + to);
            }
            return amount / rate;
        }
        return amount * rate;
    }
}
