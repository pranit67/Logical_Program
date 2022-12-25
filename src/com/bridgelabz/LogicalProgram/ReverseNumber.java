package com.bridgelabz.LogicalProgram;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Number");
        int number = scan.nextInt();
        int output = 0;
        while (number != 0) {
            int remainder = number % 10;
            output = output * 10 + remainder;
            number = number / 10;
        }
        System.out.println("Reverse Order Of Number : " + output);
    }
}
