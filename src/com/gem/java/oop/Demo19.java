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
		m1();//成员方法调用另一个成员方法，可以直接调用.实际上前面省略了"this."
	}
	
}
/*
方法设计的原则：
1.是否需要参数：这个方法是否需要外界给它提供资料
2.是否需要返回值：这个方法是否需要有计算结果用于再运算
*/
