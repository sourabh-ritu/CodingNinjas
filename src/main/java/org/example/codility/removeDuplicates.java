package org.example.codility;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class removeDuplicates {

    public static void main(String[] args){
        int[] arr = {2,1,4,3,4};
        Arrays.sort(arr);
        int[] newarr = new int[arr.length];
        int j=0;
        for(int i=0;i<arr.length;i++){
            if(i>0 && arr[i]==arr[i-1]){
                continue;
            }else{
                newarr[j]=arr[i];
                j++;
            }
        }

        for (int k=0;k<newarr.length;k++){
            System.out.println(newarr[k]);
        }

    }
}
