package com.alexshab;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number 1:");
        int number1 = scanner.nextInt();
        System.out.println("Enter number 2:");
        int number2 = scanner.nextInt();
        System.out.println("The sum of two numbers:" + (number1 + number2));
    }
}
