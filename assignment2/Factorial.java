package com.assignment2;
import java.util.Scanner;
public class Factorial {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number to find factorial:");
        int factorial=1, n=sc.nextInt();
        for(int i=1; i<=n; i++) //Running loop from 1 to n
        {
            factorial *= i; //Storing factorial in factorial
        }
        System.out.println("Factorial of "+n+" is "+factorial);
    }
}