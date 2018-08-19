package by.yaroshuk;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class GeneratingRandomNumbers {

    public static void main(String[] args) {
       int [] array = new int[10];
        Random random = new Random();
        for (int i = 0; i < array.length ; i++) {
            array [i] = random.nextInt(100);
        }
        System.out.println(Arrays.toString(array));


    }
}
