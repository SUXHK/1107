package com.gem.java.oop;

public class Demo14 {
	//main方法、main函数
	public static void main(String[] args) {
		
		Person per = new Person();
		//.表示"的"
		per.pname="鸠摩智";
		per.age=30;
		per.gender="男";
		
		//方法的调用
		per.run();
		per.eat();
		per.sleep();
		
		per.introduceSelf();
		
	}
}

/*
类的组成：
	特征——属性
	行为——方法
 
人
	特征：姓名、年龄、性别、国籍、身份证号、血型、星座..........
	行为：奔跑、吃饭、睡觉.......
 
 
*/
