package com.gem.java.oop;

import java.util.Scanner;

public class Demo04 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("������һ�����֣�");
		int num = input.nextInt() ;
		if(num<2){
			System.out.println("�Բ�������Ƿ���");
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

������һ�����֣�1
�Բ�������Ƿ�����Ϊ��С������Ϊ2��

������һ�����֣�200
1-200���ڵ��������£�
2	3	5	7	11	13	17	19	...........

*/