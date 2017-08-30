import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by Artemka on 30.08.2017.
 */
public class Equation {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        double a;
        double b;
        double x;

        System.out.println("Укажите аргументы \"a\" и \"b\" для уравнения вида: \"ax + b = 0\"");
        System.out.print("a = ");
        a = getDoubleValueFromConsole();
        System.out.print("b = ");
        b = getDoubleValueFromConsole();
        x = (0 - b) / a;

        System.out.println("Решением уравнения: \"" + a + "x + " + b + " = 0\" является число: " + x);
    }

    // Метод считывания аргументов с консоли
    private static double getDoubleValueFromConsole(){
        double result;
        boolean checkEnd = true;
        do {
            if (scanner.hasNextDouble()){
                result = scanner.nextDouble();
                checkEnd = false;
            }else {
                System.out.println("Вы неверно ввели число , попробуйте еще раз...");
                scanner.next();
                result = 0.0/0;
            }
        }while (checkEnd);
        return result;
    };

}
