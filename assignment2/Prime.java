package com.assignment2;
import java.util.Scanner;
public class Prime {
    public static void main(String[] args)
    {
        Scanner inp = new Scanner(System.in);
        int flag=0;
        System.out.println("Enter a number:");
        int n = inp.nextInt();
        if (n==0|n==1|n==2)
        {
            System.out.println("Not a prime number.");
        }
        else
        {
            for(int i=2;i<n;i++) //Starting a loop from 2 because all numbers are divisible by 1.
            {
                if (n%i==0) { //Checking if number is divisible by any other number except itself and 1
                    System.out.println("It is not a prime number");
                    break; //Exiting loop if number is found divisible after printing appropriate message
                }
                else
                    flag = 1; //Marking flag as 1 if number is found indivisible by all numbers running through the loop
            }
        }
        if (flag == 1) //Printing appropriate message if number is found to be prime.
            System.out.println("It is a prime number.");

    }
}