package com.javarush.task.pro.task05.task0510;

/* 
Треугольный массив
*/

import java.util.Arrays;

public class Solution {

    public static int[][] result = new int[10][];

    public static void main(String[] args) {

        int i, j;

        for (i = 0; i < 10; i++){
            result[i] = new int[i + 1];
        }

        for (i = 0; i < 10; i++){
            for (j = 0; j < i + 1; j++){
                result[i][j] = i + j;
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }

        //напишите тут ваш код
    }
}
