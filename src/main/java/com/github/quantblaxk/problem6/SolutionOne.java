package com.github.quantblaxk.problem6;

/**
 * @author Jakob
 * <p>
 * Problem: https://projecteuler.net/problem=6
 */
public class SolutionOne {

    public static void main(String[] args) {

        int max = 100;

        //Required time (start value)
        long timeStart = System.nanoTime();

        //solve task
        int sumOfSquare = (max * (max + 1) * (2 * max + 1)) / 6;
        int squareOfSum = (max * (max + 1) * max * (max + 1)) / 4;
        int result = squareOfSum - sumOfSquare;
        System.out.println(result);

        //Required time (end value)
        long timeEnd = System.nanoTime();
        //output the required time
        System.out.printf("Required time: %d milliseconds", (timeEnd - timeStart) / 1000000);

    }

}
