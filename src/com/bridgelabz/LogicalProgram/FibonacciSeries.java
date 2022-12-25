package com.bridgelabz.LogicalProgram;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Length Of fibonacci Series :: ");
        int series = scan.nextInt();
        int firstTerm = 0;
        int secondTerm = 1;
        int thirdTerm;
        for (int i = 0; i < series; i++) {
            System.out.print(firstTerm + " ");
            thirdTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = thirdTerm;
        }
    }
}
