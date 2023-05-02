package com.javarush.task.pro.task05.task0511;

import java.util.Arrays;
import java.util.Scanner;

/* 
Создаем двумерный массив
*/

public class Solution {
    public static int[][] multiArray;
    public static int[] arrayNumbers;

    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);
        int first = console.nextInt();

        multiArray = new int[first][];
        arrayNumbers = new int[first];

        for (int i = 0; i < arrayNumbers.length; i++) {
            arrayNumbers[i] = console.nextInt();
        }

        for (int i = 0; i < first; i++){
            multiArray[i] = new int[arrayNumbers[i]];
            System.out.println(Arrays.toString(multiArray[i]));
        }


        //напишите тут ваш код
    }
}
