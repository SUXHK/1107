package com.gem.java.oop;

import java.util.Scanner;

public class Demo17 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("�������һ������");
		int num1 = input.nextInt() ;
		System.out.print("������ڶ�������");
		int num2 = input.nextInt() ;
		
		//��������ķֱ�Ϊ1,2�������һ��������Ҫ�������1+2=3
		Demo17 d = new Demo17();
		d.add(num1,num2);
	}
	
	void add(int num1 , int num2){
		System.out.println(num1 + "+" + num2 + "=" + (num1 + num2 ));
	}
	
}
