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

        System.out.println("Original array: " + Arrays.toString(arr));

        // Удаление из массива
        key = 13;
        int count = 0;

        // Считаем количество вхождений ключа
        for (int value : arr) {
            if (value == key) {
                count++;
            }
        }

        // Создаем новый массив с учетом количества удаляемых элементов
        int[] arr2 = new int[arr.length - count];
        int index = 0;

        // Заполняем новый массив
        for (int value : arr) {
            if (value != key) {
                arr2[index++] = value;
            }
        }

        System.out.println("Modified array: " + Arrays.toString(arr2));
    }
}
