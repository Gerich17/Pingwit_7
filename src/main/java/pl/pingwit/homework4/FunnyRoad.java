package pl.pingwit.homework4;

import java.util.Scanner;

public class FunnyRoad {
    /*При старте программы пользователя просят ввести время в пути в секундах.
    Затем, при помощи цикла while выводить на экран извилистую дорогу.
    Определить время старта программы можно при помощи System.currentTimeMillis()
    - это вернет вам текущее время в миллисекундах. */
    private static final String FUNNY_ROAD = "||  |  ||";

    public static void main(String[] args) {
        // while (true); - цикл будет бесконечным
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter travel time in seconds : ");
        int roadTime = scanner.nextInt(); // в этой переменной будет храниться число
        long startTime = System.currentTimeMillis(); // кол-во мл/с от начала отсчета
        long finishTime = startTime + roadTime * 1000L;

        while (System.currentTimeMillis() < finishTime) {

            for (int i = 0; i < 10; i++) {
                for (int j = 0; j < i; j++) {
                    System.out.print(" ");
                }
                System.out.println(FUNNY_ROAD);
            }
            for (int i = 10; i >= 0; i--) {
                for (int j = i; j >= 0; j--) {
                    System.out.print(" ");
                }
                System.out.println(FUNNY_ROAD);
            }
        }


    }
}
