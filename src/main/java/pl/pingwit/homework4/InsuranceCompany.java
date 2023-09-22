package pl.pingwit.homework4;

import java.math.BigDecimal;
import java.util.Scanner;

/* Написать программу для расчета стоимости страховки на автомобиль.
    Пользователь вводит объем двигателя в см3, постоянный клиент?
    Были ли дтп?
    Тариф - 0.25 евро за см3,если клиент постоянный - скидка 20% (коэффициент 0.8),
    если были дтп - надбавка 20% (коэфф 1.2)
    Пример:  (1600*0.25*1.2*0.8=384)
    Введите объем двигателя в см3:
    1600
    Были ДТП за прошлый год?
    true
    Страховались у нас?
    true
    Ваш полис стоит 384 евро */
public class InsuranceCompany {

    private static final BigDecimal BASE_RATE = new BigDecimal("0.25");
    private static final BigDecimal OLD_CLIENT_RATE = new BigDecimal("0.8");
    private static final BigDecimal CRASH_RATE = new BigDecimal("1.2");

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("What is the engine size in cm3?");
        int volume = scanner.nextInt(); // nextInt - читает целое число
        System.out.println("Have you been insured with us before? true/false");
        boolean oldClient = scanner.nextBoolean(); // nextBoolean - метод класса сканнер чтобы прочитать Boolean
        System.out.println("Have you ever had an accident? true/false");
        boolean hadCrashRate = scanner.nextBoolean();

        BigDecimal finishPrice = BASE_RATE.multiply(new BigDecimal(volume));
        if (oldClient) {
            finishPrice = finishPrice.multiply(OLD_CLIENT_RATE);
        }
        if (hadCrashRate) {
            finishPrice = finishPrice.multiply(CRASH_RATE);
        }
        System.out.println("Your finish price : " + finishPrice + "eur");
    }
}
