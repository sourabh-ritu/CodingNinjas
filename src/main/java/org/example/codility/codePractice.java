package org.example.codility;
import java.sql.SQLOutput;
import java.util.Arrays;
public class codePractice {

    public static void main(String[] args){
        int[] arr = {2,3,1,5};
        Arrays.sort(arr);

        int n = 25;
        int decimal = 20;
        int[] dec = new int[10];
        int i=0;
        while(n>0){
            dec[i]= n%2;
            i++;
            n=n/2;
        }

        for(int j=0;j<dec.length;j++){
            System.out.println(dec[j]);
        }
        int largest = 0,l=0;
        for(int k=0;k<i-1;k++){
            if(dec[k]==1 ){
                int temp = k-(l+1);
                if(temp>largest){
                    largest = temp;
                }
                l=k;
            }
        }
        System.out.println("largets: "+largest);

    }
}
