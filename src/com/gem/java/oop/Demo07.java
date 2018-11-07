package com.gem.java.oop;

public class Demo07 {
	public static void main(String[] args) {
		//1+2+3+...+10=55
		int i = 1 ;
		int sum = 0 ;
		
		//不管三七二十一，先执行一遍再说
		//do-while至少会执行一次循环主体
		do{
			//循环主体
			sum = sum + i ;
			System.out.print(i+ (i==10 ? "=" : "+"));
			i++;
		}while(i<=10);
		
		System.out.println(sum);
	}
}
/*

for()
while()

do{
}while();


*/