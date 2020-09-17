package com.codersbay;

public class Main {

    public static void main(String[] args) {
        int[] array = { 96, 88, 13355, 20, 111, 42, 788 };
        System.out.println("The biggest number is: " + findMax(array, 0, array.length - 1));
    }

    public static int findMax(int[] array, int firstInt, int secondInt) {
        if (secondInt - firstInt == 1) {
            if (array[firstInt] > array[secondInt]) {
                return array[firstInt];
            } else {
                return array[secondInt];
            }
        } else if (firstInt == secondInt) {
            return array[firstInt];
        }
        return Math.max(findMax(array, firstInt, (firstInt + secondInt) / 2), findMax(array, (firstInt + secondInt) / 2 + 1, secondInt));
    }
}
