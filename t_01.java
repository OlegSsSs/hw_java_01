// Вычислить n-ое треугольное число(сумма чисел от 1 до n), n! (произведение чисел от 1 до n)

import java.util.Scanner;

public class t_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число n: ");
        int n = scanner.nextInt();
        switch (n) {
            case 0:
                System.out.println("Сумма чисел и факториал числа 0 = " + n);
                break;
            default:
                long sumN = 0;
                long sumF = 1;
                for (int i = 1; i <= n; i++) {
                    sumN = sumN + i;
                }
                for (int i = 1; i <= n; i++) {
                    sumF = sumF * i;
                }
                System.out.println("Сумма чисел до числа n = " + sumN);
                System.out.println("Факториал числа !n = " + sumF);
                break;
        }
        scanner.close();
    }
}