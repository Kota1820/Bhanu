package org.jsp.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	
	public static void main(String[] args) {
		
		ApplicationContext context =new ClassPathXmlApplicationContext("sample.xml");
		Employee employee=(Employee)context.getBean("emp");
		
		System.out.println(employee);
		System.out.println("Employee id="+ employee.getEmpId());
		System.out.println("Employee name="+ employee.getName());
		
		
		Employee employee2=(Employee)context.getBean("emp2");
		System.out.println(employee2);
		System.out.println("Employee id=" + employee2.getEmpId());
		System.out.println("Employee name="+ employee2.getName());
		System.out.println("Employee salary="+ employee2.getSalary());
		
		Employee employee3=(Employee)context.getBean("emp3");
		System.out.println("Employee id="+ employee3.getEmpId());
		System.out.println("Employee name="+ employee3.getName());
		System.out.println("Employee salary="+ employee3.getSalary());
		System.out.println(employee3);
	}

}
