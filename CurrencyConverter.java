import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CurrencyConverter {

    private static Map<String, Double> exchangeRates = new HashMap<>();

    static {
    
        exchangeRates.put("USD", 1.0);     
        exchangeRates.put("EUR", 0.85);     
        exchangeRates.put("INR", 74.85);    
        exchangeRates.put("KRW", 1176.40);  
        exchangeRates.put("JPY", 109.66);  
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.println("Available currencies:");
        for (String currency : exchangeRates.keySet()) {
            System.out.println(currency);
        }

        
        System.out.print("\nEnter the currency to convert from (e.g., USD): ");
        String fromCurrency = scanner.nextLine().toUpperCase();

        System.out.print("Enter the currency to convert to (e.g., EUR): ");
        String toCurrency = scanner.nextLine().toUpperCase();

        System.out.print("Enter the amount to convert: ");
        double amount = scanner.nextDouble();

        double convertedAmount = convertCurrency(fromCurrency, toCurrency, amount);

        System.out.printf("\n%.2f %s is equal to %.2f %s\n", amount, fromCurrency, convertedAmount, toCurrency);

        scanner.close();
    }

    private static double convertCurrency(String fromCurrency, String toCurrency, double amount) {
  
        double amountInUSD = amount / exchangeRates.get(fromCurrency);

        double convertedAmount = amountInUSD * exchangeRates.get(toCurrency);

        return convertedAmount;
    }
}
