package com.github.quantblaxk.problem4;

/**
 * @author QuantBlaxk
 *
 * Problem: https://projecteuler.net/problem=4
 */
public class SolutionOne {

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
                long correctSeq = (long) factorOne * factorTwo;
                //turn the number around, so that the last number is the first, the number before the last the second and so on
                char[] tmpCharArr = String.valueOf(correctSeq).toCharArray();
                char[] newTmpCharArr = new char[tmpCharArr.length];
                int tmp = 0;
                for (int i = tmpCharArr.length - 1; i >= 0; i--) {
                    newTmpCharArr[tmp] = tmpCharArr[i];
                    tmp++;
                }
                long turnedSeq = Long.parseLong(String.copyValueOf(newTmpCharArr));
                //if the turned number is the same, as the normal update result
                if (correctSeq == turnedSeq) {
                    resultFactorOne = factorOne;
                    resultFactorTwo = factorTwo;
                    result = correctSeq;
                }
            }
        }
        //output the result
        System.out.printf("%d * %d = %d%n", resultFactorOne, resultFactorTwo, result);

        //Required time (end value)
        long timeEnd = System.nanoTime();
        //output the required time
        System.out.printf("Required time: %d milliseconds", (timeEnd - timeStart)/1000000);

    }

}
