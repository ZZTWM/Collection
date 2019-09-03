package com.arraylist;

import com.charactor.Hero;

/**
 * 使用数组的局限性
 * 如果要存放多个对象，可以使用数组，但是数组有局限性
 * 比如 声明长度是10的数组
 * 不用的数组就浪费了
 * 超过10的个数，又放不下
 * @author Administrator
 *
 */
public class TestCollection01_Limit_Use_Array {
	public static void main(String[] args) {
		Hero heros[] = new Hero[10];
        //声明长度是10的数组
        //不用的数组就浪费了
        //超过10的个数，又放不下
		heros[0] = new Hero("盖伦");
		//放不下要报错
		heros[20] = new Hero("提莫");
	}
}
