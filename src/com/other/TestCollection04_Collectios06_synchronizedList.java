package com.other;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * synchronizedList �ѷ��̰߳�ȫ��Listת��Ϊ�̰߳�ȫ��List�� 
 * 	��Ϊ����ĿǰΪֹ����û��ѧϰ�̰߳�ȫ�����ݣ���ʱ��չ����
 * 	�̰߳�ȫ�����ݽ��ڶ��߳��½�չ����
 * @author Administrator
 *
 */
public class TestCollection04_Collectios06_synchronizedList {
	public static void main(String[] args) {
		List<Integer> numbers = new ArrayList<>();
		
		System.out.println("�ѷ��̰߳�ȫ��Listת��Ϊ�̰߳�ȫ��List");
		
		List<Integer> synchronizedNumbers = (List<Integer>) Collections.synchronizedList(numbers);
		
	}
}
