package com.gem.java.oop;

//�ࣺģ�塢�µ���������
public class Person {
	//����(��Ա������ʵ������������)
	String pname ;
	int age ;
	String gender ;
	
	//��Ϊ(��Ա������ʵ������������)
  //void:��������,void��ʾ�գ�����Ҫ����ֵ
  //run:��������
  //()������Զ�����ʽ����
  //{}�����ʾ��������
	void run(){
		System.out.println("���ڱ���....");
	}
	//��������eat
	void eat(){
		System.out.println("���ڳԷ�...");
	}
	
	void sleep(){
		System.out.println("����˯��...");
	}
	
	void introduceSelf(){
		System.out.println("��Һã��ҽ�"+pname+"������"+age+"�꣬�Ա�"+gender+"��������գ�˼�ܴ");
	}
}
