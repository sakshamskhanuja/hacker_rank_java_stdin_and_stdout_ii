import java.util.Scanner;

public class Main {

    public static void main(String[] ss) {
        // Scans the user input.
        Scanner scanner = new Scanner(System.in);

        try {
            // User inputs an int.
            int a = Integer.parseInt(scanner.nextLine());

            // User inputs a double.
            double b = Double.parseDouble(scanner.nextLine());

            // User inputs a String.
            String c = scanner.nextLine();

            // Prints entered values.
            System.out.println("String: " + c);
            System.out.println("Double: " + b);
            System.out.println("Int: " + a);
        } catch (NumberFormatException e) {
            System.out.println("Entered value cannot be parsed.");
        }
    }
}
