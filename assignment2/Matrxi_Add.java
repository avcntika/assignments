package com.assignment2;
import java.util.Scanner;
public class Matrxi_Add {
    public static void main(String[] args)
    {

        int a[][]={{1,2,3},{4,5,6},{7,8,9}};
        int b[][]={{1,5,4},{3,4,6},{2,2,7}};
        int c[][] = new int[3][3];
        for(int i = 0; i<3;i++)
        {
            for(int j = 0; j<3; j++) {
                c[i][j] = a[i][j] + b[i][j];
                System.out.print(c[i][j] + " ");
            }
            System.out.println();
        }
    }
}
