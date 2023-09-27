package com.javapoint;




import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.javatpoint.beans.Emp;
public class EmployeeSystemApplication {
	public static void main(String[] args) {
		
		System.out.println(">>>>>>>>>>>>>>> start <<<<<<<<<<<<<<<<<<");
		ApplicationContext context = new ClassPathXmlApplicationContext("web.xml");
		System.out.println(">>>>>>>>>>>>>>> 1 <<<<<<<<<<<<<<<<<<");
		Emp emp = (Emp) context.getBean("dao");
		System.out.println(">>>>>>>>>>>>>>> 2 <<<<<<<<<<<<<<<<<<");
		emp.toString();
		
		System.out.println(">>>>>>>>>>>>>>> 3 <<<<<<<<<<<<<<<<<<");
		

	}
}