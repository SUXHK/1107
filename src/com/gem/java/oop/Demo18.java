package com.gem.java.oop;

import java.util.Scanner;

public class Demo18 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("请输入第一个数：");
		int num1 = input.nextInt() ;
		System.out.print("请输入第二个数：");
		int num2 = input.nextInt() ;
		System.out.print("请输入第三个数：");
		int num3 = input.nextInt() ;
		
		//假设输入的分别为1,3,5。则调用一个方法，要求输出：1+3+5=4+5=9
		Demo18 d = new Demo18();
		//1+3+5+7+9->4+5+7+9->9+7+9->16+9=25		--> 两数相加的结果用于再运算
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
