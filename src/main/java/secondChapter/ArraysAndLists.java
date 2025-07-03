package secondChapter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArraysAndLists {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        List<Integer> list = new ArrayList<>();

        for (int element : array) {
            list.add(element);
        }

        System.out.println("List: " + list);
        System.out.println("Array: " + Arrays.toString(array));
    }
}