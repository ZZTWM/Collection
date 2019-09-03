package com.charactor;

public class Hero implements LOL{
	public String name;
	public float hp;
	public int damage;
	
	public Hero(){
		
	}
	// 增加一个初始化name的构造方法
	public Hero(String name) {
		super();
		this.name = name;
	}
	
	// 重写toString方法
	@Override
	public String toString() {
		return "Hero [name=" + name + "]";
	}
	
	
}
