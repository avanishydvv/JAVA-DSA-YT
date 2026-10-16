
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

    static int missingElement(int[] arr) {

        int n=arr.length;
        int xorSum=0;
        //xor with all the array element
        for (int i : arr) {
            xorSum = xorSum ^ i;
        }
        // xor with all the element in the range

        for(int j=0;j<=n;j++) {
            xorSum = xorSum ^ j;
        }
        return xorSum;

    }



















    public static void main(String[] args) {
        //int arr[] = {1, 0, 1, 0, 0, 0, 1, 1, 1, 0, 0, 1};

        //System.out.println(Arrays.toString(onesSorted(arr)));

        int arr[]={1,5,6,8,2,4,7};

        System.out.println(missingElement(arr));


    }
}
