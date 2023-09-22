package pl.pingwit.homework3;


public class ProgressionSum {
    // плиз старайся называть классы по-английски, а не транслитом. здесь подойдет ProgressionSum
    // Вычислить: 1+2+4+8+...+256
        public static void main(String[] args) {
// kbiyzz gecnfz cnhjrf
            int sum = 0;
            for (int i = 1; i <= 256; i = i * 2) {
                sum += i;
            }
            System.out.println(sum);
        }
    }

