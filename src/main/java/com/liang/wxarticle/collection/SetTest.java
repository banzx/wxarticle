package com.liang.wxarticle.collection;

import java.util.HashSet;
import java.util.Set;

public class SetTest {
	
	public static void main(String[] args) {
		//����String����, ����������,��ʲô��һ��?
		Set<String> datas = new HashSet<String>();
		datas.add("data1");
		datas.add("data2");
		datas.add("data3");
		datas.add("data4");
		datas.add("data4");//��ͬ����ô��
		System.out.println("size="+datas.size());
		
		//Ҳ����Iterator����
		for (String value : datas) {
			System.out.println("value="+value);
		}
		
		//��������洢�����Զ�������أ�
		System.out.println("contain="+datas.contains("data1"));
		System.out.println("contain="+datas.contains("data6"));

	}
}
