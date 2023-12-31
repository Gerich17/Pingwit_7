package pl.pingwit.homework5;

import java.util.Arrays;
import java.util.Scanner;

public class SumMaxMinArray {
    /*Создать массив из 3 элементов. При помощи класса сканер и пользователя заполнить его.
    Вывести сумму, наименьшее и наибольшее из чисел на экран*/

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] myArray;
        myArray = new int[3];
        for (int i = 0; i < myArray.length; i++) {
            System.out.println("Enter " + (i + 1) + " array elements: ");
            myArray[i] = scanner.nextInt();
        }
        int max = myArray[0];
        int min = myArray[0];
        int sum = 0;
        for (int number : myArray) {
            sum += number;
        }
        for (int number1 : myArray) {
            if (number1 < min)
                min = number1;
        }
        for (int number2 : myArray) {
            if (number2 > max)
                max = number2;
        }
        System.out.print("inserted array elements: ");
        System.out.println(Arrays.toString(myArray));
        System.out.println("Sum of elements: " + sum);
        System.out.println("min element mas = " + min);
        System.out.println("max element mas = " + max);
    }
}
