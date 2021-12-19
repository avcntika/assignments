package com.assignment1;

import java.util.Scanner;

public class Neon_numbers {
    public static void main(String[] args) {


        int sum = 0, square, d;
        Scanner sc = new Scanner(System.in); //taking input from user
        System.out.println("Enter any number:");
        int n = sc.nextInt(); //reads the inputted value
        square = n * n; //calculating the square of given number

        while (n != 0) ;
        {
            d = n % 10;
            sum = sum + (d*d);
            n = n / 10;
        }
        if (sum == square)
            System.out.println("This is a neon number");
        else
            System.out.println("This is not a neon number");

    }
}

