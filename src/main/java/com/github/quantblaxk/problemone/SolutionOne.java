package com.github.quantblaxk.problemone;

/**
 * @author QuantBlaxk
 *
 * Problem: https://projecteuler.net/problem=1
 */
public class SolutionOne {

    public static void main(String[] args) {

        //set default max_value to 1000
        int maxValue = 1000;

        //Required time (start value)
        long timeStart = System.nanoTime();

        //if the user has given an number as argument, it'll take it for max_value
        if (args.length > 0) {
            try {
                maxValue = Integer.parseInt(args[0]);
            } catch (NumberFormatException e) {
                System.err.println("Please insert a number!");
                System.exit(0);
            }
        }

        //loop through all numbers between 3(first multiple) and maxValue
        long result = 0;
        for (int i = 3; i < maxValue; i++) {
            //if i can be divided by 3 or 5, add it to result
            if (i % 3 == 0 || i % 5 == 0) {
                result += i;
            }
        }
        //output the result
        System.out.println(result);

        //Required time (end value)
        long timeEnd = System.nanoTime();
        //output the required time
        System.out.printf("Required time: %d milliseconds", (timeEnd - timeStart)/1000000);

    }

}
