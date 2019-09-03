package com.arraylist;

import java.util.ArrayList;

import com.charactor.Hero;

/**
 * ArrayList存放对象:
 * 为了解决数组的局限性，引入容器类的概念。 最常见的容器类就是 
 * ArrayList 
 * 容器的容量"capacity"会随着对象的增加，自动增长 
 * 只需要不断往容器里增加英雄即可，不用担心会出现数组的边界问题。
 * @author Administrator
 *
 */
public class TestCollection02_Use_Collection {
	public static void main(String[] args) {
		//容器类ArrayList，用于存放对象
		ArrayList<Hero> heros = new ArrayList<Hero>();
		heros.add(new Hero("盖伦"));
		System.out.println(heros.size());
		
        //容器的容量"capacity"会随着对象的增加，自动增长
        //只需要不断往容器里增加英雄即可，不用担心会出现数组的边界问题。
		heros.add(new Hero("提莫"));
		System.out.println(heros.size());
	}
}
