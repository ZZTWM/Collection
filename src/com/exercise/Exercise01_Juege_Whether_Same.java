package com.exercise;

import java.util.ArrayList;

import com.charactor.Hero;

/**
 * 如果就是要判断集合里是否存在一个 name等于 "hero 1"的对象，应该怎么做？
 * @author Administrator
 *
 */
public class Exercise01_Juege_Whether_Same {
	public static void main(String[] args) {
		ArrayList<Hero> heros = new ArrayList<Hero>();
		// 初始化5个对象
		for (int i = 0; i < 5; i++) {
			heros.add(new Hero("hero " + i));
		}
		Hero specialHero = new Hero("special hero");
		heros.add(specialHero);
		String name = "hero 1";
		for (int i = 0; i < heros.size(); i++) {
			Hero h = heros.get(i);
			if(name.equals(h.name)){
				System.out.printf("找到了name是%s的对象",name);
				break;
			}
		}
	}
}
