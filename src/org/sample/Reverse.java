package org.sample;

public class Reverse {

	
	public static void main(String[] args) {
		int num = 13456;
	   int i=0,j=0,a=0;
	   
	   
	   a=num;
	   while (a>0) {
		   
		   i=a%10;
		   j=(j*10)+i;
		   a=a/10;
		   
	   }
	   System.out.println(j);
	   }
	}
