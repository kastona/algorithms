package com.kastona;

import java.util.Arrays;
import java.util.Collections;

public class NumberSum {
    static int numbers[] = {4, 3,4,8, 3, 8, 10};
    static int sumNumbers[] = new int[3];
    public static void main(String args[]) {

        /*
            Finds n set of numbers that sum up to x
            I saw an iterative solution.
         */

        //Runs in O(n3)?  Maybe sorting the numbers
        //will reduce the search complexity at the base case?

        if(!findSumNumbers(20, 3)) {
            System.out.println("No match");
        }else {
            for(int n: sumNumbers) {
                System.out.print(n + " ");
            }
        }



    }

    public static boolean findSumNumbers(int sum, int n) {

        if(n == 1) {
            for(int i = 0; i < numbers.length; i++) {
                if(numbers[i] == sum) {
                    sumNumbers[n-1] = sum;
                    return true;
                }

            }

            return false;
        }


        for (int i = 0; i < numbers.length; i++) {
            int num = numbers[i];
            if(findSumNumbers(sum-num, n-1)) {
                sumNumbers[n-1] = num;
                return true;
            }
        }

        return false;
    }

}
