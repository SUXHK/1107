package com.gem.java.oop;

import java.util.Scanner;

public class Demo17 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("请输入第一个数：");
		int num1 = input.nextInt() ;
		System.out.print("请输入第二个数：");
		int num2 = input.nextInt() ;
		
		//假设输入的分别为1,2。则调用一个方法，要求输出：1+2=3
		Demo17 d = new Demo17();
		d.add(num1,num2);
	}
	
	void add(int num1 , int num2){
		System.out.println(num1 + "+" + num2 + "=" + (num1 + num2 ));
	}
	
}
