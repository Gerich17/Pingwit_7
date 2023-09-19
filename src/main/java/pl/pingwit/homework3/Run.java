package pl.pingwit.homework3;

public class Run {
    public static void main(String[] args) {
       /* Начав тренировки, спортсмен в первый день пробежал 10 км. Каждый
                день он увеличивал дневную норму на 10% нормы предыдущего дня. Какой
                суммарный путь пробежит спортсмен за 7 дней?*/
        double km = 10;  // мне кажется, в этой переменной хранится общая дистанция
        double totalKm = 10;       // мне кажется, в этой переменной сейчас хранится дистанция текущего дня
        for (int day = 2; day <= 7; day++) {
            totalKm = totalKm + totalKm * 0.1; // здесь можно просто умножить на 1.1
            km += totalKm;
        }
        System.out.println(km);
    }
}

