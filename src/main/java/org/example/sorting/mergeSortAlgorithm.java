package org.example.sorting;

public class mergeSortAlgorithm {

    public static void main(String[] args){

        int[] arr = {21,10,32,4};

    }

    public static void mergeSort(int[] arr,int l,int r){
        if(l<r) {
            int mi = (l + (r-1)) / 2;

            mergeSort(arr, l, mi - 1);
            mergeSort(arr, mi, r);
            mergeSortedArray(arr,l,mi,r);
        }
    }

    private static void mergeSortedArray(int[] arr, int l, int mi, int r) {

    }
}
