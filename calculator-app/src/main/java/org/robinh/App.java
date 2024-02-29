package org.robinh;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        do {
            menu();
            if (scanner.hasNextInt()) {
                int userInput = scanner.nextInt();

                switch (userInput) {
                    case 1:
                        calculation("Addition", scanner);
                        break;
                    case 2:
                        calculation("Subtraction", scanner);
                        break;
                    case 3:
                        calculation("Multiplication", scanner);
                        break;
                    case 4:
                        calculation("Division", scanner);
                        break;
                    case 5:
                        System.out.println("See you next time and have a good day!");
                        return;
                    default:
                        System.out.println("Enter one of the numbers above!");
                }
            } else {
                System.out.println("That's not a number!");
                scanner.next();
            }
        } while (true);
    }

    public static void menu() {
        System.out.println(" **** The Calculator App **** ");
        System.out.println("Choose what type of calculation:");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.println("5. Exit");
    }
}
