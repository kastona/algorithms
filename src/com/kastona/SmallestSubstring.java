package com.kastona;

import java.util.Collections;

/*

    Finds the smallest substring that contains all specified characters


    Complexity: O(mn^2), n = length of String, m length of characters

    Any improvement? Maybe substringIsSolution() can be improved to constant time operation?


 */

public class SmallestSubstring {
    static char[] chars = {'x','y','z'};
    public static void main(String[] args) {
        String s = "xyyyxczyx";


        String smallestSub = s;

        for(int i =0; i< s.length(); i++) {
            for(int j = i; j < s.length(); j++) {
                String sub = s.substring(i, j+1);

                if(substringIsSolution(sub)) {
                    //we've found a solution
                    smallestSub = sub.length() <= smallestSub.length()? sub: smallestSub;

                    //System.out.println(smallestSub);
                    break; //because anymore substring from i will be larger than current
                }
            }
        }

        System.out.print("Smallest Substring: ");
        System.out.println(smallestSub);
    }

    private static boolean substringIsSolution(String sub) {

        for(char c: chars) {
            if(!sub.contains("" + c))
                return false;
        }

        return true;
    }
}
