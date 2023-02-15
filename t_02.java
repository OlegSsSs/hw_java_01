// Вывести все простые числа от 1 до 1000

public class t_02 {
    public static void main(String[] args) {
        int a = 1000;
        int k = 0;
        for (int j = 1; j < a; j++) {
            k = 0;
            for (int i = 1; i < j+1; i++) {
                if (j % i == 0) {
                    k++;
                }
            }
            if (k == 2) {
                System.out.print(j + " ");
            }
        }
    }
}
