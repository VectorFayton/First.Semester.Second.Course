package Optimization_Of_Sorting;

import java.util.Arrays;
import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class SortComparison {
    public static void main(String[] args) {
        int[] array = new int[5];
        Random random = new Random();
        IntStream.range(0, 5).forEach(index -> array[index] = random.nextInt(100));
        PrintArray(array);
        OptimizedBubbleSort(array);
    }

    public static void SelectionSort(int[] array){
        for(int i = 0; i < array.length; i++){
            for (int j = 0; j < array.length; j++){

            }
        }

    }

    public static void BubbleSort(int[] array){
        boolean condition = true;
        while (condition) {
            condition = false;
            for (int j = 1; j < array.length; j++) {
                if (array[j] < array[j - 1]) {
                    int value = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = value;
                    condition = true;
                }
            }
        }
        PrintArray(array);
    }

    public static void OptimizedSelectionSort(int[] array){

    }

    public static void OptimizedBubbleSort(int[] array){
        boolean condition = true;
        while (condition) {
            condition = false;
            for (int j = 1; j < array.length; j++) {
                if (array[j] < array[j - 1]) {
                    int value = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = value;
                    condition = true;
                }
                PrintArray(array);
            }
        }
        PrintArray(array);
    }
    public static void PrintArray(int[] array){
        for (int values:array) {
            System.out.print(values + ", ");
        }
        System.out.println();
    }
}
