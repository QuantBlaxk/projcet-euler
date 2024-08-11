package com.github.quantblaxk.problem5;

/**
 * @author Jakob
 *
 * Problem: https://projecteuler.net/problem=5
 */
public class SolutionTwo {

    public static void main(String[] args) {

        int max_d = 20;

        //Required time (start value)
        long timeStart = System.nanoTime();

        //loop through all numbers in ascending order
        main:
        for (int i = 2520; ; i++) {
            //check whether number @i can be divided by the numbers 1 to 20, if not, skip it
            for (int d = 2; d <= max_d; d++) if (i % d != 0) continue main;
            //print the first number (since looping in ascending order it's also the smallest) which matches the above condition and break the loop
            System.out.println(i);
            break;
        }

        //Required time (end value)
        long timeEnd = System.nanoTime();
        //output the required time
        System.out.printf("Required time: %d milliseconds", (timeEnd - timeStart) / 1000000);

    }

}
