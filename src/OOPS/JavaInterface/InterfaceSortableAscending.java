// Sortable Interface with Sorting Algorithms
//
// Problem: Write a Java program to create an interface Sortable with a method sort() that
// sorts an array of integers in ascending order. Create two classes BubbleSort
// and SelectionSort that implement the Sortable interface and provide their own
// implementations of the sort() method.
//
// Sample Output:
// BubbleSort Result: [1, 2, 3, 4, 5]
// SelectionSort Result: [1, 2, 3, 4, 5]

package OOPS.JavaInterface;

import java.util.Arrays;

interface Sortable {
    int[] sort(int[] array);
}

class BubbleSort implements Sortable {
    @Override
    public int[] sort(int[] array) {
        int[] arr = array.clone();
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr;
    }
}

class SelectionSort implements Sortable {
    @Override
    public int[] sort(int[] array) {
        int[] arr = array.clone();
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
        return arr;
    }
}

public class InterfaceSortableAscending {
    public static void main(String[] args) {
        int[] originalArray = {5, 2, 8, 1, 9};
        
        BubbleSort avdeshBubbleSort = new BubbleSort();
        SelectionSort amanSelectionSort = new SelectionSort();
        
        int[] bubbleSorted = avdeshBubbleSort.sort(originalArray);
        int[] selectionSorted = amanSelectionSort.sort(originalArray);
        
        System.out.println("BubbleSort Result: " + Arrays.toString(bubbleSorted));
        System.out.println("SelectionSort Result: " + Arrays.toString(selectionSorted));
    }
}