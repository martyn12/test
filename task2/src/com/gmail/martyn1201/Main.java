package com.gmail.martyn1201;

import java.io.*;
import java.util.Scanner;

public class Main {
    
    /*
     метод для определения принадлежности точки к окружности,
     координаты центра окружности и ее радиус считываются из файла, 
     координаты точки считываются из второго файла
     */

    public static void main(String[] args) throws IOException {

        String path1 = args[0]; //передается путь к файлу 1

        File file1 = new File(path1);
        Scanner reader = new Scanner(file1); // считываются числа из файла 1

        float x0 = Float.parseFloat(reader.next()); // координата х центра окружности
        float y0 = Float.parseFloat(reader.next()); // координата у центра окружности
        float r = Float.parseFloat(reader.next()); // радиус окружности

        String path2 = args[1]; //передается путь к файлу 2

        File file2 = new File(path2);
        reader = new Scanner(file2); // считываются числа из файла 2
        while(reader.hasNext()) {
            float x = Float.parseFloat(reader.next()); // координата х точки
            float y = Float.parseFloat(reader.next()); // координата у точки
            printResult(x0, y0, r, x, y);

        }

        reader.close();
    }

    /*
    метод для вывода результатов
    2 - точка снаружи, 1 - внутри, 0 - лежит на окружности
     */

    public static void printResult(float x0, float y0, float r, float x, float y) {
        float result = (pow(x - x0) + pow(y - y0));
        if (result > pow(r)) {
            System.out.println(2);
        } else if (result == pow(r)) {
            System.out.println(0);
        } else System.out.println(1);
    }


    /*
    метод для возведения числа в квадрат
    */

    public static float pow(float x) {
        return x * x;
    }

}
