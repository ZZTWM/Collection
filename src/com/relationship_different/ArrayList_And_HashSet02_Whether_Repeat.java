package com.relationship_different;

import java.util.ArrayList;
import java.util.HashSet;
/**
 * 能否重复
 * List中的数据可以重复
 * Set中的数据不能够重复
 * 重复判断标准是:
 * 首先看hashcode是否相同
 * 如果hashcode不同，则认为是不同数据
 * 如果hashcode相同，再比较equals，如果equals相同，则是相同数据，否则是不同数据
 * 更多关系hashcode，请参考hashcode原理
 * @author Administrator
 *
 */
public class ArrayList_And_HashSet02_Whether_Repeat {
	public static void main(String[] args) {
		ArrayList<Integer> numberList = new ArrayList<Integer>();
		//List中 的数据可以重复
		System.out.println("-----List-----");
		System.out.println("向List中插入入9 9 ");
		numberList.add(9);
		numberList.add(9);
		System.out.println("List中出现两个9：");
		System.out.println(numberList);
		
		System.out.println("-----Set-----");
		HashSet<Integer> numberSet = new HashSet<>();
		System.out.println("向Set插入9 9");
		//Set中的数据不能重复
		numberSet.add(9);
		numberSet.add(9);
		System.out.println("Set中只会保留一个9:");
		System.out.println(numberSet);
   	}
}
