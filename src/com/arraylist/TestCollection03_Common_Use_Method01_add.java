package com.arraylist;

import java.util.ArrayList;

import com.charactor.Hero;
/**
 * 增加：
 * 	add 有两种用法
 * 	第一种是直接add对象，把对象加在最后面
 * 	heros.add(new Hero("hero " + i));
 * 	第二种是在指定位置加对象
 * 	heros.add(3, specialHero);
 * @author Administrator
 *
 */
public class TestCollection03_Common_Use_Method01_add {
	
	public static void main(String[] args) {
		ArrayList<Hero> heros = new ArrayList<Hero>();
		// 把5个对象加入到ArrayList中
		for (int i = 0; i < 5; i++) {
			heros.add(new Hero("hero" + i));
		}
		System.out.println(heros);
		// 在指定位置增加对象
		Hero specialHero = new Hero("special hero");
		heros.add(3,specialHero);
		System.out.println(heros.toString());
	}
}
