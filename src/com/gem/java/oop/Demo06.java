package com.gem.java.oop;

import java.util.Scanner;

public class Demo06 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("�������кţ�");
		int count = input.nextInt() ;
		
		int i = 1 ;
		while(i<=count){
			
			//1.��ӡ�ո�
			int j = 1 ;
			while(j<=(count-i)){
				System.out.print(" ");
				j++;
			}
			
			//2.��ӡ�Ǻ�
			int k = 1 ;
			while(k<=(2*i-1)){
				System.out.print(i<=9 ? (""+i) : ((char)(i+55)));
				k++;
			}
			
			//3.��ӡ����
			System.out.println();
			
			i++;
		}
	}
}
/*
�������кţ�50
          1
         222
        33333
       4444444
      555555555
     ...........
    9999999999999
   AAAAAAAAAAAAAAA
  .................
 ZZZZZZZZZZZZZZZZZZZ
.....................
*/