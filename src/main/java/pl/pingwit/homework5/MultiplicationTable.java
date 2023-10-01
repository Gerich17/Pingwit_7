package pl.pingwit.homework5;

import java.util.Arrays;

public class MultiplicationTable {
    //При помощи двумерного массива вывести на экран таблицу умножения
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 10;
        int[][] array = new int[num1][num2];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = (i + 1) * (j + 1);
            }
            System.out.println(Arrays.toString(array[i]));
        }

    }
}
