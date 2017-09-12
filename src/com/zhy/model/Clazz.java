package com.zhy.model;

import java.util.List;

public class Clazz {
	private Integer id;
	private String code;
	// 班级和学生是一对多的关系，即一个班级可以有多个学生
	private List<Student> students;
	public Clazz() {
		super();
	}
	public Clazz(Integer id, String code) {
		super();
		this.id = id;
		this.code = code;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public List<Student> getStudents() {
		return students;
	}
	public void setStudents(List<Student> students) {
		this.students = students;
	}
	@Override
	public String toString() {
		return "Clazz [id=" + id + ", code=" + code + "]";
	}
}
