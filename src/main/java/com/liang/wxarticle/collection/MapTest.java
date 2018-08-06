package com.liang.wxarticle.collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapTest {
	
	public static void main(String[] args) {
		
		Map<String, String> datas = new HashMap<String, String>();
		datas.put(null, null);
		datas.put("key1", "value1");
		datas.put("key2", "value2");
		datas.put("key3", "value3");
		datas.put("key4", "value4");
		datas.put("key4", "value4");//放入相同值
		System.out.println("size="+datas.size());
		
		System.out.println("keySet遍历-----------");
		for (String key : datas.keySet()) {
			System.out.println("key="+key+",value="+datas.get(key));
		}
		
		System.out.println("entrySe遍历-----------");
		for (Map.Entry<String,String>  entry : datas.entrySet()) {
			System.out.println("key="+entry.getKey()+",value="+entry.getValue());
		}
		
		System.out.println("entrySet iterator遍历-----------");
		for (Iterator<Map.Entry<String,String>> it= datas.entrySet().iterator() ; it.hasNext();) {
			Map.Entry<String,String> next = it.next();
			System.out.println("key="+next.getKey()+",value="+next.getValue());
		}
		
		System.out.println("keySet iterator遍历-----------");
		for (Iterator<String> it= datas.keySet().iterator() ; it.hasNext();) {
			String key = (String)it.next();
			System.out.println("key="+key+",value="+datas.get(key));
		}
		
	}
}
