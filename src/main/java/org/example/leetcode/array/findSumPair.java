package org.example.leetcode.array;

import java.util.Arrays;

public class findSumPair {

    public static void main(String[] args){
        int[] arr = {1,3,5,13,20};
        int target=23;
        int[] req = new int[2];
        int[] newarr = Arrays.copyOf(arr,arr.length);
        Arrays.sort(newarr);
        int i=0,j=newarr.length-1;
        while(i<j){
            if(newarr[i]+newarr[j]==target){
                req[0]= newarr[i];
                req[1]= newarr[j];
                break;
            }else if(newarr[i]+newarr[j]>target){
                j--;
            }else{
                i++;
            }
        }
        System.out.println(newarr[i]+" "+newarr[j]);

    }
}
