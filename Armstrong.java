package com.armstrong;

import java.util.Scanner;

public class Armstrong {

    public static void main(String[] args) {

        int cube = 0, d, original;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number:");
        int n = sc.nextInt();
        original = n;
        while(n!=0)
        {
            d=n%10;
            cube=cube+(d*d*d);

            n=n/10;
        }
        System.out.println("Sum of cube of digits is "+cube);
        if (cube==original)
            System.out.println("It is an armstrong number.");
        else
            System.out.println("It is not an armstrong number:");

    }
}

