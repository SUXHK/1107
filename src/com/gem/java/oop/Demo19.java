package com.gem.java.oop;

public class Demo19 {
	
	String name = "jim";
	
	public static void main(String[] args) {
		Demo19 d = new Demo19();
		d.name="tom";
		System.out.println(d.name);
	}
	
	void m1(){
		System.out.println("m1");
		System.out.println(name);
	}
	
	void m2(){
		System.out.println("m2");
		m1();//��Ա����������һ����Ա����������ֱ�ӵ���.ʵ����ǰ��ʡ����"this."
	}
	
}
/*
������Ƶ�ԭ��
1.�Ƿ���Ҫ��������������Ƿ���Ҫ�������ṩ����
2.�Ƿ���Ҫ����ֵ����������Ƿ���Ҫ�м���������������
*/
