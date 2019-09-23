package com.relationship_different;

import java.util.ArrayList;
import java.util.HashSet;
/**
 * 生成50个 0-9999之间的随机数，要求不能有重复的
 * 使用Set来存放随机数，不断的向里塞，直到塞满50个位置。
 * 因为Set有不重复的特性，所以最后得到的50个，就一定是不重复的
 */
public class ArrayList_And_HashSet03_Exercise_No_Repeat_RandomNumber {
	public static void main(String[] args) {
		HashSet<Integer> numbers = new HashSet<>();
		while(numbers.size()<50){
			int i = (int) (Math.random() * 10000);
			numbers.add(i);
		}
		System.out.println("得到50个不重复随机数：");
		System.out.println(numbers);
   	}
}
