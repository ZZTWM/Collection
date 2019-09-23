package com.other;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * synchronizedList 把非线程安全的List转换为线程安全的List。 
 * 	因为截至目前为止，还没有学习线程安全的内容，暂时不展开。
 * 	线程安全的内容将在多线程章节展开。
 * @author Administrator
 *
 */
public class TestCollection04_Collectios06_synchronizedList {
	public static void main(String[] args) {
		List<Integer> numbers = new ArrayList<>();
		
		System.out.println("把非线程安全的List转换为线程安全的List");
		
		List<Integer> synchronizedNumbers = (List<Integer>) Collections.synchronizedList(numbers);
		
	}
}
