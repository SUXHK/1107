package com.gem.java.oop;

import java.util.Scanner;

public class Demo10 {
	public static void main(String[] args) {
		int[] scoreArr = new int[5];
		Scanner input = new Scanner(System.in);
		for (int i = 0; i < scoreArr.length; i++) {
			System.out.print("�������"+(i+1)+"λͬѧ�ĳɼ���");
			scoreArr[i] = input.nextInt();
		}
		System.out.println("¼����������ڷ���.....");
		
		//1.������߷�Ϊ��һ��ͬѧ�ĳɼ�
		int max = scoreArr[0];
		//2.������ͷ�Ϊ��һ��ͬѧ�ĳɼ�
		int min = scoreArr[0];
		//3.����ƽ����Ϊ0
		int avg = 0 ;
		
		int sum = 0 ;
		for (int i = 0; i < scoreArr.length; i++) {
			if(scoreArr[i]<min){
				min = scoreArr[i];
			}
			if(scoreArr[i]>max){
				max = scoreArr[i];
			}
			sum = sum + scoreArr[i];
		}
		
		avg = sum / scoreArr.length ;
		
		
		System.out.println("��߷��ǣ�"+max);
		System.out.println("��ͷ��ǣ�"+min);
		System.out.println("ƽ�����ǣ�"+avg);
	}
}

/*
�������1λͬѧ�ĳɼ���75
�������2λͬѧ�ĳɼ���71
�������3λͬѧ�ĳɼ���83
�������4λͬѧ�ĳɼ���90
�������5λͬѧ�ĳɼ���69

��߷��ǣ�90
��ͷ��ǣ�69
ƽ����Ϊ��77
*/