import java.util.Scanner;

// Реализовать простой калькулятор

public class t_03 {
    public static void main(String[] args) {

        System.out.println(
        "------------------------------------\n" +
        " ######     ###    ##        ###### \n" +
        "##    ##   ## ##   ##       ##    ##\n" +
        "##        ##   ##  ##       ##      \n" +
        "##       ##     ## ##       ##      \n" +
        "##       ######### ##       ##      \n" +
        "##    ## ##     ## ##       ##    ##\n" +
        " ######  ##     ## ########  ###### \n" +
        "------------------------------------\n" +
        "Что можно вычислить в калькуляторе: \n" +
        "1. Сложение (+) \n" +
        "2. Вычитание (-) \n" +
        "3. Умножение (*) \n" +
        "4. Деление (/) \n");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Выберите операцию: (+ - * /) ");
        char operation = scanner.next().charAt(0);

        System.out.println("Введите первое число: ");
        double num1 = scanner.nextDouble();

        System.out.println("Введите второе число: ");
        double num2 = scanner.nextDouble();
        
        switch (operation) {
            case '+':
                System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
                break;
            case '-':
                System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
                break;
            case '*':
                System.out.println(num1 + " x " + num2 + " = " + (num1 * num2));
                break;
            case '/':
                System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
                break;  
            default:
                System.err.println("Такой операции нет");
                break;
        }
        scanner.close();
    }
}