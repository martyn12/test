package com.gmail.martyn1201;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {

        File file = new File(args[0]);                 //args[0] - путь к файлу
        Scanner reader = new Scanner(file);

        ArrayList<Integer> list = new ArrayList<>();
        while (reader.hasNextInt()) {
            list.add(reader.nextInt());                //записываем их в лист
        }
        reader.close();

        int[] nums = new int[list.size()];              // из листа переписываем
        for (int i = 0; i < list.size(); i++) {         // в
            nums[i] = list.get(i);                      // массив
        }

        int sum = 0;
        for(int x: nums) {
            sum += x;
        }

        int avg = (int) Math.round((double) sum / (double) nums.length); //находим среднее значение, для приведения к которому и считаем шаги

        System.out.println(avg);

        int count = 0;                                  //count - количество шагов

        for(int i = 0; i < nums.length; i++) {          //в цикле считаем количество шагов для каждого отдельного значения
            while(nums[i] > avg) {                      //и суммируем эти значения
                nums[i]--;
                count++;
            }
            while(nums[i] < avg) {
                nums[i]++;
                count++;
            }
        }

        System.out.println(count);
    }
}


