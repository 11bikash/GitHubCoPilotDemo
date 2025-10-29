package com.acc.lkm.springinjectiondemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("beans.xml");
        Employee employee=(Employee)applicationContext.getBean("employee2");
       /* System.out.println("Employee Details");
        System.out.println(employee.getEid());
        System.out.println(employee.getName());
        System.out.println(employee.getAddress());
       System.out.println("Project Details");
        System.out.println(employee.getProject().getPid());
        System.out.println(employee.getProject().getName());*/
 		System.out.println("Employee ID = " + employee.getEid());
 		System.out.println("Employee Name = " + employee.getName());
 		System.out.println("Employee Address = " + employee.getAddress());
 		System.out.println("Project ID = " + employee.getProject());
        
    }
}
