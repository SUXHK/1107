package com.gem.java.oop;

import java.util.Scanner;

public class Demo03 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("������һ������:");
		int num = input.nextInt() ;
		
		boolean flag = true ;//Ĭ����Ϊ��������
		int i = 2 ;
		while(i<num){
			if(num%i==0){
				flag = false ;
				break;
			}
			
			i++;
		}
		
		System.out.println(num + (flag ? "" : "��") + "��һ������!");
	}
}

/*

������һ������23
23��һ��������

������һ������24
24����һ��������

������ֻ�ܱ�1������������


*/