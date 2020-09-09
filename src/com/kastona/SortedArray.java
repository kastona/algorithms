package com.kastona;

public class SortedArray {

    public static void main(String[] args) {
        int[] array = {2,3,5,7};
        System.out.println(arraySorted(array, array.length-1)? "Array is sorted": "Array is not sorted");
    }

    private static boolean arraySorted(int[] array, int position) {
        if(position == array.length-1) {
            return array[position] >= array[position-1];
        }

        return array[position] >= array[position-1] && arraySorted(array, position-1);
    }
}
