package com.bridgelabz.LogicalProgram;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        int count = 0;
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                count++;
                break;
            }
        }
        if (count == 0) {
            System.out.println("Number is Prime");
        } else {
            System.out.println("Number is not Prime");
        }
    }
}