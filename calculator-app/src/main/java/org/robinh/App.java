package org.robinh;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        menu();
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
