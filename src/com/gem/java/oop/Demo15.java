package com.gem.java.oop;

import java.util.Scanner;

public class Demo15 {
	public static void main(String[] args) {
		/*
		Demo15 d = new Demo15();
		//d.m1();
		//d.hello("С��");
		Scanner input = new Scanner(System.in);
		String n = input.next() ;
		d.hello(n);//n��֮Ϊʵ�ʲ���
		*/
		
		Scanner input = new Scanner(System.in);
		Demo15 d= new Demo15();
		System.out.print("�������һ���˵����֣�");
		String name1 = input.next();
		System.out.print("������ڶ����˵����֣�");
		String name2 = input.next() ;
		d.hello(name1, name2);
		
	}
	
	//���������ķ���
	void m1(){
		System.out.println("m1");
	}
	
	//��һ�������ķ���
	void hello(String name){//�˴���name��֮Ϊ����ʽ����
		System.out.println(name + ",��ã�");
	}
	
	//�����������ķ���
	void hello(String name1 , String name2){
		System.out.println("say hello to "+name1+" and " + name2 +" ! ");
	}
}
