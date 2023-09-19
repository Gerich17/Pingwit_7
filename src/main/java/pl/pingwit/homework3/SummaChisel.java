package pl.pingwit.homework3;

public class SummaChisel {
    public static void main(String[] args) {
        // Вычислить: 1+2+4+8+...+256
        int sum = 0;
        for (int i = 1; i <= 256; i = i * 2) {
            sum += i;
        }
        System.out.println(sum);


    }
}
