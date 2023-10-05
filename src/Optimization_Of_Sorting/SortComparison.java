package Optimization_Of_Sorting;

import java.util.Arrays;
import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class SortComparison {
    public static void main(String[] args) {
        long start = System.nanoTime();
        int[] array = new int[1000];
        Random random = new Random();
        IntStream.range(0, 1000).forEach(index -> array[index] = random.nextInt(1000));
        PrintArray(array);
//        BubbleSort(array);
//        OptimizedBubbleSort(array);
//        Arrays.sort(array);
//        PrintArray(array);
        quickSort(array, 0, array.length - 1);
        long finish = System.nanoTime();
        long runtime = finish - start;
        System.out.println("Compiling for: " + runtime);
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
//                PrintArray(array);
            }
            if (!condition){
                break;
            }
            for (int k = array.length - 1; k == 0; k--) {
                if (array[k] > array[k - 1]) {
                    int value = array[k - 1];
                    array[k - 1] = array[k];
                    array[k] = value;
                    condition = true;
                }
//                PrintArray(array);
            }
        }
        PrintArray(array);
    }

    public static void quickSort(int[] array, int low, int high) {
        if (array.length == 0)
            return;//завершить выполнение, если длина массива равна 0

        if (low >= high)
            return;//завершить выполнение если уже нечего делить

        // выбрать опорный элемент
        int middle = low + (high - low) / 2;
        int opora = array[middle];

        // разделить на подмассивы, который больше и меньше опорного элемента
        int i = low, j = high;
        while (i <= j) {
            while (array[i] < opora) {
                i++;
            }

            while (array[j] > opora) {
                j--;
            }

            if (i <= j) {//меняем местами
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                i++;
                j--;
            }
        }

        // вызов рекурсии для сортировки левой и правой части
        if (low < j)
            quickSort(array, low, j);

        if (high > i)
            quickSort(array, i, high);
    }
    public static void PrintArray(int[] array){
        for (int values:array) {
            System.out.print(values + ", ");
        }
        System.out.println();
    }
}
