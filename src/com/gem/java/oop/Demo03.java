package com.gem.java.oop;

import java.util.Scanner;

public class Demo03 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("请输入一个数字:");
		int num = input.nextInt() ;
		
		boolean flag = true ;//默认认为你是质数
		int i = 2 ;
		while(i<num){
			if(num%i==0){
				flag = false ;
				break;
			}
			
			i++;
		}
		
		System.out.println(num + (flag ? "" : "不") + "是一个质数!");
	}
}

/*

请输入一个数：23
23是一个质数！

请输入一个数：24
24不是一个质数！

质数：只能被1和它本身整除


*/