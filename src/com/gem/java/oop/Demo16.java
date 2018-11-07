package com.gem.java.oop;

import java.util.Scanner;

public class Demo16 {
	public static void main(String[] args) {
		Demo16 d = new Demo16();
		d.add();
	}
	//设计一个方法
	void add(){
		Scanner input = new Scanner(System.in);
		System.out.print("请输入第一个数：");
		int num1 = input.nextInt() ;
		System.out.print("请输入第二个数：");
		int num2 = input.nextInt() ;
		int result = num1  + num2 ;
		System.out.println(num1 + " + " + num2 + " = " + result );
	}
}
/*
请输入第一个数：5
请输入第二个数：6
5+6=11
*/
