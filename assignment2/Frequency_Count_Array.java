package com.assignment2;

public class Frequency_Count_Array {public static void main(String args[]) {

    int m[] = new int[]{5, 7, 7, 9, 5}; //Main Array
    int counts[] = new int[m.length]; //Array that stores frequency count
    int count = 0, checked=-1;

    for (int i = 0; i < m.length; i++) { //Outer loop iterates over the Main array
        //System.out.println("I is at "+i);
        count = 1; //If element exists then the count would be 1
        for (int j = i+1; j < m.length; j++) //Iterating over the arrays with starting point being the next element (+1) from main array.
        {
            //System.out.println("J is at "+j);
            if(m[i] == m[j]) //Checking if element is repeated
            {
                count += 1; //Increasing count by 1
                counts[j] = checked; //Marking the position as checked (to avoid repeat checking when reaching that index)
            }
        }
        if (counts[i] != checked) //If the index is not pre-counted, set its count to count.
        {
            counts[i] = count;
        }

    }
    for(int i = 0; i<counts.length;i++) //loop to print array with frequency
    {
        if (counts[i] != checked) //Condition to skip over repeat checks
        {
            System.out.println(m[i]+", Frequency: "+counts[i]);

        }
    }
}

}
