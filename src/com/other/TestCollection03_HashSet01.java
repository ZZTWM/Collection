package com.other;

import java.util.HashSet;
/**
 * Set中的元素，不能重复
 * @author Administrator
 *
 */
public class TestCollection03_HashSet01 {
	public static void main(String[] args) {
		HashSet<String> names = new HashSet<String>();
		names.add("gareen");
		System.out.println(names);
		
		//第二次插入同样的数据，是插不进去的，容器中只会保留一个
		names.add("gareen");
		System.out.println(names);
	}
}
