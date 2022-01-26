package com.gmail.martyn1201;

import java.io.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        System.out.println("Путь к файлу 1:"); //считываем с клавиатуры путь к файлу 1
        File file1 = new File(sc.nextLine());
        sc = new Scanner(file1); // считываем числа из файла 1

        int x0 = sc.nextInt(); // координата х центра окружности
        int y0 = sc.nextInt(); // координата у центра окружности
        int r = sc.nextInt(); // радиус окружности

        sc.close();

        Scanner sc2 = new Scanner(System.in);
        System.out.println("Путь к файлу 2:"); //считываем с клавиатуры путь к файлу 1
        File file2 = new File(sc2.nextLine());
        sc2 = new Scanner(file2); // считываем числа из файла 2
        int x = sc2.nextInt(); // координата х точки
        int y = sc2.nextInt(); // координата у точки

        sc2.close();

        int result = pow(x - x0) + pow(y - y0); //решаем неравенство (х-х0)^2 + (y-y0)^2 = R^2
        if(result > pow(r)) {
            System.out.println(2);                    //2 - точка снаружи, 1 - внутри, 0 - лежит на окружности
        }
        else if (result == pow(r)) {
            System.out.println(0);
        }
        else System.out.println(1);

    }

    /*
    метод для возведения числа в квадрат
     */
    public static int pow(int x) {
        return x * x;
    }

}
