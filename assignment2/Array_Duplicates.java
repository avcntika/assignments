package com.duplicate;

public class Array_Duplicates {  public static void main(String[] args) {
    int m[] = new int[] {1,2,3,3,3,4,5,7,7,9,9,10,11}; //creating array
    for(int i = 0; i<m.length; i++) //Iterating over array
    {for(int j = i+1; j<m.length; j++)
    {
        if(m[i]==m[j]) //checking duplicates
            System.out.println(m[i]); //Printing the duplicate elements
    }
    }
}
}

