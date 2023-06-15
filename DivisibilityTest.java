
package assignment;

import java.util.Scanner;

public class DivisibilityTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();

        // Check divisibility by numbers 0-9
        for (int i = 0; i <= 9; i++) {
            if (isDivisible(number, i)) {
                System.out.println("The number is divisible by " + i);
            }
        }

        scanner.close();
    }

    // Check if a number is divisible by another number
    public static boolean isDivisible(int number, int divisor) {
        if (divisor == 0) {
            return false; // Avoid division by zero
        }

        return number % divisor == 0;
    }
}

