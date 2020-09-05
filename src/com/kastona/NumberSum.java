package com.kastona;

         /*
            Finds n set of numbers present in an array that sum up to x
            I saw an iterative solution.
         */

        //Runs in O(n3)?  Maybe sorting the numbers
            //will reduce the search complexity at the base case?



public class NumberSum {

    //array of numbers
    static int numbers[] = {4, 3,4,8, 3, 8, 10};

    //holds our solution numbers
    static int sumNumbers[];
    public static void main(String args[]) {

        int n = 3;
        sumNumbers = new int[n];


        if(!findSumNumbers(20, n)) {
            System.out.println("Couldn't find such pairs!");
        }else {
            for(int number: sumNumbers) {
                System.out.print(number + " ");
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
