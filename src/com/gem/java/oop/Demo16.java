package com.gem.java.oop;

import java.util.Scanner;

public class Demo16 {
	public static void main(String[] args) {
		Demo16 d = new Demo16();
		d.add();
	}
	//���һ������
	void add(){
		Scanner input = new Scanner(System.in);
		System.out.print("�������һ������");
		int num1 = input.nextInt() ;
		System.out.print("������ڶ�������");
		int num2 = input.nextInt() ;
		int result = num1  + num2 ;
		System.out.println(num1 + " + " + num2 + " = " + result );
	}
}
/*
�������һ������5
������ڶ�������6
5+6=11
*/
