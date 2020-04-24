package com.org.prft;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Admin {
	public static void main(String[] args)
	{
		ApplicationContext context=new ClassPathXmlApplicationContext("Beans.xml");
		Student student =context.getBean("Student",Student.class);
		student.Displaystddetails();
		
	}
}
