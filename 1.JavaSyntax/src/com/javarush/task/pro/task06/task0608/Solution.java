package com.javarush.task.pro.task06.task0608;

/* 
Кубический калькулятор
*/

public class Solution {
    public static void main(String[] args) {
        cube(3);
    }

    public static long cube(long value){
        value = value * value * value;
        System.out.println(value);
        return value;
    }
    //напишите тут ваш код
}
