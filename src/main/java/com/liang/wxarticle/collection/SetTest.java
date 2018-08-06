package com.liang.wxarticle.collection;

import java.util.HashSet;
import java.util.Set;

public class SetTest {
	
	public static void main(String[] args) {
		//这里String举例, 如果存对象呢,有什么不一样?
		Set<String> datas = new HashSet<String>();
		datas.add("data1");
		datas.add("data2");
		datas.add("data3");
		datas.add("data4");
		datas.add("data4");//相同会怎么样
		System.out.println("size="+datas.size());
		
		//也可以Iterator遍历
		for (String value : datas) {
			System.out.println("value="+value);
		}
		
		//这里如果存储的是自定义对象呢？
		System.out.println("contain="+datas.contains("data1"));
		System.out.println("contain="+datas.contains("data6"));

	}
}
