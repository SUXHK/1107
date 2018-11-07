package com.gem.java.oop;

import java.util.Scanner;

public class Demo10 {
	public static void main(String[] args) {
		int[] scoreArr = new int[5];
		Scanner input = new Scanner(System.in);
		for (int i = 0; i < scoreArr.length; i++) {
			System.out.print("请输入第"+(i+1)+"位同学的成绩：");
			scoreArr[i] = input.nextInt();
		}
		System.out.println("录入结束！正在分析.....");
		
		//1.假设最高分为第一个同学的成绩
		int max = scoreArr[0];
		//2.假设最低分为第一个同学的成绩
		int min = scoreArr[0];
		//3.假设平均分为0
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
		
		
		System.out.println("最高分是："+max);
		System.out.println("最低分是："+min);
		System.out.println("平均分是："+avg);
	}
}

/*
请输入第1位同学的成绩：75
请输入第2位同学的成绩：71
请输入第3位同学的成绩：83
请输入第4位同学的成绩：90
请输入第5位同学的成绩：69

最高分是：90
最低分是：69
平均分为：77
*/