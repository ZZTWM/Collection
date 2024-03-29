package com.other;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 统计概率
 * 首先初始化一个List,长度是10，值是0-9。
 * 然后不断的shuffle，直到前3位出现
 * 3 1 4
 * shuffle 1000,000 次，统计出现的概率
 */
public class TestCollection04_Collectios07_Exercise_Statistical_Probability {
	public static void main(String[] args) {
		List<Integer> ls = new ArrayList<>();
		
		for (int i = 0; i < 10; i++) {
			ls.add(i);
		}
		
		int count = 0;
		
		for (int i = 0; i < 1000*1000; i++) {
			Collections.shuffle(ls);
			if(ls.get(0)==3 && ls.get(1)==1 && ls.get(2)==4)
				count ++;
		}
		
		double rate = count/(1000d*1000);
		System.out.println("出现的概率是"+rate*100+"%");
	}
}
