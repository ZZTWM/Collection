package com.other;

import java.util.LinkedList;

import com.charactor.Hero;
/**
 * ����ʵ����List�ӿ��⣬LinkedList��ʵ����˫������ṹDeque�����Ժܷ������ͷβ����ɾ������
 * ʲô������ṹ: ������ṹ��Ƚϣ�����ṹ���ͺ����ǵ�ӰԺ��ÿ��λ�ö��б�ʾ��ÿ��λ��֮��ļ������һ���ġ�
 * ��������൱�ڷ��飬ÿ�����ӣ�ֻ����ǰһ���ͺ�һ�������ù��ĳ���֮����������������
 * @author Administrator
 *
 */
public class TestCollection01_LinkedList01_Deque {
	public static void main(String[] args) {
		//LinkedList��һ��˫������ṹ��list
		LinkedList<Hero> ll = new LinkedList<Hero>();
        //���Կ��Ժܷ������ͷ����β����������
        //���������µ�Ӣ��
		ll.addLast(new Hero("hero1"));
		ll.addLast(new Hero("hero2"));
		ll.addLast(new Hero("hero3"));
		System.out.println(ll);
		//����ǰ������µ�Ӣ��
		ll.addFirst(new Hero("FirstHero"));
		System.out.println(ll);
		
		//�鿴��ǰ���Ӣ��
		System.out.println(ll.getFirst());
		//�鿴������Ӣ��
		System.out.println(ll.getLast());
		
		//�鿴���ᵼ��Ӣ�۱�ɾ��
		System.out.println(ll);
		//ȡ����ǰ���Ӣ��
		System.out.println(ll.removeFirst());
		//ȡ��������Ӣ��
		System.out.println(ll.removeLast());
		//ȡ���ᵼ��Ӣ�۱�ɾ��
		System.out.println(ll);
	}
}
