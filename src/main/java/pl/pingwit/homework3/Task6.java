package pl.pingwit.homework3;

public class Task6 {
    //Напишите программу вывода всех четных чисел от 2 до 100 включительно
    public static void main(String[] args) {
        int result = 0;
        for (int i = 2; i <= 100; i = i + 2) {
            result = result + 2;
            System.out.println(result);
        }
    }
}
