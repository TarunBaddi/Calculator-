import java.util.Scanner;

public class mathOpsFloat {
    float a;
    float b;

    void add() {
        System.out.println("Sum = " + (a + b));
    }

    void sub() {
        System.out.println("Subtraction = " + (a - b));
    }

    void mult() {
        System.out.println("Multiplication = " + (a * b));
    }

    void div() {
        if (b != 0) {
            System.out.println("Division = " + (a / b));
        } else {
            System.out.println("Error: Cannot divide by zero.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        System.out.println("Enter the value of a: ");
            float a = scanner.nextFloat();

            System.out.println("Enter the value of b: ");
            float b = scanner.nextFloat();

        while (!exit) {

            mathOpsFloat obj = new mathOpsFloat();
            obj.a = a;
            obj.b = b;

            System.out.println("\nEnter the choice:");
            System.out.println("1. Addition  2. Subtraction  3. Multiplication  4. Division  5. Exit");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    obj.add();
                    break;
                case 2:
                    obj.sub();
                    break;
                case 3:
                    obj.mult();
                    break;
                case 4:
                    obj.div();
                    break;
                case 5:
                    exit = true;
                    System.out.println("Exiting the program.");
                    break;
                default:
                    System.out.println("Enter the appropriate option");
            }
        }

        scanner.close();
    }
}
