package reverse;

import java.util.Scanner;

public class ReverseString {
    String x="DYPATILCOLLEGE";
    char[] y=x.toCharArray();
    int i,j;

    void reverse(){
        for(int i = y.length - 1; i >= 0; i--) {
            
            System.out.print(y[i]);
        }
    }

    public static void main(String[] args) {
        ReverseString obj = new ReverseString();
        obj.reverse();
    }
}
