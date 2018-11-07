package com.gem.java.oop;

public class Demo12 {
	public static void main(String[] args) {
		int[] arr = {26,22,19,17,25,63,23};
		
		for (int i = 0; i < arr.length-1; i++) {
			for(int j = i+1 ; j<arr.length ; j++){
				if(arr[i]>arr[j]){
					int temp ;
					temp = arr[i];
					arr[i] = arr[j];
					arr[j]=temp;
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








Demo11的执行过程：

26,22,19,17,25,63,23

i=0
	j=0
		arr[0]>arr[1]
		22,26,19,17,25,63,23
	j=1
		arr[1]>arr[2]
		22,19,26,17,25,63,23
	j=2
		arr[2]>arr[3]
		22,19,17,26,25,63,23
	j=3
		arr[3]>arr[4]
		22,19,17,25,26,63,23
	j=4
		arr[4]>arr[5]
		22,19,17,25,26,63,23
	j=5
		arr[5]>arr[6]
		22,19,17,25,26,23,63
	j=6
i=1
	j=0
		arr[0]>arr[1]
		19,22,17,25,26,23,63
	j=1
		arr[1]>arr[2]
		19,17,22,25,26,23,63
	j=2
		arr[2]>arr[3]
		19,17,22,25,26,23,63
	j=3
		arr[3]>arr[4]
		19,17,22,25,26,23,63
	j=4
		arr[4]>arr[5]
		19,17,22,25,23,26,63
	j=5
i=2
		
*/