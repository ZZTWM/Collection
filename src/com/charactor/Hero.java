package com.charactor;

public class Hero implements LOL{
	public String name;
	public float hp;
	public int damage;
	
	public Hero(){
		
	}
	// ����һ����ʼ��name�Ĺ��췽��
	public Hero(String name) {
		super();
		this.name = name;
	}
	
	// ��дtoString����
	@Override
	public String toString() {
		return "Hero [name=" + name + "]";
	}
	
	
}
