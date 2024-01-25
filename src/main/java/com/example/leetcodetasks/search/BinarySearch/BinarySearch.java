package com.example.leetcodetasks.search.BinarySearch;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 10, 12, 13, 15, 16};
        System.out.println(findNumber(arr, 9));

    }

    public static int findNumber (int[] arr, int value){
        int low = 0;
        int high = arr.length -1;


        while(low <= high){
            int middle = (low + high) / 2;
            if(value < arr[middle]){
                high = middle - 1;
            }
            else if(value > arr[middle]){
                low = middle + 1;
            }
            else{
                return middle;
            }
        }
        return -1;
    }
}
