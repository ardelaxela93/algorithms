package sorting;

import java.util.Arrays;

public class QuickSort {

    public static void sort(int[] a, int low, int high) {
        if (low >= high)
            return;

        int pivotIndex = partition(a, low, high);

        sort(a, low, pivotIndex-1);
        sort(a, pivotIndex+1, high);
    }

    private static int partition(int[] a, int low, int high) {
        int pivot = a[high];
        int i = low;

        for (int j = low; j < high-1; j++) {
            if (a[j] < pivot) {
                int aux = a[j];
                a[j] = a[i];
                a[i] = aux;
                i++;
            }
        }

        int aux = a[high];
        a[high] = a[i];
        a[i] = aux;

        return i;
    }

    public static void main(String[] args) {
        int[] array = new int[]{9, 2, 4, 7, 12, 1, 35, 67, 34, 89, 76};
        sort(array, 0, 10);
        System.out.println(Arrays.toString(array));
    }
}
