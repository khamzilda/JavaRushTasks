package com.javarush.task.pro.task06.task0606;

/* 
Универсальный солдат
*/

public class Solution {

    public static void main(String[] args) {

        String[] data = {"Hello", "world"};

        universalMethod();
        universalMethod(1);
        universalMethod(1, 2);
        universalMethod("Привет");
        universalMethod(1.0);
        universalMethod(true);
        universalMethod("Привет", 2);
        universalMethod(true, data);
        universalMethod(data);
        universalMethod("Zilda", "Khamzina");
    }

    public static void universalMethod(){
        System.out.println("hello");
    }

    public static void universalMethod(int x){

    }

    public static void universalMethod(int x, int y){

    }

    public static void universalMethod(String result){

    }

    public static void universalMethod(double x){

    }

    public static void universalMethod(boolean trueFalse){

    }

    public static void universalMethod(String result, int x){

    }

    public static void universalMethod(boolean yesNo, String[] text){

    }

    public static void universalMethod(String[] text){

    }

    public static void universalMethod(String name, String lastname){

    }

    //напишите тут ваш код
}
