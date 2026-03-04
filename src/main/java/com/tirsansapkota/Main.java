package com.tirsansapkota;

// Exercise: Be The Compiler: 1A



// For any problem/commit
// Specify if its an Exercise or some Concept Explained. followed by : . followed by description or just name.
// Eg: Exercise: Code Magnets
public class Main{
    public static void main(String[] args)
    {
        int x = 5;
        while (x < 1) {
            x = x-1;
            if (x < 3) {
                System.out.println("small x");
            }
    }

    }
}

// Result: Does not run the loop at all, since the value of x is 5 initially and doesn't get past the while loop.