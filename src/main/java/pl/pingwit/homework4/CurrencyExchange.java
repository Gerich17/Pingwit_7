package pl.pingwit.homework4;

import java.math.BigDecimal;
import java.util.Objects;
import java.util.Scanner;

public class CurrencyExchange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the required currency : ");
        String currency = scanner.next();
        System.out.println("Enter amount");
        BigDecimal amount = new BigDecimal(scanner.next());

        BigDecimal toEuroRate = new BigDecimal("40");
        if (Objects.equals(currency, "eur")) {
            BigDecimal result = amount.multiply(toEuroRate);
            System.out.println("Pay " + result + " uah ");
        } else if (Objects.equals(currency, "uah")) {
            BigDecimal result = amount.divide(toEuroRate);
            System.out.println("Pay " + result + " eur ");
        }
    }
}
