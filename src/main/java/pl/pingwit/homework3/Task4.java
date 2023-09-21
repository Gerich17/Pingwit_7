package pl.pingwit.homework3;

// в ДЗ3 я не буду просить переименовать классы, но в ДЗ4 плиз именуй их все по смыслу того, что они делают, а не Task1 ...
public class Task4 {
    public static void main(String[] args) {
        // Составьте программу, вычисляющую A*B, не пользуясь операцией умножения.{
        int A = 147;
        int B = 7;
        int result = 0;
        for (int i = 0; i < A; i++) {
            result = result + B;
        }
        System.out.println(result);
    }
}
