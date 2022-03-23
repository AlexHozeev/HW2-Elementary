package com.alexshab;

import java.util.Scanner;

public class Monobank2 {

    public static final double PERCENT = 0.12;


    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name:");
        String firstName = scanner.nextLine();
        System.out.println("Enter your last name:");
        String surName = scanner.nextLine();
        System.out.println("Enter deposit amount:");
        int money = scanner.nextInt();
        double oneYear = money + money*PERCENT;
        double fiveYear = money + money*PERCENT*5;
        double tenYear = money + money*PERCENT*10;
        System.out.println(firstName + " " + surName  + "  " + "deposit amount:" + money +"$");
        System.out.println("Your deposit after 1 year:" + oneYear +"$" );
        System.out.println("Your deposit after 5 year:" + fiveYear +"$" );
        System.out.println("Your deposit after 10 year:" + tenYear +"$" );
    }
}
