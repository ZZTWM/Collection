package com.other;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import com.charactor.Hero;

/**
 * LinkedList 除了实现了List和Deque外，还实现了Queue接口(队列)。
 * Queue是先进先出队列 FIFO，常用方法：
 * offer 在最后添加元素
 * poll 取出第一个元素
 * peek 查看第一个元素
 * @author Administrator
 *
 */
public class TestCollection01_LinkedList02_Queue {
	public static void main(String[] args) {
		//和ArrayList一样，LinkedList也实现了List接口
		List<Hero> ll = new LinkedList<Hero>();
        
		//所不同的是LinkedList还实现了Deque，进而又实现了Queue这个接口
        //Queue代表FIFO 先进先出的队列		
		Queue<Hero> q= new LinkedList<Hero>();
		
		System.out.println("初始化队列：\t");
		q.offer(new Hero("Hero1"));
		q.offer(new Hero("Hero2"));
		q.offer(new Hero("Hero3"));
		q.offer(new Hero("Hero4"));
		System.out.println(q);
		System.out.println("把第一个元素取poll()出来：\t");
		//取出第一个Hero,FIFO 先进先出
		Hero h = q.poll();
		System.out.println(h);
		System.out.println("取出第一个元素之后的队列：\t");
		System.out.println(q);
		//把第一个拿出来看看，但是不取出来
		h=q.peek();
		System.out.println("查看peek()第一个元素:\t");
		System.out.println(h);
		System.out.println("查看并不会导致第一个元素被取出来:\t");
		System.out.println(q);
	}
}
