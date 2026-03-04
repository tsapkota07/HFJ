package com.tirsansapkota;

// Exercise: Be The Compiler: 1C



// For any problem/commit
// Specify if its an Exercise or some Concept Explained. followed by : . followed by description or just name.
// Eg: Exercise: Code Magnets
public class Main{
    public static void main(String[] args)
    {
        int x = 5;
        while (x > 1) {
            x = x-1;
            if (x<3) {
                System.out.println("Small x");
            }
        }
    }
}

// Result: Runs the loop properly this time. outputs 'Small x' twice.