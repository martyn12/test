package com.gmail.martyn1201;

import java.util.ArrayList;
import java.util.List;

public class Main {

    /*
    метод, выводящий путь в круговом массиве, двигаясь по которому с интервалом m,
    концом будет являться первый элемент
     */

    // n - длина массива, т.е массив от 1 до n
    // m - длина обхода
    // nextIn - следующее в обходе число

    public static void main(String[] args) {

        int n = Integer.parseInt(args[0]);
        int m = Integer.parseInt(args[1]);
        int i = 1; // начало массива
        int nextIn = 0;
        List<Integer> list = new ArrayList<>();
        list.add(i);
        while(nextIn != 1) {              // цикл для получения пути
            nextIn = 1 + (i + m - 2) % n; // следующее число в пути
            i = nextIn;
            list.add(nextIn);             // число записывается в лист
        }
        for(int x = 0; x < list.size() - 1; x++) { // вывод на печать каждого элемента листа, кроме
            System.out.print(list.get(x));         // последнего, т.к. последний элемент равен первому
        }
    }

}
