package com.arraylist;

import java.util.ArrayList;
import java.util.List;

import com.charactor.Hero;
/**
 * ArrayList��List:
 * ArrayListʵ���˽ӿ�List
 * 	������д�������������Ϊ�ӿ�List����
 * 	ע�⣺��java.util.List,������java.awt.List
 * @author Administrator
 *
 */
public class TestCollection04_Interface_Of_List {
	public static void main(String[] args) {
        //ArrayListʵ���˽ӿ�List
        
        //������д�������������Ϊ�ӿ�List����
        //ע�⣺��java.util.List,������java.awt.List
        //�ӿ�����ָ��������󣨶�̬��		
		List<Hero> heros = new ArrayList<Hero>();
		heros.add(new Hero("����"));
		System.out.println(heros.size());
		
		//��ΪArrayListʵ����List�ӿڣ�����List�ӿڵķ���ArrayList��ʵ���ˡ�
		//��ArrayList ���÷����½�����ϸ�Ľ��⣬�ڴ˲���׸��
	}
}
