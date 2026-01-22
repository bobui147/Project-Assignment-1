import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        while (true) {
            System.out.println("===== MENU =====");
            System.out.println("1. Say hello");
            System.out.println("2. Say goodbye");
            System.out.println("0. Exit");
            System.out.print("Your choice: ");

            try {
                choice = Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Invalid input!");
                continue;
            }

            switch (choice) {
                case 1:
                    System.out.println("xin chào");
                    break;

                case 2:
                    System.out.println("tạm biệt");
                    break;

                case 0:
                    System.out.println("Program ended.");
                    return;

                default:
                    System.out.println("Invalid choice!");
            }

            System.out.println();
        }
    }
}
