package com.relationship_different;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @author Administrator
 * 比较 ArrayList和LinkedList 在最后面插入100000条数据，谁快谁慢？为什么？
 * 直接调用add方法，就表示在最后插入数据
 * 因为是插入在最后面，所以对于数组而言，并没有一个移动很多数据的需要，所以也非常的快
 * 而链表本身就很快，无论插入在哪里
 */
public class ArrayList_And_LinkedList03_Insert_Data_At_Last {
    public static void main(String[] args) {
        List<Integer> l;
        l = new ArrayList<>();
        insertFirst(l, "ArrayList");
  
        l = new LinkedList<>();
        insertFirst(l, "LinkedList");
  
    }
  
    private static void insertFirst(List<Integer> l, String type) {
        int total = 1000 * 100;
        final int number = 5;
        long start = System.currentTimeMillis();
        for (int i = 0; i < total; i++) {
            //直接add就表示插入在最后
            l.add(number);
        }
        long end = System.currentTimeMillis();
        System.out.printf("在%s 最后面插入%d条数据，总共耗时 %d 毫秒 %n", type, total, end - start);
    }
}
