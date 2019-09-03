package com.arraylist;

import java.util.ArrayList;
import java.util.List;

import com.charactor.Hero;
/**
 * ArrayList和List:
 * ArrayList实现了接口List
 * 	常见的写法会把引用声明为接口List类型
 * 	注意：是java.util.List,而不是java.awt.List
 * @author Administrator
 *
 */
public class TestCollection04_Interface_Of_List {
	public static void main(String[] args) {
        //ArrayList实现了接口List
        
        //常见的写法会把引用声明为接口List类型
        //注意：是java.util.List,而不是java.awt.List
        //接口引用指向子类对象（多态）		
		List<Hero> heros = new ArrayList<Hero>();
		heros.add(new Hero("盖伦"));
		System.out.println(heros.size());
		
		//因为ArrayList实现了List接口，所以List接口的方法ArrayList都实现了。
		//在ArrayList 常用方法章节有详细的讲解，在此不作赘述
	}
}
