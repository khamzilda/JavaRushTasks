package com.javarush.task.pro.task05.task0517;

import java.util.Arrays;

/* 
Делим массив
*/

public class Solution {

    public static int[][] result = new int[2][];
    public static int[] array = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};

    public static void main(String[] args) {
        //напишите тут ваш код
        if (array.length % 2 == 0) {
            int[] min = Arrays.copyOfRange(array, 0, array.length / 2);
            int[] max = Arrays.copyOfRange(array, array.length / 2, array.length);
            result[0] = new int[min.length];
            result[1] = new int[max.length];
            result[0] = min;
            result[1] = max;

        } else {
            int[] min = Arrays.copyOfRange(array, 0, array.length / 2 + 1);
            int[] max = Arrays.copyOfRange(array, array.length / 2 + 1, array.length);
            result[0] = new int[min.length];
            result[1] = new int[max.length];
            result[0] = min;
            result[1] = max;
        }

        System.out.println(Arrays.deepToString(result));
    }
}
