package org.example.general;

public class HelloWorld extends TestAbstract{

    public static void main(String [] args){
//        StringBuffer stringBuffer = new StringBuffer("str1");
//        System.out.println(stringBuffer.length());
//        StringBuffer strBuffer1 = new StringBuffer("str");
//        StringBuilder stringBuilder = new StringBuilder("strtest");
//        System.out.println(stringBuilder.length());
//        System.out.println(stringBuffer.indexOf("t"));
//        System.out.println(stringBuilder.charAt(6));
//        System.out.println(stringBuffer.compareTo(strBuffer1));
//        String test = "Sourabh";
//        System.out.println(test.endsWith(" "));
//        char[] mytest = test.toCharArray();
//        int i=0;
//        while(i<mytest.length){
//            System.out.println(mytest[i]);
//            i++;
//        }

        //Exceptions checked and Unchecked
        String exceptionChecked = "Sourabh";
        try {
            System.out.println(exceptionChecked.charAt(8));
        }catch(Exception e){
            System.out.println("test");
        }


    }

    @Override
    void makeSound() {
        System.out.println("woo woo");
    }
}
