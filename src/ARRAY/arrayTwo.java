package ARRAY;

import java.util.Arrays;
import java.util.HashMap;

public class arrayTwo {

    static int[] reverseArray(int arr[]) {
        int i = 0, n = arr.length;
        int j = n - 1;
        int temp = 0;

        while (i <= j) {
            temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        for (int k : arr) {
            System.out.print(k + " ");
        }
        return arr;
    }

    static int[] shiftArraybyOne(int arr[]){
        int n = arr.length;
        int temp = arr[n-1];
        for (int i = n-1; i>0 ; i--) {
                arr[i] = arr[i-1];
        }
        arr[0] = temp;

        for (int k:arr){
            System.out.print(k+" ");
        }

        return arr;

    }

    static void printAlternate(int[] arr){
        int n = arr.length;
        int i = 0, j = n-1;
        while (i <= j){
            if(i==j){
                System.out.println(arr[i]);
                return;
            }else{
                System.out.println(arr[i]);
                i++;
                System.out.println(arr[j]);
                j--;
            }
        }
    }

    static int modeOfArray (int arr[]){
        HashMap<Integer, Integer> freq = new HashMap<>();

        for(int num:arr){
            freq.put(num,freq.getOrDefault(num,0 ) + 1);

        }
//        for(int i:freq.keySet()){
//            System.out.println(i+" -> "+freq.get(i));
//        }
        int maxFreq = -1;
        int maxFreqWaliKey = -1;
        for(int key:freq.keySet()){
            int currentKey = key;
            int currentKeyKiFrequency = freq.get(key);
            if(currentKeyKiFrequency > maxFreq){
                maxFreq = currentKeyKiFrequency;
                maxFreqWaliKey = currentKey;
            }
        }
        System.out.println(maxFreqWaliKey);
        return maxFreqWaliKey;
    }

    static int[] getHighestLowestFreqElement(int[] arr){
        HashMap<Integer,Integer> freq = new HashMap<>();
        for(int num:arr){
            freq.put(num,freq.getOrDefault(num,0) + 1);
        }
        //hashmap is ready
        int highestFreq = Integer.MIN_VALUE;
        int highestNum = -1;
        for(int key:freq.keySet()){
            int currentKey = key;
            int currentFrequency = freq.get(key);
            if(currentFrequency > highestFreq){
                // highest ko update karna chahiye
                highestFreq = currentFrequency;
                highestNum = currentKey;

            }
        }

int lowestfreq = Integer.MAX_VALUE;
        int lowestNum = -1;
        for(int key:freq.keySet()){
            int currentKey = key;
            int currentFrequency = freq.get(key);
            if(currentFrequency < lowestfreq){
                lowestfreq = currentFrequency;
                lowestNum = currentKey;
            }
        }

        int ans[]={highestFreq,lowestfreq};
        return ans;


    }

















    public static void main(String[] args) {

        int arr[] = {1, 2,2,2,2,2,2,4,5,6,6,7,7,1,1, 3, 4, 5};
//        reverseArray(arr);
//        shiftArraybyOne(arr);

//        printAlternate(arr);
//            modeOfArray(arr);

        int ans[]=getHighestLowestFreqElement(arr);
        System.out.println("Highest frequency wala num "+ ans[0]);
        System.out.println("Lowest frequency wala num "+ ans[1]);




    }
}


