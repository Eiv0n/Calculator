package calculator;
import java.util.Scanner;

public class Calculator {
    public void start() {
        double result = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите первое число:");
        double Num1 = scan.nextInt();
        System.out.println("Введите второе число:");
        double Num2 = scan.nextInt();
        System.out.println("Введите знак операции:");
        String getUserSignTest = scan.nextLine();
        String getUserSign2 = scan.nextLine();
        switch (getUserSign2) {
            case "+": result = Num1 + Num2;
            break;
            case "-": result = Num1 - Num2;
            break;
            case "*": result =Num1 * Num2;
            break;
            case "/": result = Num1 / Num2;
            default:
                System.out.println("Ошибка.");
        }
        System.out.println("Результат:" + result);
    }
}
