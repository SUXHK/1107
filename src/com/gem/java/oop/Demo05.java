package com.gem.java.oop;

import java.util.Scanner;

public class Demo05 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("�������кţ�");
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
�������кţ�5
*
***
*****
*******
*********

�к�			�ո���		�Ǻ���
1			4			1
2			3			3
3			2			5
i			5-i			2*i-1

*/