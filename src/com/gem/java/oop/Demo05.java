package com.gem.java.oop;

import java.util.Scanner;

public class Demo05 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("请输入行号：");
		int line = input.nextInt() ;
		int i = 1 ;
		while(i<=line){
			
			int j = 1 ;
			while(j<=(2*i-1)){
				System.out.print("*");
				j++;
			}
			
			System.out.println();
			i++;
		}
		
	}
}

/*
请输入行号：5
*
***
*****
*******
*********

行号			空格数		星号数
1			4			1
2			3			3
3			2			5
i			5-i			2*i-1

*/