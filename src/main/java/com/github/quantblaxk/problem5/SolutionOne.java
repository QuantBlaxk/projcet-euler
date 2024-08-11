package com.github.quantblaxk.problem5;

/**
 * @author Jakob
 *
 * Problem: https://projecteuler.net/problem=5
 */
public class SolutionOne {

    static int gcd(int a, int b) {
        // calculate the greatest common divisor (Euclidean algorithm)
        while (b != 0) {
            int t = b;
            b = a % b;
            a = t;
        }
        return a;
    }

    public static void main(String[] args) {

        int max_d = 20;

        //Required time (start value)
        long timeStart = System.nanoTime();

        //calculate the lcm
        int result = 1;
        for (int i = 2; i <= max_d; i++) result = result * (i / gcd(result, i));
        System.out.println(result);

        //Required time (end value)
        long timeEnd = System.nanoTime();
        //output the required time
        System.out.printf("Required time: %d milliseconds", (timeEnd - timeStart) / 1000000);

    }

}
