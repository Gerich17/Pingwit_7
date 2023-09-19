package pl.pingwit.homework3;

public class Task8 {
    /* Даны числа от 0 до 100.
             - Посчитать сумму четных и вывести на экран
             - Посчитать сумму нечетных и вывести на экран
             - Найти общую сумму всех чисел*/
    public static void main(String[] args) {
        int first = 0;
        int last = 100;
        int evenSum = 0;
        int oddSum = 0;
        for (int i = first; i <= last; i++) {
            if (i % 2 == 0) {
                evenSum += i;
            }
            if (i % 2 == 1) {
                oddSum += i;
            }
        }
        System.out.println("Even sum : " + evenSum);
        System.out.println("Odd sum : " + oddSum);
        System.out.println("Total sum : " + (evenSum + oddSum));
    }
}


