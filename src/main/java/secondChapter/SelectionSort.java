package secondChapter;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] array = {2, 4, 6, 1, 5, 7, 9, 10, 3, 21, 14, 8};

        System.out.println(Arrays.toString(array));

        selectionSort(array);

        System.out.println(Arrays.toString(array));
    }

    public static void selectionSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int min = i;

            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[min]) {
                    min = j;
                }
            }
            int temp = array[i];
            array[i] = array[min];
            array[min] = temp;
        }
    }
}
