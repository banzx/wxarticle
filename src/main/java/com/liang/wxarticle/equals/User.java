package com.liang.wxarticle.equals;

public class User {
	
	private int age;
	
	private String userName;
	
	public User(String userName) {
		super();
		this.userName = userName;
	}

	public User(int age, String userName) {
		super();
		this.age = age;
		this.userName = userName;
	}


	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	@Override
	public int hashCode() {
		return userName.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if(obj == null){
			return false;
		}
		if(obj instanceof User){
			User tempUser = (User)obj;
			if(tempUser.getUserName().equals(this.userName)){
				return true;
			}
		}
		return false;
	}
}
