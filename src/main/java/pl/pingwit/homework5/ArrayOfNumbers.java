package pl.pingwit.homework5;

public class ArrayOfNumbers {
    /*Есть массив чисел.
    Найти среднее арифметическое число элементов массива*/
    public static void main(String[] args) {
        int[] myIntArray = new int[5];
        int sum = 0;
        myIntArray[0] = 150;
        myIntArray[1] = 130;
        myIntArray[2] = 10;
        myIntArray[3] = 56;
        myIntArray[4] = 37;
        for (int j : myIntArray) {
            sum = sum + j;
        }
        int average = sum / myIntArray.length;
        System.out.println("Arithmetic mean number of array elements " + average);
    }
}