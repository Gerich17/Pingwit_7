package pl.pingwit.homework6;

import java.util.Arrays;

public class BubbleSort {
    /*Есть целочисленный неотсортированный массив. Отсортируйте его "пузырьком".
    Попробуйте сами написать и затем посмотрите реализацию*/

    public static void main(String[] args) {
        int[] unsorted = {100, 50, 70, -10, 20, -30,};
        int[] sorted = bubbleSort(unsorted);
        System.out.println(Arrays.toString(sorted));
    }
    private static int[] bubbleSort(int[] array) {
        int operationCounter = 0;
        int size = array.length;
        int lastElementIndex = size - 1;
        for (int i = 0; i < lastElementIndex; i++) {
            for (int j = 0; j < lastElementIndex; j++) {
                if (array[i] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
                operationCounter++;
            }
            operationCounter++;
        }
        System.out.println("sort took " + operationCounter);
        return array;
    }
}

