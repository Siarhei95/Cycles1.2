package Exercise1;
import java.util.Scanner;

public class Question_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a, b, h, x, y = 0;
        System.out.print("Enter a: ");
        a = scanner.nextDouble();
        System.out.print("Enter b: ");
        b = scanner.nextDouble();
        System.out.print("Enter h: ");
        h = scanner.nextDouble();
        x = a;
        while (x <= b) {
            if (x > 2) {
                y = x;

            } else {
                y = -x;
            }
            x = x + h;
            System.out.println(y);

        }
    }
}

