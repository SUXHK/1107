package com.gem.java.oop;

import java.util.Scanner;

public class Demo04 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("请输入一个数字：");
		int num = input.nextInt() ;
		if(num<2){
			System.out.println("对不起，输入非法！");
		}else{
			int i = 2 ;
			while(i<=num){
				boolean flag= true ;
				int j = 2 ;
				while(j<i){
					if(i%j==0){
						flag = false ;
						break;
					}
					j++;
				}
				System.out.print(flag ? (i + "\t") : "");
				i++;
			}
		}
	}
}

/*

请输入一个数字：1
对不起，输入非法，因为最小的质数为2！

请输入一个数字：200
1-200以内的质数如下：
2	3	5	7	11	13	17	19	...........

*/