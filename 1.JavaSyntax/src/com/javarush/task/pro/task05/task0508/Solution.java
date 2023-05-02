package com.javarush.task.pro.task05.task0508;

import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

/* 
Удаляем одинаковые строки
*/

public class Solution {
    public static String[] strings;

    public static void main(String[] args) {
        //напишите тут ваш код
        Scanner console = new Scanner(System.in);
        strings = new String[6];
        
        for (int i = 0; i < strings.length; i++) {
            strings[i] = console.nextLine();
        }

        for (int i = 0; i < strings.length; i++) {
            String temp = strings[i];

            for (int j = i + 1; j < strings.length; j++){
                if (temp == null) break;
                if (temp.equals(strings[j])){
                    strings[j] = null;
                    strings[i] = null;
                }
            }
        }

        for (String string : strings) {
            if (Objects.equals(string, strings[5])) {
                System.out.print(string);
            } else {
                System.out.print(string + ", ");
            }
        }
    }
}
