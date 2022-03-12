package calculator;
import java.util.Scanner;

public class Calculator {

    public void start() {
            double result = 0;
            String plus = "+";
            String minus = "-";
            String div = ":";
            String umnozhenie = "*";
            Scanner scan = new Scanner(System.in);
            System.out.println("Введите первое число:");
            double Num1 = scan.nextInt();
            System.out.println("Введите второе число:");
            double Num2 = scan.nextInt();
            System.out.println("Введите знак операции:");
            String getUserSignTest = scan.nextLine();
            String getUserSign2 = scan.nextLine();
            if (getUserSign2.equals(plus)) {
                result = Num1 + Num2;
            }
            if (getUserSign2.equals(minus)) {
                result = Num1 - Num2;
            }
            if (getUserSign2.equals(div)) {
                result = Num1 / Num2;
            }
            if (getUserSign2.equals(umnozhenie)) {
                result = Num1 * Num2;
            }
            if (result == 0.0) {
                System.out.println("Ошибка");
            } else {
                System.out.println(result);
            }
        }
    }