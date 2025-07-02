package firstChapter;

import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        int[] digits = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        Scanner input = new Scanner(System.in);

        System.out.println(binarySearch(digits, input.nextInt()));
    }

    static int binarySearch(int[] array, int target) {
        int low = 0;
        int high = array.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (array[mid] == target) {
                return mid;
            }
            if (array[mid] < target) {
                low = mid + 1;
            }
            else {
                high = mid - 1;
            }
        }
        return 0;
    }
}