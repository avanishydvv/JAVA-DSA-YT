
package ARRAY;

import java.util.Arrays;

public class arrayThre {

    static int[] onesSorted(int arr[]) {
        int n = arr.length;
        int i = 0;
        int j = n - 1;

        while (i < j) {

            if (arr[i] == 0) {
                i++;
            } else if (arr[j] == 1) {
                j--;
            } else {
                // Swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;

                i++;
                j--;
            }
        }

        return arr;
    }

    public static void main(String[] args) {
        int arr[] = {1, 0, 1, 0, 0, 0, 1, 1, 1, 0, 0, 1};

        System.out.println(Arrays.toString(onesSorted(arr)));
    }
}
