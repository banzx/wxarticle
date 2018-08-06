/**
 * 
 */
package com.liang.wxarticle.string;

/**
 * 
 *@author: liangxp
 *date:2018Äê7ÔÂ9ÈÕÉÏÎç10:41:02
 */
public class StringTest {
	
	public static void main(String[] args) {
		testString();
	}
	
	public static void testString(){
		String s1 = "string1";
		String s2 = "string1";
		System.out.println(s1 == s2);
		System.out.println(s1.hashCode() + ", " + s2.hashCode());
		
		String s3 = "string2";
		String s4 = new String("string2");
		System.out.println(s3.hashCode() + ", " + s4.hashCode());
		System.out.println(s3 == s4);
		System.out.println(s3.equals(s4));
		
	}
	
	public static void testStringBufferAndBuilder(){
		long stime = System.nanoTime();
		StringBuilder sbud = new StringBuilder();
		for (int i = 0; i < 100; i++) {
			sbud.append("²âÊÔ×Ö·û´®");
		}
		System.out.println(System.nanoTime()-stime);
		
		stime = System.nanoTime();
		StringBuffer sbuf = new StringBuffer(); 
		for (int i = 0; i < 100; i++) {
			sbuf.append("²âÊÔ×Ö·û´®");
		}
		
		System.out.println(System.nanoTime()-stime);
	}
	

}
