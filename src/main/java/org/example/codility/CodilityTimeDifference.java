package org.example.codility;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class CodilityTimeDifference {

    public static void main(String[] args){
        String E = "10:30", L="13:31";
        String[] E1 = E.split(":");
        String[] L1 = L.split(":");
        int min = 0,hour=0;
        if(Integer.parseInt(L1[1])>=Integer.parseInt(E1[1])){
            min = Integer.parseInt(L1[1])-Integer.parseInt(E1[1]);
            hour = Integer.parseInt(L1[0])-Integer.parseInt(E1[0]);
        }else{
            min = Integer.parseInt(L1[1]+60);
            hour= Integer.parseInt(L1[0])-1;
            hour = hour-Integer.parseInt(E1[0]);
            min = min - Integer.parseInt(E1[1]);
        }
        System.out.println("HH:MM: "+hour+":"+min);
        int totprice = 2+3+4*3;
        if(hour<=0 && min>0){
            totprice = 2+3;
        }else if(hour==1 && min==0 ){
            totprice = 2+3;
        }else if(hour>0 && min>0){
            totprice = 2+3+4*(hour);
        }
        System.out.println("totprice: "+totprice);
    }
}
