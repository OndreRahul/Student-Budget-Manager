import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double monthlyBudget = 0;
        boolean running = true;


        while (running) {

            System.out.println();
            System.out.println("========================================");
            System.out.println("         STUDENT BUDGET MANAGER");
            System.out.println("========================================");
            System.out.println("1. Set Monthly Budget");
            System.out.println("2. Add Expense");
            System.out.println("3. View Expenses");
            System.out.println("4. View Total Spending");
            System.out.println("5. View Remaining Budget");
            System.out.println("6. Exit");
            System.out.println("========================================");

            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter your monthly budget: ₹");
                    monthlyBudget = scanner.nextDouble();
                    System.out.println("Monthly budget set to ₹" + monthlyBudget);
                     break;


                case 2:
                    System.out.println("Add Expense selected.");
                    break;

                case 3:
                    System.out.println("View Expenses selected.");
                    break;

                case 4:
                    System.out.println("View Total Spending selected.");
                    break;

                case 5:
                    System.out.println("View Remaining Budget selected.");
                    break;

                case 6:
                    running = false;
                    System.out.println("Thank you for using Student Budget Manager!");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }

        scanner.close();
    }
}
