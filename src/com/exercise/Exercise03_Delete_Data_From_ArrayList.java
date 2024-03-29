package com.exercise;

import java.util.ArrayList;
import java.util.List;

import com.charactor.Hero;
/**
 * 首先初始化一个Hero集合，里面放100个Hero对象，名称分别是从
 * hero 0
 * hero 1
 * hero 2
 * ...
 * hero 99.
 * 通过遍历的手段，删除掉名字编号是8的倍数的对象
 * @author Administrator
 *这个练习的考点是，不能够在使用Iterator和增强for循环遍历数据的同时，
 *删除数据，否则会抛出ConcurrentModificationException
 *解决办法，是准备一个临时容器，专门用来保存需要删除的对象。 然后再删掉
 */
public class Exercise03_Delete_Data_From_ArrayList {
	public static void main(String[] args) {
        List<Hero> heros = new ArrayList<Hero>();
        
        // 放100个Hero进入容器
        for (int i = 0; i < 100; i++) {
            heros.add(new Hero("hero name " + i));
        }
 
        //准备一个容器，专门用来装要删除的对象
        List<Hero> deletingHeros = new ArrayList<>();
 
        for (Hero h : heros) {
            int id = Integer.parseInt(h.name.substring(10));
            if (0 == id % 8)
                deletingHeros.add(h);
        }
        for (Hero h : deletingHeros) {
            heros.remove(h);
        }
//      heros.removeAll(deletingHeros); //直接通过removeAll删除多个Hero对象
        System.out.println(heros);		
	}
}
