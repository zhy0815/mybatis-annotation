package com.zhy.model;

public class Student {
	private Integer id;
	private String name;
	private String sex;
	private Integer age;
	private Clazz clazz;// 学生和班级是多对一的关系，即一个学生只属于一个班级
	public Student() {
		super();
	}
	public Student(Integer id, String name, String sex, Integer age, Clazz clazz) {
		super();
		this.id = id;
		this.name = name;
		this.sex = sex;
		this.age = age;
		this.clazz = clazz;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public Clazz getClazz() {
		return clazz;
	}
	public void setClazz(Clazz clazz) {
		this.clazz = clazz;
	}
	public String printInfor() {
		return "id="+id+";name="+name+";sex="+sex+";age="+age;
	}
	@Override
	public String toString() {
		return "id="+id+";name="+name+";sex="+sex+";age="+age+"class="+clazz;
	}
}
