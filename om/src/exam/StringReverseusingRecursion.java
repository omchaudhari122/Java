package exam;

import exam.StringReverseusingRecursion;

public class StringReverseusingRecursion {
	
	
	    String x="Om Chaudhari";
	    char[] y=x.toCharArray();
	    int i,j;

	    void reverse(){
	        for(int i = y.length - 1; i >= 0; i--) {
	            System.out.print(y[i]);
	        }
	    }

	    public static void main(String[] args) {
	    	StringReverseusingRecursion string = new StringReverseusingRecursion();
	        string.reverse();
	    }
	}



