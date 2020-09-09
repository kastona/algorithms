package com.kastona;

import java.util.stream.Stream;

public class Test {
    public static void main(String[] args) {
        towerOfHanoi(4, 'A', 'B', 'C');
    }


    static void towerOfHanoi(int n, char from, char to, char aux) {
        if(n ==1) {
            System.out.println("Moved disk from " + from + " to " + to + " using " + aux);
            return;
        }

        towerOfHanoi(n-1, from, aux, to);
        System.out.println("Moved disk from " + from + " to " + to + " using " + aux);
        towerOfHanoi(n-1, aux, to, from);


    }
}
