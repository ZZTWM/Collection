package com.arraylist;

import java.util.ArrayList;
import java.util.List;

import com.charactor.Hero;

public class TestCollection06_Ergodic01_For {
	public static void main(String[] args) {
		List<Hero> heros = new ArrayList<Hero>();
		
		// 放5个Hero进入容器
		for (int i = 0; i < 5; i++) {
			heros.add(new Hero("hero name" + i));
		}
		//第一中遍历 for循环
		System.out.println("------for循环----------");
		for (int i = 0; i < heros.size(); i++) {
			Hero h = heros.get(i);
			System.out.println(h);
		}
	}
}
