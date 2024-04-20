package org.example.codility;

public class ThreeLetters {
    public static void main(String[] args){
        //Write a function in java solution that, given two integers A and B, returns a string containing exactly A letters 'a' and exactly B letters 'b' with no three consecutive letters being the same (in other words, neither "aaa" nor "bbb" may occur in the returned string).
       //String newstr = null;
        StringBuilder strbuild = new StringBuilder();
        int A=5,B=3;
        if(Math.abs(A-B)==2){
            int k=0,h=0;
            if(A>B){
                for (int i=0;i<(A+B);i++){
                  if(k<2) {
                      strbuild.append('a');
                      k++;
                      h=0;
                  }else if(h<2){
                      strbuild.append('b');
                      h++;
                      k=0;
                  }

                }
            } else if (A<B) {
                for (int i = 0; i < (A + B); i++) {
                    if (k < 2) {
                        strbuild.append('b');
                        k++;
                    } else if (h < 2) {
                        strbuild.append('a');
                        h++;
                    }
                    if (k == 2) {
                        k = 0;
                    }
                    if (h == 2) {
                        h = 0;
                    }
                }
            }
        } else if (Math.abs(A-B)==0 || Math.abs(A-B)==1) {
            if(A>B){
                int k=0,h=0;
                for(int i=0;i<A+B;i++){
                    strbuild.append('a');
                }
            }
        } else if (Math.abs(A-B)>=3) {

        }
        System.out.println(strbuild);
    }
}
