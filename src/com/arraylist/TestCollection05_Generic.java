package com.arraylist;

import java.util.ArrayList;
import java.util.List;

import com.charactor.GiantDragon;
import com.charactor.Hero;
import com.charactor.LOL;
import com.property.Item;

/**
 * �������ͺ�ǰ��ѧϰ����������֪ʶ�����һ��ArrayList��ʹ�����ArrayList��ֿ��Է�Hero��
 * �ֿ��Է�Item,���ǳ��������ֶ��������Ķ��󶼲��ܷ�
 * @author Administrator
 * 	���ȴ���һ���ӿ� LOL������Ҫ�����������κη���
 * 	������Hero��Item��ʵ��LOL�ӿ�
 * 	�������һ��ArrayList�ı���lolList,���ķ�����<LOL>
 * 	List<LOL> lolList = new ArrayList<>();
 * 	������lolList�оͼ���Hero�����ַ�Item�����ˡ�
 */
public class TestCollection05_Generic {
	public static void main(String[] args) {
		List<LOL> lolList = new ArrayList<LOL>();
		lolList.add(new Hero("����"));//�ܷ�Hero
		lolList.add(new Item("Ѫƿ"));//�ܷ�Item
		
		//lolList.add(new GiantDragon());//GiantDragon������HeroҲ����Item
	}
}

















