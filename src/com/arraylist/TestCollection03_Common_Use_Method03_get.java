package com.arraylist;

import java.util.ArrayList;

import com.charactor.Hero;

/**
 * 通过get获取指定位置的对象，如果输入的下标越界，一样会报错
 * @author Administrator
 *
 */
public class TestCollection03_Common_Use_Method03_get {
	public static void main(String[] args) {
		ArrayList<Hero> heros = new ArrayList<Hero>();
		// 初始化5个对象
		for (int i = 0; i < 5; i++) {
			heros.add(new Hero("hero " + 1));
		}
		System.out.println(heros);
		
		Hero specialHero = new Hero("special hero");
		heros.add(specialHero);
		//获取指定位置的对象
		System.out.println(heros.get(5));
		//如果超出了范围，依然会报错
		System.out.println(heros.get(6));
 	}
}
