package Optimization_Of_Sorting;

import java.util.Arrays;
import java.util.Random;
import java.util.stream.IntStream;

public class SortComparison {
    public static void main(String[] args) {
        long start = System.nanoTime();
        int[] array = new int[10];
        Random random = new Random();
        IntStream.range(0, 10).forEach(index -> array[index] = random.nextInt(1000));
        PrintArray(array);
        BubbleSort(array);
//        SelectionSort(array);
//        OptimizedBubbleSort(array);
//        Arrays.sort(array);
//        PrintArray(array);
//        QuickSort(array, 0, array.length - 1);
//        PrintArray(array);
//        Arrays.toString(array);
        long finish = System.nanoTime();
        long runtime = finish - start;
        System.out.println("Compiling for: " + runtime + " nanoSec");
    }

    public static void OptimizedSelectionSort(int[] array){
        for(int i = 0; i < array.length; i++){
            int index = i;
            for (int j = i + 1; j < array.length; j++){
                if (array[index] > array[j]){
                    index = j;
                }
            }
            Swap(array, index, i);
        }
        PrintArray(array);
    }

    public static void BubbleSort(int[] array){
        boolean condition = true;
        while (condition) {
            condition = false;
            for (int j = 1; j < array.length; j++) {
                if (array[j] < array[j - 1]) {
                    Swap(array, j - 1, j);
                    condition = true;
                }
            }
        }
        PrintArray(array);
    }

    public static void OptimizedBubbleSort(int[] array){
        boolean condition = true;
        while (condition) {
            condition = false;
            for (int j = 1; j < array.length; j++) {
                if (array[j] < array[j - 1]) {
                    Swap(array, j - 1, j);
                    condition = true;
                }
//                PrintArray(array);
            }
            if (!condition){
                break;
            }
            for (int k = array.length - 1; k == 0; k--) {
                if (array[k] > array[k - 1]) {
                    Swap(array, k - 1, k);
                    condition = true;
                }
//                PrintArray(array);
            }
        }
        PrintArray(array);
    }

    public static void QuickSort(int[] array, int low, int high) {
        if (array.length == 0)
            return;

        if (low >= high)
            return;


        int middle = low + (high - low) / 2;
        int opora = array[middle];

        int i = low, j = high;
        while (i <= j) {
            while (array[i] < opora) {
                i++;
            }

            while (array[j] > opora) {
                j--;
            }

            if (i <= j) {
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                i++;
                j--;
            }
        }

        if (low < j)
            QuickSort(array, low, j);

        if (high > i)
            QuickSort(array, i, high);
    }
    public static void PrintArray(int[] array){
        for (int values:array) {
            System.out.print(values + ", ");
        }
        System.out.println();
    }

    public static void Swap(int[] array, int index, int index_swapped){
        int value = array[index];
        array[index] = array[index_swapped];
        array[index_swapped] = value;
    }
}
// Вывод и анализ в дополнительных прикрепленный файлах
