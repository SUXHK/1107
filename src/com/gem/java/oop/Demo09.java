package com.gem.java.oop;

public class Demo09 {
	public static void main(String[] args) {
		int[] arr = {5,10,27,19,30};
		/*
		//1.����ĳ���
		int len = arr.length;
		System.out.println("����ĳ���Ϊ��"+len);
		*/
		/*
		//2.ͨ��������±���Ի�ȡ��Ӧ����λ���ϵ�Ԫ��ֵ���߸���Ӧλ�ø�ֵ
		int num = arr[1];
		System.out.println(num);
		arr[2] = 99 ;
		*/
		
		//3.����ͨ��ѭ������һ������
		for(int i = 0 ; i<arr.length;i++ ){
			int num = arr[i];
			System.out.println(num);
		}
	}
}
