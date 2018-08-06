/**
 * 
 */
package com.liang.wxarticle.equals;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/**
 * 
 * @author Administrator
 *
 */
public class EqualsAndHashCodeTest {
	
	public static void main(String[] args) {
		testEqualsAndHashCode();
	}
	
	public static void testEqualsAndHashCode(){
		Person p1 = new Person("李四");
		Person p2 = new Person("李四");
		System.out.println("p1==p2 : " + (p1 ==p2));
		System.out.println("p1 hashCode=" + p1.hashCode() + ",p2 hashCode=" + p2.hashCode());
		System.out.println("p1 equals p2 : " + (p1.equals(p2)));
		
		HashSet<Person> perSets = new HashSet<Person>();
		perSets.add(p1);
		perSets.add(p2);
		System.out.println("perSets size=" + perSets.size());
		
		HashMap<Person, String> perMap = new HashMap<Person, String>();
		perMap.put(p1, "p1");
		perMap.put(p2, "p2");
		System.out.println("perMap size=" + perMap.size());
		System.out.println(perMap.get(new Person( "李四")));
		
		
		System.out.println();
		System.out.println("User重写equals 和 hashCode--------------------");
		
		User user1 = new User(12, "张三");
		User user2 = new User(13, "张三");
		System.out.println("user1==user2 : " + (user1 == user2));
		System.out.println("user1 hashCode=" + user1.hashCode() + ",user2 hashCode=" + user2.hashCode());
		System.out.println("user1 equals user2 : " + (user1.equals(user2)));
		
		HashSet<User> userSets = new HashSet<User>();
		userSets.add(user1);
		userSets.add(user2);
		System.out.println("users size=" + userSets.size());
		for (User user : userSets) {
			System.out.println(user.getAge());
		}
		
		HashMap<User, String> usersMap = new HashMap<User, String>();
		usersMap.put(user1, "user1");
		usersMap.put(user2, "user2");
		System.out.println(usersMap.size());
		System.out.println(usersMap.get(new User( "张三")));
		for (Map.Entry<User,String> user : usersMap.entrySet()) {
			System.out.println(user.getKey().getAge());
		}
	}
}
