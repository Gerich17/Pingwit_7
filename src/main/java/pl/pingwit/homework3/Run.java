package pl.pingwit.homework3;

public class Run {
    public static void main(String[] args) {
       /* Начав тренировки, спортсмен в первый день пробежал 10 км. Каждый
                день он увеличивал дневную норму на 10% нормы предыдущего дня. Какой
                суммарный путь пробежит спортсмен за 7 дней?
        */
        double km = 10;
        double totalKm = 10;
        for (int day = 2; day <= 7; day++) {
            totalKm = totalKm + totalKm * 0.1;
            km += totalKm;

        }
        System.out.println(km);
    }


}

