package pl.pingwit.homework5;

import java.util.Arrays;

public class OddArrayElement {
    // Есть массив чисел. Заменить каждый нечетный элемент массива на 0.
    public static void main(String[] args) {
        int[] mas = {4, 1, 3, 2, 11, 22, 47};
        for (int i = 0; i < mas.length; i++) {
            {
                if (mas[i] % 2 != 0) {
                    mas[i] = 0;
                }
            }
        }
        System.out.println(Arrays.toString(mas));

    }
}
