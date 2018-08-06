package com.banzxia.wxarticle.collection;

import java.util.ArrayList;
import java.util.List;

public class ArrayTest {
	public static void main(String[] args) {
		List<String> datas = new ArrayList<String>();
		datas.add("data1");
		datas.add("data2");
		datas.add("data3");
		datas.add("data4");
		datas.add("data4");//同样加入相同的
		System.out.println("size="+datas.size());
		
		for (String value : datas) {
			System.out.println("value="+value);
		}
		
		System.out.println("contain="+datas.contains("data1"));
	}
}
