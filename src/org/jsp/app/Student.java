package org.jsp.app;
import java.util.*;

public class Student {
	
	private int roolNo;
	private String name;
	private College clg;
	private List<String> subjects;
	
	
	public Student(int roolNo, String name, College clg) {
		super();
		this.roolNo = roolNo;
		this.name = name;
		this.clg = clg;
	}
	
	public Student(int roolNo, String name, College clg, List<String> subjects) {
		super();
		this.roolNo = roolNo;
		this.name = name;
		this.clg = clg;
		this.subjects = subjects;
	}

	public College getClg() {
		return clg;
	}
	public void setClg(College clg) {
		this.clg = clg;
	}
	public int getRoolNo() {
		return roolNo;
	}
	public void setRoolNo(int roolNo) {
		this.roolNo = roolNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student [roolNo=" + roolNo + ", name=" + name + ", clg=" + clg + ", subjects=" + subjects + "]";
	}
	

}
