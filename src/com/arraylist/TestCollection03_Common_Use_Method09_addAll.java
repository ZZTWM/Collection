package com.arraylist;

import java.util.ArrayList;

import com.charactor.Hero;

/**
 * 把另一个容器所有对象都加进来:addAll
 * @author Administrator
 *
 */
public class TestCollection03_Common_Use_Method09_addAll {
	public static void main(String[] args) {
		ArrayList<Hero> heros = new ArrayList<Hero>();
		
		// 初始化5个对象
		for (int i = 0; i < 5; i++) {
			heros.add(new Hero("hero " + i));
		}
		System.out.println("ArrayList heros:\t" + heros);
		//把另一个容器里所有的元素，都加入到该容器里来
		ArrayList<Hero> anotherHeros = new ArrayList<Hero>();
		anotherHeros.add(new Hero("hero a"));
		anotherHeros.add(new Hero("hero b"));
		anotherHeros.add(new Hero("hero c"));
		System.out.println("anotherHeros heros:\t" + anotherHeros);
		heros.addAll(anotherHeros);
		System.out.println("把另一个ArrayList的元素都加入到当前ArrayList:");
		System.out.println("ArrayList heros:\t" + heros);
	}
}
