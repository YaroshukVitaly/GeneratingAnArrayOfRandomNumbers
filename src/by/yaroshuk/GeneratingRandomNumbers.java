package by.yaroshuk;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class GeneratingRandomNumbers {

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            int[] array = generateRandomIntArray(24, 100);
            int min = findMinimum(array);

            System.out.println(Arrays.toString(array));
            System.out.println("min = " + min);
            System.out.println();
        }

    }

    private static int[] generateRandomIntArray(int arrayLength, int upperBound) {
        int [] array = new int[arrayLength];
        Random random = new Random();
        for (int i = 0; i < array.length ; i++) {
            array [i] = random.nextInt(upperBound);
        }
        return array;
    }
    private static int findMinimum(int[] array){
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (min > array[i]){
                min = array[i];
            }
        }
        return min;
    }
}
