package pl.pingwit.homework3;

public class Task5 {
    //Напишите программу печати таблицы перевода расстояний из дюймов в сантиметры
    //для значений длин от 1 до 20 дюймов. 1 дюйм = 2,54 см
    public static void main(String[] args) {
        double inch = 2.54;
        double result = 0;
        for (int i = 1; i <= 20; i++) {
            result += inch;
            System.out.println(i + " inch = " + result + "sm");
        }
    }
}
