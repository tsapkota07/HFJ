package com.tirsansapkota;

// Exercise: Code Magnets.



// For any problem/commit
// Specify if its an Exercise or some Concept Explained. followed by : . followed by description or just name.
// Eg: Exercise: Code Magnets
public class Main{
    public static void main(String[] args)
    {
        int x = 3;

        while (x > 0)
        {
            if (x > 2) {
                System.out.print("a");
            }

            x = x - 1;
            System.out.print("-");

            if (x == 2)
            {
                System.out.print("b c");
            }

            if (x == 1)
            {
                System.out.print("d");
                x = x - 1;
            }


        }

    }
}