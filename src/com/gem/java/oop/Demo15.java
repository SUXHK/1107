package com.gem.java.oop;

import java.util.Scanner;

public class Demo15 {
	public static void main(String[] args) {
		/*
		Demo15 d = new Demo15();
		//d.m1();
		//d.hello("小宋");
		Scanner input = new Scanner(System.in);
		String n = input.next() ;
		d.hello(n);//n称之为实际参数
		*/
		
		Scanner input = new Scanner(System.in);
		Demo15 d= new Demo15();
		System.out.print("请输入第一个人的名字：");
		String name1 = input.next();
		System.out.print("请输入第二个人的名字：");
		String name2 = input.next() ;
		d.hello(name1, name2);
		
	}
	
	//不带参数的方法
	void m1(){
		System.out.println("m1");
	}
	
	//带一个参数的方法
	void hello(String name){//此处的name称之为：形式参数
		System.out.println(name + ",你好！");
	}
	
	//带两个参数的方法
	void hello(String name1 , String name2){
		System.out.println("say hello to "+name1+" and " + name2 +" ! ");
	}
}
