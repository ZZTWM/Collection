package com.arraylist;

import java.util.ArrayList;

import com.charactor.Hero;

/**
 * 获取对象所处的位置：indexOf
 * 	indexOf用于判断一个对象在ArrayList中所处的位置
 * 	与contains一样，判断标准是对象是否相同，而非对象的name值是否相等
 * @author Administrator
 *
 */
public class TestCollection03_Common_Use_Method04_indexOf {
	public static void main(String[] args) {
		ArrayList<Hero> heros = new ArrayList<Hero>();
		//初始化5个对象
		for (int i = 0; i < 5; i++) {
			heros.add(new Hero("hero " + i));
		}
		
		Hero specialHero = new Hero("special hero");
		heros.add(specialHero);
		
		System.out.println(heros);
		System.out.println("specialHero所处的位置:" + heros.indexOf(specialHero));
		
		System.out.println("新的英雄，但是名字是\"hero 1\"所处的位置:" + heros.indexOf(new Hero("hero 1")));
	}
}
