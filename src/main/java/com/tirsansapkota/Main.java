// For any problem/commit
// Specify if its an Exercise or some Concept Explained. followed by : . followed by description or just name.
// Eg: Exercise: Code Magnets
package com.tirsansapkota;

// Exercise: Pool Puzzle
// Description: Your job is to take code snippets from one pool and place them into the blank lines
// into the code. you may NOT use the same snippet twice & won't need to use all the snippets.



public class Main{
    public static void main(String[] args)
    {
        int x = 0;
        while ( x < 4  ) {
            System.out.print("a");
            if ( x < 1 ) { //
                System.out.print(" ");
            }
            System.out.print("n");
            if ( x < 1) {
                System.out.print("oise");
                x = x -1;
            }
            if (x == 1 ) { //
                System.out.print("noys");
            }
            if ( x > 1 ) {
                System.out.print(" oyster");
            }
            System.out.println();
            x = x + 2;
        }
    }
}

// Result: Finally solves the puzzle. First I figured out the order of things without worrying about adding
//      or removing from x. Then, i figured out the maths behind it. All brute forced it.