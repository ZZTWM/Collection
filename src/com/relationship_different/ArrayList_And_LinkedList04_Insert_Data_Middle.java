package com.relationship_different;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * 在List的中间位置，插入数据，比较ArrayList快，还是LinkedList快，并解释为什么？
 * 表示在当前容器的一半的位置，插入数据
 * 在这个位置插入数据
 * 数组定位很快，插入数据比较慢
 * 链表定位很慢，插入数据比较快
 * 最后发现，当总数是10000条的时候，链表定位的总开支要比数组插入的总开支更多，所以最后整体表现，数组会更好。
 * 如果总数是1000条，结果可能就不一样了。
 */
public class ArrayList_And_LinkedList04_Insert_Data_Middle {
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
            //把当前容器的一半的位置，插入数据
            l.add(l.size()/2,number);
        }
        long end = System.currentTimeMillis();
        System.out.printf("在%s 最中间插入%d条数据，总共耗时 %d 毫秒 %n", type, total, end - start);
    }
}
