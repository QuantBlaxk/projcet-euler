package com.github.quantblaxk.problemtwo;

/**
 * @author QuantBlaxk
 *
 * Problem: https://projecteuler.net/problem=2
 */
public class SolutionOne {

    public static void main(String[] args) {

        long fibOne = 0;
        long fibTwo = 1;
        //set default max_value to four-million
        int maxValue = 4000000;
        int evenResult = 0;

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

        //loop until the new fibonacci number is bigger than max_value
        while (true) {
            //temporarily number
            long newFib = fibOne + fibTwo;
            //break loop if new fib number is bigger than max_value
            if (newFib > maxValue) {
                break;
            }
            //new fib one set to old fib two
            fibOne = fibTwo;
            //new fib two set to old fib one + old fib two
            fibTwo = newFib;

            //if new fib is even, add it to even result
            if(fibTwo % 2 == 0) {
                evenResult += fibTwo;
            }
        }
        //output the result
        System.out.println(evenResult);

        //Required time (end value)
        long timeEnd = System.nanoTime();
        //output the required time
        System.out.printf("Required time: %d milliseconds", (timeEnd - timeStart)/1000000);

    }

}
