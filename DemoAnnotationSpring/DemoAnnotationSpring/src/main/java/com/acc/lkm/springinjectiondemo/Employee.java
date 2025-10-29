package com.acc.lkm.springinjectiondemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Component("employee2")
public class Employee {
	@Autowired
	//@Qualifier("project")
	@Value("#{project2}")//SPEL
	Project project;// creating ref var means HAS-A , dependent bean
	public Employee(int eid, String name, String address) {
		super();
		this.eid = eid;
		this.name = name;
		this.address = address;
	}
 @Value("11")
	private int eid;
 @Value("Ram")
	private String name;
 @Value("Kolkata")
	private String address;
	

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Project getProject() {
		return project;
	}

	public void setProject(Project project) {
		this.project = project;
	}

	public Employee() {
		super();
	}
	public void display() {
		System.out.println("\nEmployee Details are:");
		System.out.println("Employee ID:" + this.eid);
		System.out.println("Employee Salary:" + this.name);
		System.out.println("Employee address is :"+this.address);
		System.out.println("Project ID :" + this.project.getPid());
		System.out.println("Project Name:" + this.project.getName());
	}
}
