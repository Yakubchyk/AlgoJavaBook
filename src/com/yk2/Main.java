package com.yk2;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int key;
        int[] arr = new int[10];
        arr[0] = 12;
        arr[1] = 21;
        arr[2] = 11;
        arr[3] = 13;
        arr[4] = 61;
        arr[5] = 71;
        arr[6] = 31;
        arr[7] = 51;
        arr[8] = 21;
        arr[9] = 13;
        System.out.println(Arrays.toString(arr));

        // Удаление из массива
        key = 13;
        int element = arr.length;
        for (int i = 0; i < element; i++) {
            if (arr[i] == key) {
                break;
            }
            for (int j = i; j < element - 1; j++) {
                arr[j] = arr[j + 1];
                element--;
kjhjhpjhöjh
        poj+oj
                kojnüo
                        ojh

            }

        }

    }
}
