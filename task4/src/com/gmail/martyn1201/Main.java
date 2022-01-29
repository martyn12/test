package com.gmail.martyn1201;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    /*
    метод для подсчета количества ходов для приведения всех элементов массива к одному числу

    filePath - путь к файлу, из которого передаются числа для массива

     */

    public static void main(String[] args) throws FileNotFoundException {

        String filePath = args[0];

        File file = new File(filePath);
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

        /*
        алгоритм поиска числа, к которому нужно привести каждое число в массиве.
         */

        int avg;
        Arrays.sort(nums);
        if(nums.length % 2 == 0) {
            avg = (nums[nums.length / 2] + nums[nums.length / 2 - 1]) / 2;
        }
        else avg = (nums[nums.length / 2]);


        int count = 0;                                  //count - количество ходов

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


