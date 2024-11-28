package org.example;

import java.util.Arrays;


public class Main {
    public static void main(String[] args) {
        int[] numbers = {20, 34, 36, 60, 68};
        // {68,60,36,34,20}
        System.out.println(Arrays.toString(numbers));
        task(numbers);
        System.out.println(Arrays.toString(numbers));

    }

    public static void task(int[] arr) {
        int temp;
        for (int i = 0; i < arr.length / 2; i++) {
            temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }

    }
}