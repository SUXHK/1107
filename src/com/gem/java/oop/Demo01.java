package com.gem.java.oop;

import java.util.Scanner;

public class Demo01 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("������һ�����֣�");
		int num = input.nextInt() ;
		int sum = 0 ;
		/*
		int i = 1 ;
		while(i<=num){
			sum = sum + i ;
			System.out.print(i+ (i==num ? "=" : "+" ) );
			i++;
		}
		*/
		int i = 0 ;
		while(i++<num){
			sum = sum + i ;
			System.out.print(i+ (i==num ? "=" : "+" ) );
		}
		
		
		System.out.print(sum);
		
	}
}
/*
������һ�����֣�20
1+2+3+4+...+20=...


*/