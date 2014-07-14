package com.naveen;

public class HelloWorld {
	private String userName;
	private String message;
	private String password;
	
	public HelloWorld() {
	
	}
	
	
	public String execute(){
		
		
		if(getUserName().equals("subrat") && getPassword().equals("123")){
			return "SUCCESS";
		}
		else{
			return "LOGINERROR";
		}
	}
	
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	
}