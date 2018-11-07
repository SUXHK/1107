package com.gem.java.oop;

//类：模板、新的数据类型
public class Person {
	//特征(成员变量、实例变量、属性)
	String pname ;
	int age ;
	String gender ;
	
	//行为(成员方法、实例方法、动作)
  //void:返回类型,void表示空，不需要返回值
  //run:方法名称
  //()里面可以定义形式参数
  //{}里面表示方法主体
	void run(){
		System.out.println("正在奔跑....");
	}
	//方法名：eat
	void eat(){
		System.out.println("正在吃饭...");
	}
	
	void sleep(){
		System.out.println("正在睡觉...");
	}
	
	void introduceSelf(){
		System.out.println("大家好，我叫"+pname+"，今年"+age+"岁，性别"+gender+"！请多多关照，思密达！");
	}
}
