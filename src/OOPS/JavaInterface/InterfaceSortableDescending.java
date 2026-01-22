// Sortable Interface with Descending Order Sorting
//
// Problem: Write a Java program to create an interface Sortable with a method sort(int[] array)
// that sorts an array of integers in descending order. Create two classes QuickSort and
// MergeSort that implement the Sortable interface and provide their own implementations
// of the sort() method.
//
// Sample Output:
// QuickSort Result: [9, 7, 5, 3, 1]
// MergeSort Result: [9, 7, 5, 3, 1]

package OOPS.JavaInterface;

import java.util.Arrays;

interface SortableDescending {
    int[] sort(int[] array);
}

class QuickSort implements SortableDescending {
    @Override
    public int[] sort(int[] array) {
        int[] arr = array.clone();
        quickSort(arr, 0, arr.length - 1);
        return arr;
    }
    
    private void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }
    
    private int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = (low - 1);
        
        for (int j = low; j < high; j++) {
            if (arr[j] >= pivot) { // >= for descending order
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;
        
        return i + 1;
    }
}

class MergeSort implements SortableDescending {
    @Override
    public int[] sort(int[] array) {
        int[] arr = array.clone();
        mergeSort(arr, 0, arr.length - 1);
        return arr;
    }
    
    private void mergeSort(int[] arr, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;
            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);
            merge(arr, left, mid, right);
        }
    }
    
    private void merge(int[] arr, int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;
        
        int[] leftArr = new int[n1];
        int[] rightArr = new int[n2];
        
        for (int i = 0; i < n1; i++) {
            leftArr[i] = arr[left + i];
        }
        for (int j = 0; j < n2; j++) {
            rightArr[j] = arr[mid + 1 + j];
        }
        
        int i = 0, j = 0, k = left;
        
        while (i < n1 && j < n2) {
            if (leftArr[i] >= rightArr[j]) { // >= for descending order
                arr[k] = leftArr[i];
                i++;
            } else {
                arr[k] = rightArr[j];
                j++;
            }
            k++;
        }
        
        while (i < n1) {
            arr[k] = leftArr[i];
            i++;
            k++;
        }
        
        while (j < n2) {
            arr[k] = rightArr[j];
            j++;
            k++;
        }
    }
}

public class InterfaceSortableDescending {
    public static void main(String[] args) {
        int[] originalArray = {1, 3, 5, 7, 9};
        
        QuickSort avdeshQuickSort = new QuickSort();
        MergeSort amanMergeSort = new MergeSort();
        
        int[] quickSorted = avdeshQuickSort.sort(originalArray);
        int[] mergeSorted = amanMergeSort.sort(originalArray);
        
        System.out.println("QuickSort Result: " + Arrays.toString(quickSorted));
        System.out.println("MergeSort Result: " + Arrays.toString(mergeSorted));
    }
}