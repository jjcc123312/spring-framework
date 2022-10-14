package org.springframework.beans.factory.xml;

/**
 * @author Leo
 * @version 1.0
 * @className Student
 * @description TODO
 * @date 2022/10/11 14:04
 **/
public class Student implements Person {

	private String name;

	private Integer age;

	public Student(String name, Integer age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	@Override
	public String introduce() {
		return "我叫" + name + "，今年" + age + "岁";
	}
}
