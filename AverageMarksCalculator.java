
package assignment;

import java.util.Scanner;

public class AverageMarksCalculator {
    public static void main(String[] args) {
        int totalUnits = 5;
        double sum = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the marks for each unit:");

        for (int i = 1; i <= totalUnits; i++) {
            System.out.print("Unit " + i + ": ");
            double marks = scanner.nextDouble();
            sum += marks;
        }

        double average = sum / totalUnits;

        System.out.printf("Average marks: %.2f%n", average);

        scanner.close();
    }
}
