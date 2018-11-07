package com.gem.java.oop;

public class Demo11 {
	public static void main(String[] args) {
		int[] arr = {26,22,19,17,25,63,23};	//index:6
		
		for (int i = 0; i < arr.length-1; i++) {
			for(int j = 0 ; j<arr.length-1-i ; j++){
				if(arr[j]>arr[j+1]){
					int temp ;
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+"\t");
		}
	}
}
/*
26 22 19 17 25 63 23
排序之后：
17 19 22 23 25 26 63

ArrayIndexOutOfBoundsException:

第一轮：
22	19	17	25	26	23	63







Demo12的执行过程：

26,22,19,17,25,63,23

i=0
	j=1
		arr[0]>arr[1]
		22,26,19,17,25,63,23
	j=2
		arr[0]>arr[2]
		19,26,22,17,25,63,23
	j=3
		arr[0]>arr[3]
		17,26,22,19,25,63,23
	j=4
		arr[0]>arr[4]
		17,26,22,19,25,63,23
	j=5
		arr[0]>arr[5]
		17,26,22,19,25,63,23
	j=6
		arr[0]>arr[6]
		17,26,22,19,25,63,23
	j=7

i=1
	






















*/