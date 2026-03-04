package com.tirsansapkota;

// Exercise: Be The Compiler: 1A



// For any problem/commit
// Specify if its an Exercise or some Concept Explained. followed by : . followed by description or just name.
// Eg: Exercise: Code Magnets
public class Main{
    public static void main(String[] args)
    {
        int x =1;
        while (x < 10) {
            if (x > 3) {
                System.out.println("big x");
            }
        }

    }
}

// Result: Does not decrement the x value at any point in the loop. Thus, the loop runs indefinitely.