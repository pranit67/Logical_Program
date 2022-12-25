package com.bridgelabz.LogicalProgram;

import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Please Enter The Number: ");
        int num = sc.nextInt();
        int value = 0;
        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                value = value + i;
            }
        }
        if (value == num) {
            System.out.println(num + " is a Perfect Number");
        } else {
            System.out.println(num + " is not a Perfect Number");
        }
    }
}