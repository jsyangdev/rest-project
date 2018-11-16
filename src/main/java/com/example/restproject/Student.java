package com.example.restproject;
// Domain
public class Student {
	private int no;
	private int team;
	private String name;
	// default 생성자
	public Student() {}
	
	// 오버로딩 된 생성자
	public Student(int no, int team, String name) {
		super();
		this.no = no;
		this.team = team;
		this.name = name;
	}
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public int getTeam() {
		return team;
	}
	public void setTeam(int team) {
		this.team = team;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

}
