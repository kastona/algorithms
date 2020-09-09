package com.kastona;

         /*
            Finds n set of numbers present in an array that sum up to x
            I saw an iterative solution.

           Given [2,5,8,3] and x = 10, n = 2, the solution will return [2,8] as 2 (n)  numbers in the array
           that sum up to 10 (x)

           given [4,6,2,9,12,25], x = 31, n = 3,
           solution produced will be [25, 4, 2]
         */

//Runs in O(n3)?  Maybe sorting the numbers
//will reduce the search complexity at the base case?


public class NumberSum {

    //array of numbers
    private static int[] numbers = {4, 6, 2, 9, 12, 25};

    //holds our solution numbers
    private static int[] solutionNumbers;

    public static void main(String[] args) {

        int n = 3;
        int x = 31;
        solutionNumbers = new int[n];


        if (!findSumNumbers(x, n)) {
            System.out.println("Couldn't find such pairs!");
        } else {
            for (int number : solutionNumbers) {
                System.out.print(number + " ");
            }
        }


    }

    private static boolean findSumNumbers(int sum, int n) {
        if (n == 1) {
            for (int number : numbers) {
                if (number == sum) {
                    solutionNumbers[0] = sum;
                    return true;
                }
            }
            return false;
        }


        for (int num : numbers) {
            if (findSumNumbers(sum - num, n - 1)) {
                solutionNumbers[n - 1] = num;
                return true;
            }
        }

        return false;
    }

}
