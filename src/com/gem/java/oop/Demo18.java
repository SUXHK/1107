package com.gem.java.oop;

import java.util.Scanner;

public class Demo18 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("�������һ������");
		int num1 = input.nextInt() ;
		System.out.print("������ڶ�������");
		int num2 = input.nextInt() ;
		System.out.print("���������������");
		int num3 = input.nextInt() ;
		
		//��������ķֱ�Ϊ1,3,5�������һ��������Ҫ�������1+3+5=4+5=9
		Demo18 d = new Demo18();
		//1+3+5+7+9->4+5+7+9->9+7+9->16+9=25		--> ������ӵĽ������������
		/*
		int result = d.add(num1, num2);
		int result2 = d.add(result, num3);
		System.out.println(result2);
		*/
		System.out.println(d.add(d.add(num1, num2), num3));
	}
	
	int add(int num1 , int num2 ){
		return num1 + num2 ;
	}
}
