package com.gem.java.oop;

public class Demo07 {
	public static void main(String[] args) {
		//1+2+3+...+10=55
		int i = 1 ;
		int sum = 0 ;
		
		//�������߶�ʮһ����ִ��һ����˵
		//do-while���ٻ�ִ��һ��ѭ������
		do{
			//ѭ������
			sum = sum + i ;
			System.out.print(i+ (i==10 ? "=" : "+"));
			i++;
		}while(i<=10);
		
		System.out.println(sum);
	}
}
/*

for()
while()

do{
}while();


*/