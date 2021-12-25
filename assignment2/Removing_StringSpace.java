package com.assignment2;
import java.util.Scanner;
public class Removing_StringSpace {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string:");
        String str = sc.nextLine();
        str = str.replaceAll(" ","");
        System.out.println("String without space: "+str);
    }
}

