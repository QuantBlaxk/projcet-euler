package com.github.quantblaxk.problem1;

/**
 * @author QuantBlaxk
 *
 * Problem: https://projecteuler.net/problem=1
 */
public class SolutionTwo {

    public static void main(String[] args) {

        //set default value to 1000
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

        long result = 0;
        //add all multiples of 3 to result
        for (int i = 3; i < maxValue; i += 3) {
            result += i;
        }
        //add all multiples  of 5 to result
        for (int i = 5; i < maxValue; i += 5) {
            result += i;
        }
        //remove duplicates (multiples of 3 and 5: 15)
        for (int i = 15; i < maxValue; i += 15) {
            result -= i;
        }
        //output the result
        System.out.println(result);

        //Required time (end value)
        long timeEnd = System.nanoTime();
        //output the required time
        System.out.printf("Required time: %d milliseconds", (timeEnd - timeStart)/1000000);

    }

}
