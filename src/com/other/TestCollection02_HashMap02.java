package com.other;

import java.util.HashMap;

import com.charactor.Hero;

/**
 * 键不能重复，值可以重复
 * 对于HashMap而言，key是唯一的，不可以重复的。 
 * 所以，以相同的key 把不同的value插入到 Map中会导致旧元素被覆盖，只留下最后插入的元素。 
 * 不过，同一个对象可以作为值插入到map中，只要对应的key不一样
 * @author Administrator
 *
 */
public class TestCollection02_HashMap02 {
	public static void main(String[] args) {
		HashMap<String, Hero> heroMap = new HashMap<String,Hero>();
		heroMap.put("gareen", new Hero("gareen1"));
		System.out.println(heroMap);
		
        //key为gareen已经有value了，再以gareen作为key放入数据，会导致原英雄，被覆盖
        //不会增加新的元素到Map中
		heroMap.put("gareen", new Hero("gareen2"));
		System.out.println(heroMap);
		
		heroMap.clear();
		Hero gareen = new Hero("gareen");
		
		//同一个对象可以作为值插入到map中，只要对应的key不一样
		heroMap.put("hero1", gareen);
		heroMap.put("hero2", gareen);
		
		System.out.println(heroMap);
	}
}
