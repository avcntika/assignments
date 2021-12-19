package com.isbn;


import java.lang.*;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
            String str;
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter ISBN:");
            str = sc.next();
            int len = str.length(), count = 10, sum = 0;
            if (len != 10) {
                System.out.println("Invalid ISBN");
            } else {
                for (int i = 0; i < len; i++) {
                    sum = (Integer.parseInt(str.substring(i, i + 1)) * count) + sum;
                    count--;
                }
                if (sum % 11 == 0) {
                    System.out.println("it is an ISBN");
                } else
                    System.out.println("not an ISBN");
            }

        }
    }
