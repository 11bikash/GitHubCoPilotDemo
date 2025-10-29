package com.acc.lkm.springinjectiondemo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Component("project2")
public class Project {
	@Override
	public String toString() {
		return "Project [pid=" + pid + ", name=" + name + "]";
	}

	public Project(int pid, String name) {
		super();
		this.pid = pid;
		this.name = name;
		System.out.println(pid +" "+name);
	}
   @Value("20")
	private int pid;
   @Value("Java")
	private String name;

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Project() {
		super();
	}

}
