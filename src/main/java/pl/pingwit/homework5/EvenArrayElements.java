package pl.pingwit.homework5;

import java.util.Arrays;

public class EvenArrayElements {
    //Есть массив чисел. Необходимо создать другой массив содержащий только четные элементы из первого
    public static void main(String[] args) {
        int[] arrays = {1, 8, 3, 7, 76, 152, 349};
        int evenNumsCounter = 0;
        for (int i = 0; i < arrays.length; i++) {
            if (arrays[i] % 2 == 0) {
                evenNumsCounter++;
            }
        }
        int[] result = new int[evenNumsCounter];
        int index = 0;
        for (int i = 0; i < arrays.length; i++) {
            if (arrays[i] % 2 == 0) {
                result[index] = arrays[i];
                index++;
            }
        }
        System.out.println(Arrays.toString(result));
    }
}
