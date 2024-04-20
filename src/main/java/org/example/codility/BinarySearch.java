package org.example.codility;

public class BinarySearch {

    public static void main(String[] args){
        int[] arr = {10,13,23,45,51,56,76};
        int startIndex = 0,endIndex=arr.length-1,midIndex=0;
        int n=56;
        int actualIndex=-1;
        while(startIndex<endIndex){
            midIndex=(startIndex+endIndex)/2;

            if(arr[midIndex]==n){
                actualIndex=midIndex;
                break;
            }

            if(arr[midIndex]<n){
                startIndex = midIndex+1;
            }
            if(arr[midIndex]>n){
                endIndex = midIndex-1;
            }
        }
        System.out.println("actualIndex: "+actualIndex);

    }
}
