package ARRAY;

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

    static int maxelement(int arr[]){
        int max = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
    // homework -> Math.max()



















    public static void main(String[] args) {

       int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
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
        System.out.println(maxelement(arr));

    }
}