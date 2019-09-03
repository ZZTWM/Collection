package com.arraylist;

import java.util.ArrayList;
import java.util.List;

import com.charactor.GiantDragon;
import com.charactor.Hero;
import com.charactor.LOL;
import com.property.Item;

/**
 * 借助泛型和前面学习的面向对象的知识，设计一个ArrayList，使得这个ArrayList里，又可以放Hero，
 * 又可以放Item,但是除了这两种对象，其他的对象都不能放
 * @author Administrator
 * 	首先创建一个接口 LOL，不需要在其中声明任何方法
 * 	接着让Hero和Item都实现LOL接口
 * 	最后，声明一个ArrayList的变量lolList,它的泛型是<LOL>
 * 	List<LOL> lolList = new ArrayList<>();
 * 	这样在lolList中就即放Hero对象，又放Item对象了。
 */
public class TestCollection05_Generic {
	public static void main(String[] args) {
		List<LOL> lolList = new ArrayList<LOL>();
		lolList.add(new Hero("盖伦"));//能放Hero
		lolList.add(new Item("血瓶"));//能放Item
		
		//lolList.add(new GiantDragon());//GiantDragon即不是Hero也不是Item
	}
}

















