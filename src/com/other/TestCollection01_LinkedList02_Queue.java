package com.other;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import com.charactor.Hero;

/**
 * LinkedList ����ʵ����List��Deque�⣬��ʵ����Queue�ӿ�(����)��
 * Queue���Ƚ��ȳ����� FIFO�����÷�����
 * offer ��������Ԫ��
 * poll ȡ����һ��Ԫ��
 * peek �鿴��һ��Ԫ��
 * @author Administrator
 *
 */
public class TestCollection01_LinkedList02_Queue {
	public static void main(String[] args) {
		//��ArrayListһ����LinkedListҲʵ����List�ӿ�
		List<Hero> ll = new LinkedList<Hero>();
        
		//����ͬ����LinkedList��ʵ����Deque��������ʵ����Queue����ӿ�
        //Queue����FIFO �Ƚ��ȳ��Ķ���		
		Queue<Hero> q= new LinkedList<Hero>();
		
		System.out.println("��ʼ�����У�\t");
		q.offer(new Hero("Hero1"));
		q.offer(new Hero("Hero2"));
		q.offer(new Hero("Hero3"));
		q.offer(new Hero("Hero4"));
		System.out.println(q);
		System.out.println("�ѵ�һ��Ԫ��ȡpoll()������\t");
		//ȡ����һ��Hero,FIFO �Ƚ��ȳ�
		Hero h = q.poll();
		System.out.println(h);
		System.out.println("ȡ����һ��Ԫ��֮��Ķ��У�\t");
		System.out.println(q);
		//�ѵ�һ���ó������������ǲ�ȡ����
		h=q.peek();
		System.out.println("�鿴peek()��һ��Ԫ��:\t");
		System.out.println(h);
		System.out.println("�鿴�����ᵼ�µ�һ��Ԫ�ر�ȡ����:\t");
		System.out.println(q);
	}
}
