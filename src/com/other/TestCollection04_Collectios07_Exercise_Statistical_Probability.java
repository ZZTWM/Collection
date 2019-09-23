package com.other;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * ͳ�Ƹ���
 * ���ȳ�ʼ��һ��List,������10��ֵ��0-9��
 * Ȼ�󲻶ϵ�shuffle��ֱ��ǰ3λ����
 * 3 1 4
 * shuffle 1000,000 �Σ�ͳ�Ƴ��ֵĸ���
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
		System.out.println("���ֵĸ�����"+rate*100+"%");
	}
}
