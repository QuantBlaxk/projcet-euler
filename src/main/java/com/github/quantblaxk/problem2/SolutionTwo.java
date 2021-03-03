package com.github.quantblaxk.problem2;

//  needed rules:
//      uneven + uneven = even
//      uneven + even = uneven
//
//  numbers: 1 --> 1 --> 2 --> 3 --> 5 --> 8 --> 13 --> 21 --> 34 --> ...
//  even:    0 --> 0 --> 1 --> 0 --> 0 --> 1 --> 0  --> 0  --> 1 --> ...    (0 = uneven | 1 = even)
//           => every third fibonacci number is even
public class SolutionTwo {

    public static void main(String[] args) {

        long fibOne = 0;
        long fibTwo = 2;
        //set default max_value to four-million
        int maxValue = 4000000;
        long evenResult = 2;

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
            //next even fib number
            long newFib = 4 * fibTwo + fibOne;
            //break loop if new fib number is bigger than max_value
            if (newFib > maxValue) {
                break;
            }
            //new fib one set to old fib two
            fibOne = fibTwo;
            //new fib two set to old fib one + old fib two
            fibTwo = newFib;

            //add fib two to even result
            evenResult += fibTwo;
        }
        //output the result
        System.out.println(evenResult);

        //Required time (end value)
        long timeEnd = System.nanoTime();
        //output the required time
        System.out.printf("Required time: %d milliseconds", (timeEnd - timeStart) / 1000000);

    }

}
