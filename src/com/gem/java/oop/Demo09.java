package com.gem.java.oop;

public class Demo09 {
	public static void main(String[] args) {
		int[] arr = {5,10,27,19,30};
		/*
		//1.数组的长度
		int len = arr.length;
		System.out.println("数组的长度为："+len);
		*/
		/*
		//2.通过数组的下标可以获取对应索引位置上的元素值或者给对应位置赋值
		int num = arr[1];
		System.out.println(num);
		arr[2] = 99 ;
		*/
		
		//3.可以通过循环迭代一个数组
		for(int i = 0 ; i<arr.length;i++ ){
			int num = arr[i];
			System.out.println(num);
		}
	}
}
