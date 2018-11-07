package com.gem.java.oop;

public class Demo02 {
	public static void main(String[] args) {
		int i = 1 ;
		while(i<=9){
			int j = 1 ;
			while(j<=i){
				System.out.print(i+"*"+j+"="+(i*j)+"\t");
				j++;
			}
			System.out.println();
			i++;
		}
	}
}
/*

1*1=1
2*1=2	2*2=4
3*1=3	3*2=6	3*3=9
4*1=4	4*2=8	4*3=12	4*4=16
....................................
9*1=9	............................	9*9=81


*/