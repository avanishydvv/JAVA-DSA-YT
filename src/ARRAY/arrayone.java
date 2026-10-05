package ARRAY;

import java.util.Arrays;

public class arrayone {

    // To find the average of all elements of array
    static double getAverage(int[] arr) {
        double sum = 0;

        for (int i : arr) {
            sum += i;
        }

        int size = arr.length;
        double avg = sum / size;

        return avg;
    }

    // To multiply every element by 10
    static int[] multiplybyten(int[] arr) {
        int size = arr.length;
        int[] newArray = new int[size];

        for (int i = 0; i < size; i++) {
            int element = arr[i];
            int newElement = element * 10;
            newArray[i] = newElement;
        }

        // Return updated array
        return newArray;
    }

    // To search an element in the array
    static boolean searchElement(int[] arr, int key) {
        int size = arr.length;

        for (int i = 0; i < size; i++) {

            if (arr[i] == key) {
                return true;
            }
        }

        // Element not found
        return false;
    }

    static int maxelement(int arr[]) {
        int max = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
    // homework -> Math.max()

    static int[] sumOfPosandNegative(int arr[]) {
        int size = arr.length;
        int positiveSum = 0;
        int negativeSum = 0;
        for (int i = 0; i < size; i++) {
            if (arr[i] > 0) {
                positiveSum += arr[i];
            } else {
                negativeSum += arr[i];
            }
        }
        int ans[] = {positiveSum, negativeSum};
        return ans;
    }

    static int[] CountZeroOne(int arr[]) {
        int ZeroSum = 0;
        int onecount = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                ZeroSum++;
            } else {
                onecount++;
            }
        }
        int ans[] = {ZeroSum, onecount};
        return ans;
    }

    static int UnsortedElement(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i+1]<=arr[i]){
                return arr[i+1];
            }
        }
            return -1;

    }



















    public static void main(String[] args) {

//       int[] arr = {1, 2, -3, 4, -5, 6, 7, -8, 9};
//
//        // Average
//        System.out.println("Average = " + getAverage(arr));
//
//        // Multiply every element by 10
//        int[] ans = multiplybyten(arr);
//
//        System.out.println("Array after multiplying by 10:");
//
//        for (int i : ans) {
//            System.out.println(i);
//        }

        // Search element
//        boolean searchResult = searchElement(arr, 9);
//
//        System.out.println("Element found = " + searchResult);
//        System.out.println(maxelement(arr));
//        int ans[] = sumOfPosandNegative(arr);
//        System.out.println("PositiveSum: "+ans[0]);
//        System.out.println("NegativeSum: "+ans[1]);
//        int arr[]={0,1,0,1,1,1,1,0,1,0,0,1};
//        int ans[]= CountZeroOne(arr);
//        System.out.println("CountZero: "+ans[0]);
//        System.out.println("CountOnes: "+ans[1]);

        int arr[]={1,2,5,4,9};
        System.out.println(UnsortedElement(arr));


    }
}