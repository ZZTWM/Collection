package com.arraylist;

import java.util.ArrayList;
import java.util.List;

import com.charactor.Hero;

public class TestCollection06_Ergodic01_For {
	public static void main(String[] args) {
		List<Hero> heros = new ArrayList<Hero>();
		
		// ��5��Hero��������
		for (int i = 0; i < 5; i++) {
			heros.add(new Hero("hero name" + i));
		}
		//��һ�б��� forѭ��
		System.out.println("------forѭ��----------");
		for (int i = 0; i < heros.size(); i++) {
			Hero h = heros.get(i);
			System.out.println(h);
		}
	}
}
