package com.org.prft;

import org.springframework.beans.factory.annotation.Required;
import org.springframework.beans.factory.annotation.Value;

public class Student {

private String name;
	private int reg_id;
	private String hobbies;
	@Value("trisha")
	
	public void setName(String name) {
		this.name = name;
	}
	@Value("1234")
	@Required
	public void setReg_id(int reg_id) {
		this.reg_id = reg_id;
	}
	@Value("cricket")
	@Required
	public void setHobbies(String hobbies) {
		this.hobbies = hobbies;
	}
	public void Displaystddetails()
	{
		System.out.println("name of the student:"+name);
	System.out.println("Regesiter number is:"+reg_id);	
	System.out.println("hobbies of student:"+hobbies);
	}
	
	
}
