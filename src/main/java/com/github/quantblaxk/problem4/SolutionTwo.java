package com.github.quantblaxk.problem4;

/**
 * @author QuantBlaxk
 *
 * Problem: https://projecteuler.net/problem=4
 */
public class SolutionTwo {

    public static void main(String[] args) {

        //default all 3-digit numbers (100-999)
        int startNumber = 100;
        int endNumber = 999;

        //Required time (start value)
        long timeStart = System.nanoTime();

        //if the user has given an number as argument, it'll take it for max_value
        if (args.length > 1) {
            try {
                startNumber = Integer.parseInt(args[0]);
                endNumber = Integer.parseInt(args[1]);
            } catch (NumberFormatException e) {
                System.err.println("Please insert a number!");
                System.exit(0);
            }
        }

        //loop through all numbers between startNumber and endNumber to get the first factor
        int resultFactorOne = 0;
        int resultFactorTwo = 0;
        long result = 0;
        for (int factorOne = startNumber; factorOne <= endNumber; factorOne++) {
            //loop through all numbers between startNumber and endNumber to get the second factor
            for (int factorTwo = startNumber; factorTwo <= endNumber; factorTwo++) {
                //multiply factorOne with factorTwo
                String product = String.valueOf((long) factorOne * factorTwo);
                int j = product.length() - 1;
                //check if the first number is the same as the last, the second the same as the number before the last and so on
                for (int i = 0; i < product.length(); i++) {
                    //break loop, if the two numbers are not the same
                    if (product.charAt(i) == product.charAt(j)) {
                        j--;
                        //let the loop run to the middle
                        if(i != j) {
                            continue;
                        }
                    } else {
                        break;
                    }
                    //update the result, if the number is a palindrome
                    result = Long.parseLong(product);
                    resultFactorOne = factorOne;
                    resultFactorTwo = factorTwo;
                }
            }
        }
        //output the result
        System.out.printf("%d * %d = %d%n", resultFactorOne, resultFactorTwo, result);

        //Required time (end value)
        long timeEnd = System.nanoTime();
        //output the required time
        System.out.printf("Required time: %d milliseconds", (timeEnd - timeStart) / 1000000);

    }

}