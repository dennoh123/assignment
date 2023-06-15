package assignment;

import java.util.Scanner;

public class SurnameAndAge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your surname: ");
        String surname = scanner.nextLine();

        System.out.print("Enter your current age: ");
        int age = scanner.nextInt();

        int surnameLength = surname.length();

        System.out.println("The number of characters in your surname is: " + surnameLength);

        if (age % 2 == 0) {
            System.out.println("Your current age is an even number.");
        } else {
            System.out.println("Your current age is an odd number.");
        }

        scanner.close();
    }
}

