import java.util.Scanner;

public class Divide {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double a = sc.nextDouble();

        System.out.print("Enter second number: ");
        double b = sc.nextDouble();

        if (b == 0) {
            System.out.println("Error: Cannot divide by zero");
        } else {
            double result = a / b;
            System.out.println("Result (Divide): " + result);
        }
    }
}
