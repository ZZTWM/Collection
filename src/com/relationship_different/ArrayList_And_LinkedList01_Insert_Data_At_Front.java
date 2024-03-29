package com.relationship_different;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;


/**
 * 插入数据
 * ArrayList 插入，删除数据慢
 * 	LinkedList， 插入，删除数据快
 * 	ArrayList是顺序结构，所以定位很快，指哪找哪。 就像电影院位置一样，有了电影票，一下就找到位置了。
 * 	LinkedList 是链表结构，就像手里的一串佛珠，要找出第99个佛珠，必须得一个一个的数过去，所以定位慢
 * @author Administrator
 *
 */
public class ArrayList_And_LinkedList01_Insert_Data_At_Front {
	public static void main(String[] args) {
		List<Integer> l;
		l = new ArrayList<>();
		insertFirst(l, "ArrayList");
		
		l = new LinkedList<>();
		insertFirst(l, "LinkedList");
	}
	
	private static void insertFirst(List<Integer> l,String type){
		int total = 1000 * 100;
		final int number = 5;
		long start = System.currentTimeMillis();
		
		for (int i = 0; i < total; i++) {
			l.add(0,number);
		}
		
		long end = System.currentTimeMillis();
		
		System.out.printf("在%s 最前面插入%d条数据，总共耗时 %d 毫秒 %n", type, total, end - start);
	}
}
